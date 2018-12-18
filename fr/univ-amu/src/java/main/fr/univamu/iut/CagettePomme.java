package fr.univamu.iut;

import java.util.Date;

public class CagettePomme extends Fruit {

    private int prixPommeUnite;
    private int quantitePomme;
    private int prixCagetteUnite;
    private int quantiteCagette;

    public CagettePomme(Fermier propriétaire, String id, boolean bio, int quantité, int prix, int poids, int prixPommeUnite, int quantitePomme, int prixCagetteUnite, int quantiteCagette) {
        super(propriétaire, id, bio, quantité, prix, poids);
        this.prixPommeUnite = prixPommeUnite;
        this.quantitePomme = quantitePomme;
        this.prixCagetteUnite = prixCagetteUnite;
        this.quantiteCagette = quantiteCagette;
    }

    public int getQuantitePomme() {
        return quantitePomme;
    }

    public int getQuantiteCagette() {
        return quantiteCagette;
    }

    public int getPrixPommeUnite(){ return prixPommeUnite; }

    public void setQuantitePomme(int quantitePomme) {
        this.quantitePomme = quantitePomme;
    }

    public void setQuantiteCagette(int quantiteCagette) {
        this.quantiteCagette = quantiteCagette;
    }

    public void setPrixPommeUnite(int prixPommeUnite) {
        this.prixPommeUnite = prixPommeUnite;
    }
}