package fr.univamu.iut;

public class CagettePomme extends Fruit {

    private int prixPommeUnite;
    private int quantitePomme;
    private int prixCagetteUnite;
    private int quantiteCagette;

    public CagettePomme(int prixPommeUnite, int quantitePomme, int quantiteCagette) {
        this.prixPommeUnite = prixPommeUnite;
        this.quantitePomme = quantitePomme;
        this.prixCagetteUnite = quantitePomme * prixPommeUnite;
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