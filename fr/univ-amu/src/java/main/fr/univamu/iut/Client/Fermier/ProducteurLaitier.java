package fr.univamu.iut.Client.Fermier;

import fr.univamu.iut.CompteBancaire;
import fr.univamu.iut.Controleur;
import fr.univamu.iut.Produit.Arbre.Arbre;
import fr.univamu.iut.Produit.Produits;
import fr.univamu.iut.Produit.ProduitsLaitier.Beurre;
import fr.univamu.iut.Produit.ProduitsLaitier.Fromage;
import fr.univamu.iut.Produit.ProduitsLaitier.Lait;
import fr.univamu.iut.Produit.ProduitsLaitier.ProduitLaitier;
import fr.univamu.iut.Produit.Vegetal;
import fr.univamu.iut.RépertoireVente;

import java.util.ArrayList;
import java.util.List;

/**
 * Classe qui gère les vendeurs de produit laitiers
 */
public class ProducteurLaitier extends Fermier {

    private List<ProduitLaitier> mesProductions = new ArrayList<>();
    private List<ProduitLaitier> mesProduitsCommercialisables = new ArrayList<>();


    /**
     * @param nom
     * @param abonne
     * @param monComte
     * Constructeur du producteur laitier qui prend en compte un nom un abonnement et un compte bancaire
     */
    public ProducteurLaitier(String nom, boolean abonne, CompteBancaire monComte) {
        super(nom, abonne, monComte);
    }

    public List<ProduitLaitier> getMesProductions() {
        return mesProductions;
    }

    /**
     * @param produit
     * Fonction qui ajoute un produit laitier à la liste des produits en vente du producteur
     */
    @Override
    public void ajouterCommercialisable(Produits produit) {
        if (produit.isConforme()) {
            mesProduitsCommercialisables.add((ProduitLaitier) produit);
        }
    }

    /**
     * Fonction qui permet d'afficher la liste des productions du producteur
     */
    @Override
    public void afficherMesProductions() {
        System.out.println("Voici les produits de " + this.getNom() + ": ");
        for (Produits produit : mesProductions) {
            System.out.println(produit.getNom() + " --> " + produit.getQuantite() + " produits disponibles : \n \t Prix à l'unité : " + produit.getPrix() + "$ \n \t Prix total : " + produit.getPrix() * produit.getQuantite() + "$\n");
        }
    }

    /**
     * Fonction qui permet d'afficher la liste des produits mis en vente par le producteur
     */
    @Override
    public void afficherCommercialisable() {
        System.out.println("Voici les produits commercialisables de " + this.getNom() + ": ");
        for (Produits produit : mesProduitsCommercialisables) {
            System.out.println(produit.getNom() + " --> " + produit.getQuantite() + " produits disponibles : \n \t Prix à l'unité : " + produit.getPrix() + "$ \n \t Prix total : " + produit.getPrix() * produit.getQuantite() + "$\n");
        }
    }

    /**
     * @param produitLaitier
     * Fonction qui supprime le produit en paramètre de la liste du producteur
     */
    @Override
    public void supprimerProduit(Produits produitLaitier) {
        mesProduitsCommercialisables.remove(produitLaitier);
    }

    /**
     * @param nbDeProduitsAGenerer
     * @return
     * Fonction qui génère une liste aléatoire de produits laitiers que possède le producteur
     */
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
        mesProductions.addAll(produits) ;

        return produits;
    }

    /**
     * @param produits
     * @param répertoireVente
     * Fonction qui ajoute le produit en paramètre dans le répertoire de vente séléctionné en paramètre
     */
    public void ajouterDansRépertoire(List<ProduitLaitier> produits, RépertoireVente répertoireVente)
    {
        Controleur controleur = new Controleur();
        for (ProduitLaitier produit : produits) {
            controleur.validerProduit(produit);
            this.ajouterCommercialisable(produit);
            répertoireVente.ajouterProduit(produit);
        }

    }

}
