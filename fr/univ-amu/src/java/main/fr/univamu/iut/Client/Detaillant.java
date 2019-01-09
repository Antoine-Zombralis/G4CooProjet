package fr.univamu.iut.Client;

import fr.univamu.iut.CompteBancaire;
import fr.univamu.iut.Produit.Produits;

/**
 * Classe qui correspond à un client qui achete au détail sur les marché pour sa consommation personelle et non pour le commerce
 */
public class Detaillant extends Client {

    /**
     * @param nom
     * @param abonne
     * @param monComte
     * Constructeur de détaillant qui prend en paramètre un nom, un état d'abonnement  et un compte banquaire
     */
    public Detaillant(String nom, boolean abonne, CompteBancaire monComte) {
        super(nom, abonne, monComte);
    }

    /**
     * @param produit
     * fonction permet de supprimer un produit de la liste des produits achetés du client
     */
    @Override
    public void supprimerProduit(Produits produit) {
        getMesProduitsAchetes().remove(produit) ;
    }

    /**
     * fonction pour afficher la liste des produits achetés du client
     */
    public void afficherMesProduitsAchetés() {
        System.out.println("Voici les achats de " + this.getNom() + ": ");
        for (Produits produit : getMesProduitsAchetes()){
            System.out.println(produit.getNom() + " --> " + produit.getQuantite() + " produits disponibles : \n \t Prix à l'unité : " + produit.getPrix() + "$ \n \t Prix total : " + produit.getPrix() * produit.getQuantite() + "$\n");
        }
    }
}