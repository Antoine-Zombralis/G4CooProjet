package fr.univamu.iut;

import fr.univamu.iut.Produit.Produits;

public class Transaction {

    private int numero;
    private Fermier vendeur;
    private Client acheteur;
    private Produits produits;

    public Transaction(int numero, Fermier vendeur, Client acheteur, Produits produits) {
        this.numero = numero;
        this.vendeur = vendeur;
        this.acheteur = acheteur;
        this.produits = produits;
    }

    public void afficherTransaction(){
        System.out.println("Une transaction avec " + vendeur.getNom() + " et" + acheteur.getNom() + " sur le produit " + produits.getNom() + " du montant " + produits.getPrix());
    }
}