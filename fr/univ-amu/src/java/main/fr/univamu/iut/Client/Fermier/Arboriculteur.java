package fr.univamu.iut.Client.Fermier;

import fr.univamu.iut.Produit.Arbre.*;
import fr.univamu.iut.CompteBancaire;
import fr.univamu.iut.Produit.Produits;
import fr.univamu.iut.Produit.Vegetal;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Arboriculteur extends Fermier {

    private List<Arbre> mesProductions = new ArrayList<>() ;
    private List<Arbre> mesProduitsCommercialisables = new ArrayList<>() ;

    public Arboriculteur(String nom, boolean abonne, CompteBancaire monComte) {
        super(nom, abonne, monComte);
    }

    @Override
    public void ajouterCommercialisable(Produits produit) {
        if(produit.isConforme()){
            mesProduitsCommercialisables.add((Arbre) produit);
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
    public void afficherMesProductions() {
        System.out.println("Voici les produits de " + this.getNom() + ": ");
        for (Produits produit : mesProductions){
            System.out.println(produit.getNom() + " --> " + produit.getQuantite() + " produits disponibles : \n \t Prix à l'unité : " + produit.getPrix() + "$ \n \t Prix total : " + produit.getPrix() * produit.getQuantite() + "$\n");
        }
    }

    @Override
    public void supprimerProduit(Produits arbre) {
                mesProduitsCommercialisables.remove(arbre) ;
    }

    public void produireArbre(List<Arbre> arbre){
        mesProductions.addAll(arbre);
    }

    public  List<Arbre> generationArbreAleatoire(int nbDeProduitsAGenerer) {
        List<Arbre> produits = new ArrayList<>();
        int cptRosier = 0;
        int cptBanzai = 0;
        int cptSapin = 0;
        int cptPommier = 0;
        for (int i = 0; i < nbDeProduitsAGenerer; i++) {
            double alea = Math.random();
            if (alea < 0.25)
                ++cptRosier;
            else if (alea > 0.25 && alea < 0.5)
                ++cptBanzai;
            else if (alea > 0.50 && alea < 0.75)
                ++cptSapin;
            else
                ++cptPommier;
        }
        Rosier rosier = new Rosier.BuilderProduits(cptRosier, 45 , "Rosier fleurie")
                .addProprio(this)
                .rosierBuid();
        Pommier pommier = new Pommier.BuilderProduits(cptPommier, 250, "Pommier d'Alsace")
                .addProprio(this)
                .pommierBuild();
        Sapin sapin = new Sapin.BuilderProduits(cptSapin, 25, "Sapin de Noel")
                .addProprio(this)
                .sapinBuild();
        Banzai banzai = new Banzai.BuilderProduits(cptBanzai, 15, "Banzai")
                .banzaiBuild();
        produits.add(rosier);
        produits.add(pommier);
        produits.add(sapin);
        produits.add(banzai);

        return produits;
    }

    public List<Arbre> getMesProductions() {
        return mesProductions;
    }


}