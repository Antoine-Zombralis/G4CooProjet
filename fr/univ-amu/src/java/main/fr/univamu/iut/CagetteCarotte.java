package fr.univamu.iut;

public class CagetteCarotte extends Fruit {

    private int prixCarotteUnite;
    private int quantiteCarotte;
    private int prixCagetteUnite;
    private int quantiteCagette;

    public CagetteCarotte(int prixCarotteUnite, int quantiteCarotte, int quantiteCagette) {
        this.prixCarotteUnite = prixCarotteUnite;
        this.quantiteCarotte = quantiteCarotte;
        this.prixCagetteUnite = quantiteCarotte * prixCarotteUnite;
        this.quantiteCagette = quantiteCagette;
    }

    public int getQuantiteCarotte() {
        return quantiteCarotte;
    }

    public int getQuantiteCagette() {
        return quantiteCagette;
    }

    public int getPrixCarotteUnite(){ return prixCarotteUnite; }

    public void setQuantiteCarotte(int quantiteCarotte) {
        this.quantiteCarotte = quantiteCarotte;
    }

    public void setQuantiteCagette(int quantiteCagette) {
        this.quantiteCagette = quantiteCagette;
    }

    public void setPrixCarotteUnite(int prixCarotteUnite) {
        this.prixCarotteUnite = prixCarotteUnite;
    }
}