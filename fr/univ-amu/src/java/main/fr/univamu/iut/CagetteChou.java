package fr.univamu.iut;

import java.util.Date;

public class CagetteChou extends Legume {

    private int prixChouUnite;
    private int quantiteChou;
    private int prixCagetteUnite;
    private int quantiteCagette;

    public CagetteChou(String propriétaire, String id, boolean bio, boolean conforme, int quantité, int prix, Date datePéremption, int poids, int prixChouUnite, int quantiteChou, int prixCagetteUnite, int quantiteCagette) {
        super(propriétaire, id, bio, conforme, quantité, prix, datePéremption, poids);
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