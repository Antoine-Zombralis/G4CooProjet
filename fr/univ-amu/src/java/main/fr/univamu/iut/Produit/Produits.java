package fr.univamu.iut.Produit;

import fr.univamu.iut.Client;
import fr.univamu.iut.Produit.BuilderProduits;

import java.util.Calendar;
import java.util.Date;

public class Produits {

    private Client proprietaire;
    private boolean bio, conforme;
    private int quantite, prix, id;
    private Date datePeremption;
    private String nom;


    public Produits(BuilderProduits builder) {
        proprietaire = builder.getProprietaire();
        nom = builder.getNom();
        bio = builder.isBio();
        conforme = builder.isConforme();
        quantite = builder.getQuantite();
        id = builder.getId();
        prix = builder.getPrix();
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.DAY_OF_YEAR, 7) ;
        Date date = calendar.getTime();
        datePeremption = date ;
    }

    public Client getProprietaire() {
        return proprietaire;
    }

    public void setProprietaire(Client proprietaire) {
        this.proprietaire = proprietaire;
    }

    public boolean isBio() {
        return bio;
    }

    public void setBio(boolean bio) {
        this.bio = bio;
    }

    public boolean isConforme() {
        return conforme;
    }

    public void setConforme(boolean conforme) {
        this.conforme = conforme;
    }

    public int getQuantite() {
        return quantite;
    }

    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }

    public int getPrix() {
        return prix;
    }

    public void setPrix(int prix) {
        this.prix = prix;
    }

    public Date getDatePeremption() {
        return datePeremption ;
    }

    public void setDatePeremption(Date datePeremption) {
        this.datePeremption = datePeremption;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
}
