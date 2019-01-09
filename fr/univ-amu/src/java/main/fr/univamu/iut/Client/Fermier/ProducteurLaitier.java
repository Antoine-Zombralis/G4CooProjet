package fr.univamu.iut.Client.Fermier;

import fr.univamu.iut.CompteBancaire;
import fr.univamu.iut.Produit.Arbre.Arbre;
import fr.univamu.iut.Produit.Produits;
import fr.univamu.iut.Produit.ProduitsLaitier.Beurre;
import fr.univamu.iut.Produit.ProduitsLaitier.Fromage;
import fr.univamu.iut.Produit.ProduitsLaitier.Lait;
import fr.univamu.iut.Produit.ProduitsLaitier.ProduitLaitier;
import fr.univamu.iut.Produit.Vegetal;

import java.util.ArrayList;
import java.util.List;

public class ProducteurLaitier extends Fermier {

    private List<ProduitLaitier> mesProductions = new ArrayList<>();
    private List<ProduitLaitier> mesProduitsCommercialisables = new ArrayList<>();


    public ProducteurLaitier(String nom, boolean abonne, CompteBancaire monComte) {
        super(nom, abonne, monComte);
    }

    public void produireProduitsLaitier(List<ProduitLaitier> produitLaitier) {
        mesProductions.addAll(produitLaitier);
    }

    public List<ProduitLaitier> getMesProductions() {
        return mesProductions;
    }

    @Override
    public void ajouterCommercialisable(Produits produit) {
        if (produit.isConforme()) {
            mesProduitsCommercialisables.add((ProduitLaitier) produit);
        }
    }

    @Override
    public void afficherMesProductions() {
        System.out.println("Voici les produits de " + this.getNom() + ": ");
        for (Produits produit : mesProductions) {
            System.out.println(produit.getNom() + " --> " + produit.getQuantite() + " produits disponibles : \n \t Prix à l'unité : " + produit.getPrix() + "$ \n \t Prix total : " + produit.getPrix() * produit.getQuantite() + "$\n");
        }
    }

    @Override
    public void afficherCommercialisable() {
        System.out.println("Voici les produits commercialisables de " + this.getNom() + ": ");
        for (Produits produit : mesProduitsCommercialisables) {
            System.out.println(produit.getNom() + " --> " + produit.getQuantite() + " produits disponibles : \n \t Prix à l'unité : " + produit.getPrix() + "$ \n \t Prix total : " + produit.getPrix() * produit.getQuantite() + "$\n");
        }
    }

    @Override
    public void supprimerProduit(Produits produitLaitier) {
        mesProduitsCommercialisables.remove(produitLaitier);
    }

    public List<ProduitLaitier> generationProduitLaitierAleatoire(int nbDeProduitsAGenerer) {
        List<ProduitLaitier> produits = new ArrayList<>();
        int cptLait = 0 ;
        int cptFromage = 0 ;
        int cptBeurre = 0 ;
        for (int i = 0; i < nbDeProduitsAGenerer; i++) {
            double alea = Math.random() ;
            if (alea < 0.33)
                ++cptLait ;
            else if (alea > 0.33 && alea <0.66)
                ++cptBeurre ;
            else
                ++cptFromage ;
        }
        Lait lait = new Lait.BuilderProduits(cptLait, 1.33, "Lait demi-écrémé")
                .addProprio(this)
                .laitBuild();
        Beurre beurre = new Beurre.BuilderProduits(cptBeurre, 2, "Barquette de beurre")
                .addProprio(this)
                .beurreBuild();
        Fromage fromage = new Fromage.BuilderProduits(cptFromage, 45, "Fromage de brebis")
                .addProprio(this)
                .fromageBuild();
        produits.add(lait) ;
        produits.add(beurre) ;
        produits.add(fromage) ;
        return produits;
    }

}
