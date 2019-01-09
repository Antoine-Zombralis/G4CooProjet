package fr.univamu.iut;

import fr.univamu.iut.Client.Client;
import fr.univamu.iut.Client.Fermier.Fermier;
import fr.univamu.iut.Produit.Produits;

import java.util.ArrayList;
import java.util.List;

/**
 * Quand un achat est efféctué une transaction est créée
 */
public class Transaction {

    private int numero;
    private static int cpt = 0;
    private Client vendeur;
    private Client acheteur;
    private Produits produits;
    double montant;

    private List<Transaction> transactions = new ArrayList<>();

    /**
     * @param vendeur
     * @param acheteur
     * @param produits
     * @param montant
     * L'identifiant est généré automatiquement
     */
    public Transaction(Client vendeur, Client acheteur, Produits produits, double montant) {
        setNumero(++cpt);
        this.vendeur = vendeur;
        this.acheteur = acheteur;
        this.produits = produits;
        this.montant = montant;
    }

    public void addTransaction(Transaction transaction){
        transactions.add(transaction);
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

    public double getMontant() {
        return montant;
    }

    public void setMontant(double montant) {
        this.montant = montant;
    }
}