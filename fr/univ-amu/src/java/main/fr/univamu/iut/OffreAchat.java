package fr.univamu.iut;

import fr.univamu.iut.Client.Client;
import fr.univamu.iut.Produit.Produits;

import java.util.ArrayList;
import java.util.List;

/**
 * Permet de créer une offre d'achat qui sera accepté ou refusée
 */
public class OffreAchat {
    private Client monCreateur ;
    private Produits produitConcerne ;
    private double montant ;
    private int quantite;
    private boolean accepter = false ;

    /**
     * @param monCreateur
     * @param produitConcerne
     * @param montant
     * @param quantite
     */
    public OffreAchat(Client monCreateur, Produits produitConcerne, double montant, int quantite) {
        this.monCreateur = monCreateur;
        this.produitConcerne = produitConcerne;
        this.montant = montant;
        this.quantite = quantite;
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

    public void setMontant(double montant) {
        this.montant = montant;
    }

    public boolean isAccepter() {
        return accepter;
    }

    public void setConforme(boolean accepter) {
        this.accepter = accepter;
    }

    public int getQuantite() {
        return quantite;
    }

    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }
}
