package fr.univamu.iut.Client;

import fr.univamu.iut.CompteBancaire;
import fr.univamu.iut.OffreAchat;
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
    private OffreAchat offreAchat;

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

    public void validerOffre(){
        if(offreAchat.isAccepter() && offreAchat.getMonCreateur().getMonComte().getSolde() > offreAchat.getMontant()){
            offreAchat.getMonCreateur().acheterProduit(offreAchat.getProduitConcerne(), offreAchat.getProduitConcerne().getProprietaire());
        }
        else{
            System.out.println("Vous ne pouvez pas acheter ce produit...");
        }
    }

    public void accepterOffre(boolean accepter){
        if(accepter){
            offreAchat.setConforme(accepter);

        }
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
            produit.getProprietaire().supprimerProduit(produit);
            transaction = new Transaction(vendeur, this, produit);
            transaction.addTransaction(transaction);

    }

   public String notifierClient(Client client){
        return "De nouveaux produits ont été mis en vente pour vous " + client.getNom();
    }

    public Transaction getTransaction() {
        return transaction;
    }

    public void setTransaction(Transaction transaction) {
        this.transaction = transaction;
    }

    public OffreAchat getOffreAchat() {
        return offreAchat;
    }

    public void setOffreAchat(OffreAchat offreAchat) {
        this.offreAchat = offreAchat;
    }

