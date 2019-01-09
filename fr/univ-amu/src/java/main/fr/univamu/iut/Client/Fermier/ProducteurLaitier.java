package fr.univamu.iut.Client.Fermier;

import fr.univamu.iut.CompteBancaire;
import fr.univamu.iut.Produit.Arbre.Arbre;
import fr.univamu.iut.Produit.Produits;
import fr.univamu.iut.Produit.ProduitsLaitier.ProduitLaitier;
import fr.univamu.iut.Produit.Vegetal;

import java.util.ArrayList;
import java.util.List;

public class ProducteurLaitier extends Fermier {

    private List<ProduitLaitier> mesProductions = new ArrayList<>();
    private List<ProduitLaitier> mesProduitsCommercialisables = new ArrayList<>() ;


    public ProducteurLaitier(String nom, boolean abonne, CompteBancaire monComte) {
        super(nom, abonne, monComte);
    }

    public void produireProduitsLaitier(List <ProduitLaitier> produitLaitier) {
        mesProductions.addAll(produitLaitier);
    }

    public List<ProduitLaitier> getMesProductions() {
        return mesProductions;
    }

    @Override
    public void ajouterCommercialisable(Produits produit) {
        if(produit.isConforme()){
            mesProduitsCommercialisables.add((ProduitLaitier) produit);
        }
    }

    @Override
    public void afficherMesProductions() {
        System.out.println("Voici les produits de " + this.getNom() + ": ");
        for (Produits produit : mesProductions){
            System.out.println(produit.getNom() + " --> " + produit.getQuantite() + " produits disponibles : \n \t Prix à l'unité : " + produit.getPrix() + "$ \n \t Prix total : " + produit.getPrix() * produit.getQuantite() + "$\n");
        }
    }

    @Override
    public void afficherCommercialisable() {
        System.out.println("Voici les produits commercialisables de " + this.getNom() + ": ");
        for (Produits produit : mesProduitsCommercialisables){
            System.out.println(produit.getNom() + " --> " + produit.getQuantite() + " produits disponibles : \n \t Prix à l'unité : " + produit.getPrix() + "$ \n \t Prix total : " + produit.getPrix() * produit.getQuantite() + "$\n");
        }
    }

    @Override
    public void supprimerProduit(Produits produitLaitier) {
        for (ProduitLaitier produitLaitierCourant: mesProduitsCommercialisables)
            if (produitLaitier.equals(produitLaitierCourant))
                mesProduitsCommercialisables.remove(produitLaitier) ;
    }
}
