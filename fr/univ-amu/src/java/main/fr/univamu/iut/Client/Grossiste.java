package fr.univamu.iut.Client;

import fr.univamu.iut.CompteBancaire;
import fr.univamu.iut.Produit.Produits;


/**
 * Class grossiste qui correspond à un client qui achete en grande quantité
 */
public class Grossiste extends Client {

    /**
     * @param nom
     * @param abonne
     * @param monComte
     * Constructeur de la classe grossiste qui prend un nom, un état pour l'abonnement et un compte bancaire
     */
    public Grossiste(String nom, boolean abonne, CompteBancaire monComte) {
        super(nom, abonne, monComte);
    }

    /**
     * @param produit
     * fonction qui permet de supprimer un produit de la liste des produits acheté du grossite (par exemple lors d'une vente)
     */
    @Override
    public void supprimerProduit(Produits produit) {
        getMesProduitsAchetes().remove(produit);
    }

    /**
     * fonction qui permet d'afficher la liste des produits achetés par le grossiste
     */
    public void afficherMesProduitsAchetés() {
        System.out.println("Voici les achats de " + this.getNom() + ": ");
        for (Produits produit : getMesProduitsAchetes()){
            System.out.println(produit.getNom() + " --> " + produit.getQuantite() + " produits disponibles : \n \t Prix à l'unité : " + produit.getPrix() + "$ \n \t Prix total : " + produit.getPrix() * produit.getQuantite() + "$\n");
        }
    }
}