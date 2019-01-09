package fr.univamu.iut.Client.Fermier;

import fr.univamu.iut.CompteBancaire;
import fr.univamu.iut.Controleur;
import fr.univamu.iut.Produit.Arbre.Arbre;
import fr.univamu.iut.Produit.Enum.CategorieCochon;
import fr.univamu.iut.Produit.Enum.CategorieVache;
import fr.univamu.iut.Produit.Enum.CategorieVolaille;
import fr.univamu.iut.Produit.Enum.EnumLabel;
import fr.univamu.iut.Produit.Produits;
import fr.univamu.iut.Produit.Vegetal;
import fr.univamu.iut.Produit.Viande.Cochon;
import fr.univamu.iut.Produit.Viande.Vache;
import fr.univamu.iut.Produit.Viande.Viande;
import fr.univamu.iut.Produit.Viande.Volaille;
import fr.univamu.iut.RépertoireVente;

import java.util.ArrayList;
import java.util.List;

/**
 * Classe qui gère les producteurs de viande
 */
public class ProducteurDeViande extends Fermier {

    private List<Viande> mesProductions = new ArrayList<>();
    private List<Viande> mesProduitsCommercialisables = new ArrayList<>() ;


    /**
     * @param nom
     * @param abonne
     * @param monComte
     * Constructeur du producteur de viande qui prend en compte un nom un abonnement et un compte bancaire
     */
    public ProducteurDeViande(String nom, boolean abonne, CompteBancaire monComte) {
        super(nom, abonne, monComte);
    }


    public List<Viande> getMesProductions() {
        return mesProductions;
    }

    /**
     * @param produit
     * Fonction qui ajoute un produit laitier à la liste des produits en vente du producteur
     */
    @Override
    public void ajouterCommercialisable(Produits produit) {
        if(produit.isConforme()){
            mesProduitsCommercialisables.add((Viande) produit);
        }
    }

    /**
     * Fonction qui permet d'afficher la liste des productions du producteur
     */
    @Override
    public void afficherMesProductions() {
        System.out.println("Voici les produits de " + this.getNom() + ": ");
        for (Produits produit : mesProductions){
            System.out.println(produit.getNom() + " --> " + produit.getQuantite() + " produits disponibles : \n \t Prix à l'unité : " + produit.getPrix() + "$ \n \t Prix total : " + produit.getPrix() * produit.getQuantite() + "$\n");
        }
    }

    /**
     * Fonction qui permet d'afficher la liste des produits mis en vente par le producteur
     */
    @Override
    public void afficherCommercialisable() {
        System.out.println("Voici les produits commercialisables de " + this.getNom() + ": ");
        for (Produits produit : mesProduitsCommercialisables){
            System.out.println(produit.getNom() + " --> " + produit.getQuantite() + " produits disponibles : \n \t Prix à l'unité : " + produit.getPrix() + "$ \n \t Prix total : " + produit.getPrix() * produit.getQuantite() + "$\n");
        }
    }

    /**
     * @param viande
     * Fonction qui supprime le produit en paramètre de la liste du producteur
     */
    @Override
    public void supprimerProduit(Produits viande) {
                mesProduitsCommercialisables.remove(viande) ;
    }

    /**
     * @param nbDeProduitsAGenerer
     * @param label
     * @param categorieCochon
     * @param categorieVolaille
     * @param categorieVache
     * @return
     * Fonction qui génère une liste aléatoire de viandes de différentes catégories que possède le producteur
     */
    public List<Viande> generationViandeAleatoire(int nbDeProduitsAGenerer, EnumLabel label, CategorieCochon categorieCochon, CategorieVolaille categorieVolaille, CategorieVache categorieVache) {
        List<Viande> produits = new ArrayList<>();

        int cptCochon = 0 ;
        int cptVolaille = 0 ;
        int cptVache = 0 ;
        for (int i = 0; i < nbDeProduitsAGenerer; i++) {
            double alea = Math.random() ;
            if (alea < 0.33)
                ++cptCochon ;
            else if (alea > 0.33 && alea <0.66)
                ++cptVache ;
            else
                ++cptVolaille ;
        }
        Cochon cochon = new Cochon.BuilderProduits(cptCochon, 24, "Entrecote de porc")
                .addLabel(label)
                .addCategorieCochon(categorieCochon)
                .addProprio(this)
                .cochonBuild();
        Vache vache = new Vache.BuilderProduits(cptVache, 36 , "Steack de vache")
                .addLabel(label)
                .addCategorieVache(categorieVache)
                .addProprio(this)
                .vacheBuild();
        Volaille volaille = new Volaille.BuilderProduits(cptVolaille, 15, "Poulet fermier")
                .addLabel(label)
                .addCategorieVolaille(categorieVolaille)
                .addProprio(this)
                .volailleBuild();

        produits.add(cochon) ;
        produits.add(vache) ;
        produits.add(volaille) ;
        mesProductions.addAll(produits) ;
        return produits;
    }

    /**
     * @param produits
     * @param répertoireVente
     * Fonction qui ajoute le produit en paramètre dans le répertoire de vente séléctionné en paramètre
     */
    public void ajouterDansRépertoire(List<Viande> produits, RépertoireVente répertoireVente)
    {
        Controleur controleur = new Controleur();
        for (Viande produit : produits) {
            controleur.validerProduit(produit);
            this.ajouterCommercialisable(produit);
            répertoireVente.ajouterProduit(produit);
        }

    }
}
