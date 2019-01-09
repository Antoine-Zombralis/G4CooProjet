package fr.univamu.iut;

import fr.univamu.iut.Client.Client;
import fr.univamu.iut.Produit.Produits;

public class OffreAchat {
    private Client monCreateur ;
    private Produits produitConcerne ;
    private double montant ;
    private boolean accepter = false ;

    public OffreAchat(Client monCreateur, Produits produitConcerne, double montant) {
        this.monCreateur = monCreateur;
        this.produitConcerne = produitConcerne;
        this.montant = montant;
    }



    public Client getMonCreateur() {
        return monCreateur;
    }

    public void setMonCreateur(Client monCreateur) {
        this.monCreateur = monCreateur;
    }

    public Produits getProduitConcerne() {
        return produitConcerne;
    }

    public void setProduitConcerne(Produits produitConcerne) {
        this.produitConcerne = produitConcerne;
    }

    public double getMontant() {
        return montant;
    }

    public void setMontant(int montant) {
        this.montant = montant;
    }

    public boolean isAccepter() {
        return accepter;
    }

    public void setConforme(boolean accepter) {
        this.accepter = accepter;
    }
}
