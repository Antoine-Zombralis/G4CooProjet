package fr.univamu.iut;


import fr.univamu.iut.Produit.ProduitCommercialisable;

public class Negociation {


    public Negociation(int idClient, int idProduit, int idVendeur) {
        this.idClient = idClient;
        this.idProduit = idProduit;
        this.idVendeur = idVendeur;
    }

    private int idClient;
    private int idProduit;
    private int idVendeur;


    public int getIdClient() {
        return idClient;
    }

    public void setIdClient(int idClient) {
        this.idClient = idClient;
    }

    public int getIdProduit() {
        return idProduit;
    }

    public void setIdProduit(int idProduit) {
        this.idProduit = idProduit;
    }

    public int getIdVendeur() {
        return idVendeur;
    }

    public void setIdVendeur(int idVendeur) {
        this.idVendeur = idVendeur;
    }

    public void changerPrix(ProduitCommercialisable produit, int prix) {
        produit.setPrix(prix);
    }

}