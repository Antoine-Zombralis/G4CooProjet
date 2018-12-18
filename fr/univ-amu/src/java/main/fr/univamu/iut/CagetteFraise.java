package fr.univamu.iut;

import java.util.Date;

public class CagetteFraise extends Fruit{

    private int prixFraiseUnite;
    private int quantiteFraise;
    private int prixCagetteUnite;
    private int quantiteCagette;

    public CagetteFraise(Fermier propriétaire, String id, boolean bio, int quantité, int prix, int poids, int prixFraiseUnite, int quantiteFraise, int prixCagetteUnite, int quantiteCagette) {
        super(propriétaire, id, bio, quantité, prix, poids);
        this.prixFraiseUnite = prixFraiseUnite;
        this.quantiteFraise = quantiteFraise;
        this.prixCagetteUnite = prixCagetteUnite;
        this.quantiteCagette = quantiteCagette;
    }

    public int getQuantiteFraise() {
        return quantiteFraise;
    }

    public int getQuantiteCagette() {
        return quantiteCagette;
    }

    public int getPrixFraiseUnite(){ return prixFraiseUnite; }

    public void setQuantiteFraise(int quantiteFraise) {
        this.quantiteFraise = quantiteFraise;
    }

    public void setQuantiteCagette(int quantiteCagette) {
        this.quantiteCagette = quantiteCagette;
    }

    public void setPrixFraiseUnite(int prixFraiseUnite) {
        this.prixFraiseUnite = prixFraiseUnite;
    }

}