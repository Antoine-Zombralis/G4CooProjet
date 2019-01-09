package fr.univamu.iut.Client;

import fr.univamu.iut.CompteBancaire;
import fr.univamu.iut.Produit.Produits;
import fr.univamu.iut.Produit.Vegetal;

import java.util.List;

/**
 * Classe qui représente les entreprises qui achètent en gros et revendent au détails
 */
public class CentraleAchat extends Client {
    private List<Client> affiliés;
    private Grossiste mesGrossistes;

    /**
     * @param nom
     * @param abonne
     * @param monComte
     * Cette fonction créée une centrale d'achat qui peut acheter des produits en grand nombre
     */
    public CentraleAchat(String nom, boolean abonne, CompteBancaire monComte) {
        super(nom, abonne, monComte);
    }

    /**
     * @param produit
     * cette fonction permet de supprimer les produits achetés par la centrale d'achat de la liste des produits mis en vente
     */
    @Override
    public void supprimerProduit(Produits produit) {
        getMesProduitsAchetes().remove(produit);
    }

    /**
     * Cette fonction affiche la liste des produits achetés par la centrale d'achat
     */
    public void afficherMesProduitsAchetés() {
        System.out.println("Voici les achats de " + this.getNom() + ": ");
        for (Produits produit : getMesProduitsAchetes()){
            System.out.println(produit.getNom() + " --> " + produit.getQuantite() + " produits disponibles : \n \t Prix à l'unité : " + produit.getPrix() + "$ \n \t Prix total : " + produit.getPrix() * produit.getQuantite() + "$\n");
        }
    }
}
