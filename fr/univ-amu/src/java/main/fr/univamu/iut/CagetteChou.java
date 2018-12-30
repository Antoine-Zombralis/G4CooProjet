package fr.univamu.iut;

import java.util.Date;

public class CagetteChou extends Legume {

    private int prixChouUnite;
    private int quantiteChou;
    private int prixCagetteUnite;
    private int quantiteCagette;

    public CagetteChou(BuilderProduit builder, int prixChouUnite, int quantiteChou, int prixCagetteUnite, int quantiteCagette) {
        super(builder);
        this.prixChouUnite = prixChouUnite;
        this.quantiteChou = quantiteChou;
        this.prixCagetteUnite = prixCagetteUnite;
        this.quantiteCagette = quantiteCagette;
    }

    public int getQuantiteChou() {
        return quantiteChou;
    }

    public int getQuantiteCagette() {
        return quantiteCagette;
    }

    public int getPrixChouUnite(){ return prixChouUnite; }

    public void setQuantiteChou(int quantiteChou) {
        this.quantiteChou = quantiteChou;
    }

    public void setQuantiteCagette(int quantiteCagette) {
        this.quantiteCagette = quantiteCagette;
    }

    public void setPrixChouUnite(int prixChouUnite) {
        this.prixChouUnite = prixChouUnite;
    }

}