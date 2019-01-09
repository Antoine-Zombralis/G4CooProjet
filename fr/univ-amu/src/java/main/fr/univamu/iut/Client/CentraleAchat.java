package fr.univamu.iut.Client;

import fr.univamu.iut.CompteBancaire;
import fr.univamu.iut.Produit.Produits;
import fr.univamu.iut.Produit.Vegetal;

import java.util.List;

public class CentraleAchat extends Client {
    private List<Client> affiliés;
    private Grossiste mesGrossistes;

    public CentraleAchat(String nom, boolean abonne, CompteBancaire monComte) {
        super(nom, abonne, monComte);
    }

    @Override
    public void supprimerProduit(Produits produit) {
        getMesProduitsAchetes().remove(produit);
    }

    public void afficherAffiliés() {
        System.out.println("Les clients ");
        for (Client affilié : affiliés)
            System.out.println(affilié.getNom() + " d'ID " + affilié.getIdClient());
    }
    public void afficherMesProduitsAchetés() {
        System.out.println("Voici les achats de " + this.getNom() + ": ");
        for (Produits produit : getMesProduitsAchetes()){
            System.out.println(produit.getNom() + " --> " + produit.getQuantite() + " produits disponibles : \n \t Prix à l'unité : " + produit.getPrix() + "$ \n \t Prix total : " + produit.getPrix() * produit.getQuantite() + "$\n");
        }
    }
}
