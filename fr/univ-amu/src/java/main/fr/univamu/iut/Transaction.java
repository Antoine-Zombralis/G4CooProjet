package fr.univamu.iut;

import fr.univamu.iut.Fermier.Fermier;
import fr.univamu.iut.Produit.Produits;

import java.util.ArrayList;
import java.util.List;

public class Transaction {

    private static int numero = 0;
    private Fermier vendeur;
    private Client acheteur;
    private Produits produits;

    private static List<Transaction> transactions = new ArrayList<>();

    public Transaction(Fermier vendeur, Client acheteur, Produits produits) {
        this.numero = ++numero;
        this.vendeur = vendeur;
        this.acheteur = acheteur;
        this.produits = produits;
    }

    public void addTransaction(Transaction transaction){
        transactions.add(transaction);
        System.out.println("Une transaction entre " + vendeur.getNom() + " et " + acheteur.getNom() + " sur le produit " + "-" + produits.getNom() + "-" + " du montant " + produits.getPrix() + "$" + " a été effectuée ! ");
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Fermier getVendeur() {
        return vendeur;
    }

    public void setVendeur(Fermier vendeur) {
        this.vendeur = vendeur;
    }

    public Client getAcheteur() {
        return acheteur;
    }

    public void setAcheteur(Client acheteur) {
        this.acheteur = acheteur;
    }

    public Produits getProduits() {
        return produits;
    }

    public void setProduits(Produits produits) {
        this.produits = produits;
    }

    public List<Transaction> getTransactions() {
        return transactions;
    }

    public void setTransactions(List<Transaction> transactions) {
        this.transactions = transactions;
    }
}