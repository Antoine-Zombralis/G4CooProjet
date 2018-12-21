package fr.univamu.iut;

import java.util.Date;

public class CagetteFraise extends Fruit{

    private int prixFraiseUnite;
    private int quantiteFraise;
    private int prixCagetteUnite;
    private int quantiteCagette;

    public CagetteFraise(BuilderProduit builder, int prixFraiseUnite, int quantiteFraise, int prixCagetteUnite, int quantiteCagette) {
        super(builder);
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