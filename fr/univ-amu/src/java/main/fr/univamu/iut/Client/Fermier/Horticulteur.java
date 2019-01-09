package fr.univamu.iut.Client.Fermier;

import fr.univamu.iut.CompteBancaire;
import fr.univamu.iut.Controleur;
import fr.univamu.iut.Produit.Arbre.Arbre;
import fr.univamu.iut.Produit.FruitEtLegume.*;
import fr.univamu.iut.Produit.Produits;
import fr.univamu.iut.Produit.Vegetal;
import fr.univamu.iut.RépertoireVente;

import java.util.ArrayList;
import java.util.List;

public class Horticulteur extends Fermier {

    private List<Vegetal> mesProductions = new ArrayList<>();
    private List<Vegetal> mesProduitsCommercialisables = new ArrayList<>();


    public Horticulteur(String nom, boolean abonne, CompteBancaire monComte) {
        super(nom, abonne, monComte);
    }


    public List<Vegetal> getMesProductions() {
        return mesProductions;
    }

    @Override
    public void ajouterCommercialisable(Produits produit) {
        if (produit.isConforme()) {
            mesProduitsCommercialisables.add((Vegetal) produit);
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
    public void supprimerProduit(Produits vegetal) {
        mesProduitsCommercialisables.remove(vegetal);
    }

    public List<Vegetal> generationVegetalAleatoire(int nbDeProduitsAGenerer) {
        List<Vegetal> produits = new ArrayList<>();

        int cptAubergine = 0 ;
        int cptCarotte = 0 ;
        int cptChou = 0 ;
        int cptFraise = 0 ;
        int cptPoire = 0 ;
        int cptPomme = 0 ;
        for (int i = 0; i < nbDeProduitsAGenerer; i++) {
            double alea = Math.random() ;
            if (alea < 0.166)
                ++cptAubergine ;
            else if (alea > 0.166 && alea < 0.333)
                ++cptCarotte ;
            else if (alea > 0.333 && alea < 0.5)
                ++cptChou ;
            else if (alea > 0.5 && alea < 0.666)
                ++cptFraise ;
            else if (alea > 0.666 && alea < 0.833)
                ++cptPoire ;
            else
                ++cptPomme ;
        }
        CagetteAubergine aubergine = new CagetteAubergine.BuilderProduits(cptAubergine, 2, "Cagette d'aubergines")
                .addProprio(this)
                .aubergineBuild();
        CagetteCarotte carotte = new CagetteCarotte.BuilderProduits(cptCarotte, 2, "Cagette de carottes")
                .addProprio(this)
                .carotteBuild();
        CagetteChou chou = new CagetteChou.BuilderProduits(cptChou, 1.25, "Cagette de chou")
                .addProprio(this)
                .chouBuild();
        CagetteFraise fraise = new CagetteFraise.BuilderProduits(cptFraise, 13, "Cagette de fraises")
                .addProprio(this)
                .fraiseBuild();
        CagettePoire poire = new CagettePoire.BuilderProduits(cptPoire, 8, "Cagette de poires")
                .addProprio(this)
                .poireBuild() ;
        CagettePomme pomme = new CagettePomme.BuilderProduits(cptPomme, 5, "Cagette de pommes")
                .addProprio(this)
                .pommeBuild() ;
        produits.add(aubergine) ;
        produits.add(carotte) ;
        produits.add(chou) ;
        produits.add(fraise) ;
        produits.add(poire) ;
        produits.add(pomme) ;

        mesProductions.addAll(produits);
        return produits;
    }

    public void ajouterDansRépertoire(List<Vegetal> produits, RépertoireVente répertoireVente)
    {
        Controleur controleur = new Controleur();
        for (Vegetal produit : produits) {
            controleur.validerProduit(produit);
            this.ajouterCommercialisable(produit);
            répertoireVente.ajouterProduit(produit);
        }

    }
}