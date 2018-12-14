package fr.univamu.iut;

public class CagetteFraise extends Fruit{

    private int prixFraiseUnite;
    private int quantiteFraise;
    private int prixCagetteUnite;
    private int quantiteCagette;

    public CagetteFraise(int prixFraiseUnite, int quantiteFraise, int quantiteCagette) {
        this.prixFraiseUnite = prixFraiseUnite;
        this.quantiteFraise = quantiteFraise;
        this.prixCagetteUnite = quantiteFraise * prixFraiseUnite;
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