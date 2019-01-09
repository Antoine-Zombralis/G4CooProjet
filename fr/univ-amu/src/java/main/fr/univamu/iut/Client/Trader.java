package fr.univamu.iut.Client;

import fr.univamu.iut.CompteBancaire;
import fr.univamu.iut.Produit.Arbre.Arbre;
import fr.univamu.iut.Produit.FruitEtLegume.Fruit;
import fr.univamu.iut.Produit.FruitEtLegume.Legume;
import fr.univamu.iut.Produit.Produits;
import fr.univamu.iut.Produit.ProduitsLaitier.ProduitLaitier;
import fr.univamu.iut.Produit.Viande.Viande;
import fr.univamu.iut.RépertoireVente;

import java.util.ArrayList;
import java.util.List;

/**
 * Classe trader qui est un client qui peut acheter et revendre des produits
 */
public class Trader extends Client {

    private List<Produits> mesProdtuisEnVente = new ArrayList<>();

    /**
     * @param nom
     * @param abonne
     * @param monComte
     * Contructeur de trader qui prend un paramêtre un nom, son état d'abonnement et son compte banquaire
     */
    public Trader(String nom, boolean abonne, CompteBancaire monComte) {
        super(nom, abonne, monComte);
    }

    /**
     * @param produit
     * fonction pour supprimer un produit de la liste de ses produits en vente en cas d'achat par exemple
     */
    @Override
    public void supprimerProduit(Produits produit) {
        mesProdtuisEnVente.remove(produit) ;
    }

    /**
     * @param produit
     * fonction pour ajouter un produit dans le liste des produis du traider lors d'un achat par exemple
     */
    public void acheterProduit(Produits produit){
        mesProdtuisEnVente.add(produit) ;
    }

    /**
     * fonction pour l'affichange de la liste des produits du trader
     */
    public void afficherMesProduitsAchetés() {
        System.out.println("Voici les achats de " + this.getNom() + ": ");
        for (Produits produit : getMesProduitsAchetes()){
            System.out.println(produit.getNom() + " --> " + produit.getQuantite() + " produits disponibles : \n \t Prix à l'unité : " + produit.getPrix() + "$ \n \t Prix total : " + produit.getPrix() * produit.getQuantite() + "$\n");
        }
    }


    /**
     * @param produits
     * @param répertoireVente
     * fonction pour ajouter un produit du trader sur le répertoire de vente. Selon le type du produit, il sera intégrer dans la liste correspondant
     * à son type
     */
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
                répertoireVente.ajouterProduit((ProduitLaitier)produit);
        }
    }
}

