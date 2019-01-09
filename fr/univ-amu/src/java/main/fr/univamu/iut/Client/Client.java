package fr.univamu.iut.Client;

import fr.univamu.iut.CompteBancaire;
import fr.univamu.iut.Produit.Produits;
import fr.univamu.iut.Transaction;

import java.util.ArrayList;
import java.util.List;

public abstract class Client {

    private String nom;
    private boolean abonne;
    private int idClient;
    private static int cpt = 0;
    private CompteBancaire monComte;
    private Transaction transaction;

    private List<Produits> mesProduitsAchetes = new ArrayList<>();

    public Client(String nom, boolean abonne, CompteBancaire monComte) {
        this.nom = nom;
        this.abonne = abonne;
        setId(++cpt);
        this.monComte = monComte;
    }

    public boolean isAbonne() {
        return abonne;
    }

    public void setAbonne(boolean abonne) {
        this.abonne = abonne;
    }

    public int getIdClient() {
        return idClient;
    }

    public void setId(int idClient) {
        this.idClient = idClient;
    }

    public CompteBancaire getMonComte() {
        return monComte;
    }

    public void setMonComte(CompteBancaire monComte) {
        this.monComte = monComte;
    }

    public List<Produits> getMesProduitsAchetes() {
        return mesProduitsAchetes;
    }

    public void setMesProduitsAchetes(List<Produits> mesProduitsAchetes) {
        this.mesProduitsAchetes = mesProduitsAchetes;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void acheterProduit(Produits produit, Client vendeur){
            mesProduitsAchetes.add(produit);
            monComte.debiter(idClient, produit.getPrix());
            produit.getProprietaire().getMonComte().crediter(produit.getProprietaire().getIdClient(), produit.getPrix());
            produit.getProprietaire();
            transaction = new Transaction(vendeur, this, produit);
            transaction.addTransaction(transaction);

    }

    public String notifierClient(Client client){
        return "De nouveaux produits ont été mis en vente pour vous " + client.getNom();
    }

}