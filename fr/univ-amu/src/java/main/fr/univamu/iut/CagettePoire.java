package fr.univamu.iut;

import java.util.Date;

/**
 * 
 */
public class CagettePoire extends Fruit {

    private int prixPoireUnite;
    private int quantitePoire;
    private int prixCagetteUnite;
    private int quantiteCagette;

    public CagettePoire(Fermier propriétaire, String id, boolean bio, int quantité, int prix, int poids, int prixPoireUnite, int quantitePoire, int prixCagetteUnite, int quantiteCagette) {
        super(propriétaire, id, bio, quantité, prix, poids);
        this.prixPoireUnite = prixPoireUnite;
        this.quantitePoire = quantitePoire;
        this.prixCagetteUnite = prixCagetteUnite;
        this.quantiteCagette = quantiteCagette;
    }

    public int getPrixPoireUnite() {
        return prixPoireUnite;
    }


    public int getQuantitePoire() {
        return quantitePoire;
    }

    public int getQuantiteCagette() {
        return quantiteCagette;
    }

    public void setPrixPoireUnite(int prixPoireUnite) {
        this.prixPoireUnite = prixPoireUnite;
    }

    public void setQuantitePoire(int quantitePoire) {
        this.quantitePoire = quantitePoire;
    }

    public void setQuantiteCagette(int quantiteCagette) {
        this.quantiteCagette = quantiteCagette;
    }
}