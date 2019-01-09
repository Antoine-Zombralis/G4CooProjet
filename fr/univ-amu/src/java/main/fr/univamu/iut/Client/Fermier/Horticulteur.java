package fr.univamu.iut.Client.Fermier;

import fr.univamu.iut.CompteBancaire;
import fr.univamu.iut.Controleur;
import fr.univamu.iut.Produit.FruitEtLegume.*;
import fr.univamu.iut.Produit.Produits;
import fr.univamu.iut.Produit.Vegetal;
import fr.univamu.iut.RépertoireVente;

import java.util.ArrayList;
import java.util.List;

/**
 * Class horticulteur qui est une spécialisation de fermier qui produit des cagettes de végétaux
 */
public class Horticulteur extends Fermier {

    private List<Vegetal> mesProductions = new ArrayList<>();
    private List<Vegetal> mesProduitsCommercialisables = new ArrayList<>();

    /**
     * @param nom
     * @param abonne
     * @param monComte
     * constructeur de horticulteur qui prend en paramètre un nom, un état d'abonnement et un compte bancaire
     */
    public Horticulteur(String nom, boolean abonne, CompteBancaire monComte) {
        super(nom, abonne, monComte);
    }

    public List<Vegetal> getMesProductions() {
        return mesProductions;
    }

    /**
     * @param produit
     * fonction qui permet à l'horticulteur de passer ses productions en produit commercialisable en vérifiant la conformité des produits
     */
    @Override
    public void ajouterCommercialisable(Produits produit) {
        if (produit.isConforme())
            mesProduitsCommercialisables.add((Vegetal) produit);
    }

    /**
     * fonction qui permet d'afficher tous les produits qu'il a généré
     */
    @Override
    public void afficherMesProductions() {
        System.out.println("Voici les produits de " + this.getNom() + ": ");
        for (Produits produit : mesProductions) {
            System.out.println(produit.getNom() + " --> " + produit.getQuantite() + " produits disponibles : \n \t Prix à l'unité : " + produit.getPrix() + "$ \n \t Prix total : " + produit.getPrix() * produit.getQuantite() + "$\n");
        }
    }

    /**
     * fonction qui permet d'afficher tous les produits commercialisables de l'horticulteur
     */
    @Override
    public void afficherCommercialisable() {
        System.out.println("Voici les produits commercialisables de " + this.getNom() + ": ");
        for (Produits produit : mesProduitsCommercialisables) {
            System.out.println(produit.getNom() + " --> " + produit.getQuantite() + " produits disponibles : \n \t Prix à l'unité : " + produit.getPrix() + "$ \n \t Prix total : " + produit.getPrix() * produit.getQuantite() + "$\n");
        }
    }

    /**
     * @param vegetal
     * fonction qui permet de supprimer un produit de la la liste des produits commercialisables de l'horticulteur (par exemple lors de
     * la vente d'un de ses produits)
     */
    @Override
    public void supprimerProduit(Produits vegetal) {
        mesProduitsCommercialisables.remove(vegetal);
    }

    /**
     * @param nbDeProduitsAGenerer
     * fonction qui génère de façon aléatoire parmis des produits qui constitueront la liste des produits générés par l'horticulteur
     * @return
     */
    public List<Vegetal> generationVegetalAleatoire(int nbDeProduitsAGenerer) {
        List<Vegetal> produits = new ArrayList<>();

        int cptAubergine = 0 ; // compteur pour régler la quantité du produit
        int cptCarotte = 0 ;
        int cptChou = 0 ;
        int cptFraise = 0 ;
        int cptPoire = 0 ;
        int cptPomme = 0 ;
        for (int i = 0; i < nbDeProduitsAGenerer; i++) {
            double alea = Math.random() ;
            if (alea < 0.166) // générer de façon aléatoire des produits
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
        CagetteAubergine aubergine = new CagetteAubergine.BuilderProduits(cptAubergine, 2, "Cagette d'aubergines") // construire les produits avec la bonne quantité
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
        produits.add(aubergine) ; // ajouter le produit dans la liste des produits générés de l'horticulteur
        produits.add(carotte) ;
        produits.add(chou) ;
        produits.add(fraise) ;
        produits.add(poire) ;
        produits.add(pomme) ;

        mesProductions.addAll(produits);
        return produits;
    }

    /**
     * @param produits
     * @param répertoireVente
     * fonction qui permet à l'horticulteur d'ajouter ses produits commercialisables au répertoire de vente (qui contient la liste de tous
     * les produits à la vente) dans la liste qui correspond au bon type
     */
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