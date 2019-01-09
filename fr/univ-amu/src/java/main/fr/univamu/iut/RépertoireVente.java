package fr.univamu.iut;

import fr.univamu.iut.Produit.Arbre.Arbre;
import fr.univamu.iut.Produit.FruitEtLegume.Fruit;
import fr.univamu.iut.Produit.FruitEtLegume.Legume;
import fr.univamu.iut.Produit.Produits;
import fr.univamu.iut.Produit.ProduitsLaitier.ProduitLaitier;
import fr.univamu.iut.Produit.Vegetal;
import fr.univamu.iut.Produit.Viande.Viande;

import java.util.ArrayList;

/**
 * Classe qui contient toutes les listes de produits disponibles sur le marchéé fermier
 */
public class RépertoireVente {
    private ArrayList<Vegetal> fruitsEnVente = new ArrayList<>();
    private ArrayList<Vegetal> legumesEnVente = new ArrayList<>();
    private ArrayList<Viande> viandesEnVente = new ArrayList<>();
    private ArrayList<Arbre> arbresEnVente = new ArrayList<>();
    private ArrayList<ProduitLaitier> produitLaitiersEnVente = new ArrayList<>();

    /**
     * Constructeur par défautlt
     */
    public RépertoireVente() {

    }

    public ArrayList<Vegetal> getFruitsEnVente() {
        return fruitsEnVente;
    }

    public void setFruitsEnVente(ArrayList<Vegetal> fruitsEnVente) {
        this.fruitsEnVente = fruitsEnVente;
    }

    public ArrayList<Vegetal> getLegumesEnVente() {
        return legumesEnVente;
    }

    public void setLegumesEnVente(ArrayList<Vegetal> legumesEnVente) {
        this.legumesEnVente = legumesEnVente;
    }

    public ArrayList<Viande> getViandesEnVente() {
        return viandesEnVente;
    }

    public void setViandesEnVente(ArrayList<Viande> viandesEnVente) {
        this.viandesEnVente = viandesEnVente;
    }

    public ArrayList<Arbre> getArbresEnVente() {
        return arbresEnVente;
    }

    public void setArbresEnVentee(ArrayList<Arbre> arbresEnVente) {
        this.arbresEnVente = arbresEnVente;
    }

    public ArrayList<ProduitLaitier> getProduitLaitiersEnVente() {
        return produitLaitiersEnVente;
    }

    public void setProduitLaitiersEnVente(ArrayList<ProduitLaitier> produitLaitiersEnVente) {
        this.produitLaitiersEnVente = produitLaitiersEnVente;
    }



    /**
     * @param produit
     * Cette fonction ajoute un projduit dans la liste des produits en vente. Pour cela, la fonction verifie le type de l'objet et l'intègre dans
     * la liste qui correspond à son type.
     */
    public void ajouterProduit(Produits produit) {
        if (produit instanceof Legume)
            legumesEnVente.add((Legume) produit);
        else if (produit instanceof Fruit)
            fruitsEnVente.add((Fruit) produit);
        else if (produit instanceof Viande)
            viandesEnVente.add((Viande)produit);
        else if(produit instanceof Arbre)
            arbresEnVente.add((Arbre) produit);
        else{
            produitLaitiersEnVente.add((ProduitLaitier) produit);
        }

    }

    /**
     * @param fruit
     * Fcnctions qui suppriment un produit du répertoire quand il est acheté ou plus en vente
     */
    public void supprimerFruit(Fruit fruit) {
                fruitsEnVente.remove(fruit) ;
    }
    public void supprimerViande(Viande viande) {
                viandesEnVente.remove(viande) ;
    }
    public void supprimerLegume(Legume legume) {
                legumesEnVente.remove(legume) ;
    }
    public void supprimerArbre(Arbre arbre) {
        legumesEnVente.remove(arbre) ;
    }
    public void supprimerProduitsLaitiers(ProduitLaitier produitLaitier) {
        legumesEnVente.remove(produitLaitier) ;
    }


    /**
     * Fonctions qui gèrent l'affichage terminal pour présenter les produits à la vente
     */
    public void afficherEtalageLegume() {
        System.out.println("============== LEGUMES EN VENTE ============== ");
        for (Vegetal legume : legumesEnVente)
            System.out.println("Il y a " + legume.getQuantite() + "  " + legume.getNom() + " à " + legume.getPrix() + "$ " + " proposé par  " + legume.getProprietaire().getNom());
        System.out.println("\n");
    }

    public void afficherEtalageFruit() {
        System.out.println("============== FRUITS EN VENTE ============== ");

        for (Vegetal fruit : fruitsEnVente)
            System.out.println("Il y a " + fruit.getQuantite() + " " + fruit.getNom() + " à " + fruit.getPrix() + "$ "+ " proposé par  " + fruit.getProprietaire().getNom());
        System.out.println("\n");
    }

    public void afficherEtalageArbre() {
        System.out.println("============== ARBRES EN VENTE ============== ");
        for (Arbre arbre : arbresEnVente)
            System.out.println("Il y a " + arbre.getQuantite() + "  " + arbre.getNom() + " à " + arbre.getPrix() + "$ " + " proposé par  " + arbre.getProprietaire().getNom());
        System.out.println("\n");
    }

    public void afficherEtalageViande() {
        System.out.println("============== VIANDES EN VENTE ============== ");
        for (Viande viande : viandesEnVente)
            System.out.println("Il y a  " + viande.getQuantite() + "  " + viande.getNom() + " à " + viande.getPrix() + "$ " + " proposé par  " + viande.getProprietaire().getNom());
        System.out.println("\n");
    }

    public void afficherEtalageProduitLaitier() {
        System.out.println("============== PRODUITS LAITIERS EN VENTE ============== ");
        for (ProduitLaitier produitLaitier : produitLaitiersEnVente)
            System.out.println("Il y a  " + produitLaitier.getQuantite() + "  " + produitLaitier.getNom() + " à " + produitLaitier.getPrix() + "$ " + " proposé par  " + produitLaitier.getProprietaire().getNom());
        System.out.println("\n");
    }
}
