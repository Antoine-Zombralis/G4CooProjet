package fr.univamu.iut.Client;

import fr.univamu.iut.Client.Client;
import fr.univamu.iut.CompteBancaire;
import fr.univamu.iut.Produit.Arbre.Arbre;
import fr.univamu.iut.Produit.FruitEtLegume.Fruit;
import fr.univamu.iut.Produit.FruitEtLegume.Legume;
import fr.univamu.iut.Produit.Produits;
import fr.univamu.iut.Produit.ProduitsLaitier.ProduitLaitier;
import fr.univamu.iut.Produit.Vegetal;
import fr.univamu.iut.Produit.Viande.Viande;
import fr.univamu.iut.RépertoireVente;

import java.util.ArrayList;
import java.util.List;

public class Trader extends Client {

    private List<Produits> mesProdtuisEnVente = new ArrayList<>();

    public Trader(String nom, boolean abonne, CompteBancaire monComte) {
        super(nom, abonne, monComte);
    }

    @Override
    public void supprimerProduit(Produits produit) {
        mesProdtuisEnVente.remove(produit) ;
    }

    public void acheterProduit(Produits produit){
        mesProdtuisEnVente.add(produit) ;
    }

    public void afficherMesProduitsAchetés() {
        System.out.println("Voici les achats de " + this.getNom() + ": ");
        for (Produits produit : getMesProduitsAchetes()){
            System.out.println(produit.getNom() + " --> " + produit.getQuantite() + " produits disponibles : \n \t Prix à l'unité : " + produit.getPrix() + "$ \n \t Prix total : " + produit.getPrix() * produit.getQuantite() + "$\n");
        }
    }



    public void mettreEnVente(ArrayList<Produits> produits, RépertoireVente répertoireVente) {
        for (Produits produit : produits){
            if (produit instanceof Legume)
                répertoireVente.ajouterProduit((Legume)produit);
            else if (produit instanceof Fruit)
                répertoireVente.ajouterProduit((Fruit)produit);
            else if (produit instanceof Viande)
                répertoireVente.ajouterProduit((Viande)produit);
            else if (produit instanceof Arbre)
                répertoireVente.ajouterProduit((Arbre)produit);
            else if (produit instanceof ProduitLaitier)
                répertoireVente.ajouterProduit((ProduitLaitier)produit); ;
        }




    }

}

