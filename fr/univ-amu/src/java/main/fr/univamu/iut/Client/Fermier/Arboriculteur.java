package fr.univamu.iut.Client.Fermier;

import fr.univamu.iut.Controleur;
import fr.univamu.iut.Produit.Arbre.*;
import fr.univamu.iut.CompteBancaire;
import fr.univamu.iut.Produit.Produits;
import fr.univamu.iut.RépertoireVente;
import java.util.ArrayList;
import java.util.List;

/**
 * Class Arboriculteur qui est une spécialisation de fermier qui produit des arbres
 */
public class Arboriculteur extends Fermier {

    private List<Arbre> mesProductions = new ArrayList<>() ;
    private List<Arbre> mesProduitsCommercialisables = new ArrayList<>() ;

    /**
     * @param nom
     * @param abonne
     * @param monComte
     * constructeur d'arboriculteur qui prend en paramètre un nom, un état d'abonnement et un compte bancaire
     */
    public Arboriculteur(String nom, boolean abonne, CompteBancaire monComte) {
        super(nom, abonne, monComte);
    }

    /**
     * @param produit
     * fonction qui permet à l'arboriculteur de passer ses productions en produit commercialisable en vérifiant la conformité des produits
     */
    @Override
    public void ajouterCommercialisable(Produits produit) {
        if(produit.isConforme()){
            mesProduitsCommercialisables.add((Arbre) produit);
        }
    }
    /**
     * fonction qui permet d'afficher tous les produits commercialisables de l'horticulteur
     */
    @Override
    public void afficherCommercialisable() {
        System.out.println("Voici les produits commercialisables de " + this.getNom() + ": ");
        for (Produits produit : mesProduitsCommercialisables){
            System.out.println(produit.getNom() + " --> " + produit.getQuantite() + " produits disponibles : \n \t Prix à l'unité : " + produit.getPrix() + "$ \n \t Prix total : " + produit.getPrix() * produit.getQuantite() + "$\n");
        }
    }

    /**
     * fonction qui permet d'afficher tous les produits qu'il a généré
     */
    @Override
    public void afficherMesProductions() {
        System.out.println("Voici les produits de " + this.getNom() + ": ");
        for (Produits produit : mesProductions){
            System.out.println(produit.getNom() + " --> " + produit.getQuantite() + " produits disponibles : \n \t Prix à l'unité : " + produit.getPrix() + "$ \n \t Prix total : " + produit.getPrix() * produit.getQuantite() + "$\n");
        }
    }
    /**
     * @param arbre
     * fonction qui permet de supprimer un produit de la la liste des produits commercialisables de l'arboriculteur (par exemple lors de
     * la vente d'un de ses produits)
     */
    @Override
    public void supprimerProduit(Produits arbre) {
                mesProduitsCommercialisables.remove(arbre) ;
    }


    /**
     * @param nbDeProduitsAGenerer
     * fonction qui génère de façon aléatoire parmis des produits qui constitueront la liste des produits générés par l'horticulteur
     * @return
     */
    public  List<Arbre> generationArbreAleatoire(int nbDeProduitsAGenerer) {
        List<Arbre> produits = new ArrayList<>();
        int cptRosier = 0; // compteur pour régler la quantité du produit
        int cptBanzai = 0;
        int cptSapin = 0;
        int cptPommier = 0;
        for (int i = 0; i < nbDeProduitsAGenerer; i++) {
            double alea = Math.random();
            if (alea < 0.25)
                ++cptRosier;
            else if (alea > 0.25 && alea < 0.5) // générer de façon aléatoire des produits
                ++cptBanzai;
            else if (alea > 0.50 && alea < 0.75)
                ++cptSapin;
            else
                ++cptPommier;
        }
        Rosier rosier = new Rosier.BuilderProduits(cptRosier, 45 , "Rosier fleurie")  // construire les produits avec la bonne quantité
                .addProprio(this)
                .rosierBuid();
        Pommier pommier = new Pommier.BuilderProduits(cptPommier, 250, "Pommier d'Alsace")
                .addProprio(this)
                .pommierBuild();
        Sapin sapin = new Sapin.BuilderProduits(cptSapin, 25, "Sapin de Noel")
                .addProprio(this)
                .sapinBuild();
        Banzai banzai = new Banzai.BuilderProduits(cptBanzai, 15, "Banzai")
                .addProprio(this)
                .banzaiBuild();
        produits.add(rosier); // ajouter le produit dans la liste des produits générés de l'arboriculteur
        produits.add(pommier);
        produits.add(sapin);
        produits.add(banzai);
        mesProductions.addAll(produits) ;
        return produits;
    }

    /**
     * @param produits
     * @param répertoireVente
     * fonction qui permet à l'arboriculteur d'ajouter ses produits commercialisables au répertoire de vente (qui contient la liste de tous
     * les produits à la vente) dans la liste qui correspond au bon type
     */
    public void ajouterDansRépertoire(List<Arbre> produits, RépertoireVente répertoireVente)
    {
        Controleur controleur = new Controleur();
        for (Arbre produit : produits) {
            controleur.validerProduit(produit);
            this.ajouterCommercialisable(produit);
            répertoireVente.ajouterProduit(produit);
        }
    }

    public List<Arbre> getMesProductions() {
        return mesProductions;
    }


}