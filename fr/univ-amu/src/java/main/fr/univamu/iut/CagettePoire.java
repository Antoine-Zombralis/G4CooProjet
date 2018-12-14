package fr.univamu.iut;

/**
 * 
 */
public class CagettePoire extends Fruit {

    private int prixPoireUnite;
    private int quantitePoire;
    private int prixCagetteUnite;
    private int quantiteCagette;

    public CagettePoire(int prixPoireUnite, int quantitePoire, int quantiteCagette) {
        this.prixPoireUnite = prixPoireUnite;
        this.quantitePoire = quantitePoire;
        this.prixCagetteUnite = quantitePoire * prixPoireUnite;
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