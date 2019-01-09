package fr.univamu.iut.Client;

import fr.univamu.iut.CompteBancaire;
import fr.univamu.iut.Produit.Produits;


public class Grossiste extends Client {

    public Grossiste(String nom, boolean abonne, CompteBancaire monComte) {
        super(nom, abonne, monComte);
        //this.monGérantAchat = monGérantAchat;
    }

    @Override
    public void supprimerProduit(Produits produit) {
        getMesProduitsAchetes().remove(produit);

        //private Set<CentraleAchat> monGérantAchat;


    }

    public void afficherMesProduitsAchetés() {
        System.out.println("Voici les achats de " + this.getNom() + ": ");
        for (Produits produit : getMesProduitsAchetes()){
            System.out.println(produit.getNom() + " --> " + produit.getQuantite() + " produits disponibles : \n \t Prix à l'unité : " + produit.getPrix() + "$ \n \t Prix total : " + produit.getPrix() * produit.getQuantite() + "$\n");
        }
    }
}