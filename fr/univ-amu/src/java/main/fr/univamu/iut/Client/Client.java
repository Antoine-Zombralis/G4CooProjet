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
    private CompteBancaire monComte;
    private Transaction transaction;

    private List<Produits> mesProduitsAchetes = new ArrayList<>();

    public Client(String nom, boolean abonne, int idClient, CompteBancaire monComte) {
        this.nom = nom;
        this.abonne = abonne;
        this.idClient = idClient;
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
        if (!produit.isConforme()){
            System.out.println("Impossible d'acheter ce produit, il n'est pas conforme à la réglementation !");
        }
        else{
            mesProduitsAchetes.add(produit);
            monComte.debiter(idClient, produit.getPrix());
            transaction = new Transaction(vendeur, this, produit);
            transaction.addTransaction(transaction);
        }

    }

    public String notifierClient(Client client){
        return "De nouveaux produits ont été mis en vente pour vous " + client.getNom();
    }

}