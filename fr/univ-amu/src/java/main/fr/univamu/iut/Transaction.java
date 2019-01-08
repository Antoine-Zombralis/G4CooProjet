package fr.univamu.iut;

import fr.univamu.iut.Client.Client;
import fr.univamu.iut.Client.Fermier.Fermier;
import fr.univamu.iut.Produit.Produits;

import java.util.ArrayList;
import java.util.List;

public class Transaction {

    private int numero;
    private static int cpt = 0;
    private Client vendeur;
    private Client acheteur;
    private Produits produits;

    private static List<Transaction> transactions = new ArrayList<>();

    public Transaction(Client vendeur, Client acheteur, Produits produits) {
        setNumero(++cpt);
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

    public Client getVendeur() {
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