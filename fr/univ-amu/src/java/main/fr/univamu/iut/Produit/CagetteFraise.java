package fr.univamu.iut.Produit;

public class CagetteFraise extends Fruit {

    private int prixFraiseUnite;
    private int quantiteFraiseDansCagette;

    public CagetteFraise(BuilderProduits builder, int prixFraiseUnite, int quantiteFraiseDansCagette) {
        super(builder);
        this.prixFraiseUnite = prixFraiseUnite;
        this.quantiteFraiseDansCagette = quantiteFraiseDansCagette;
    }

    public int getPrixFraiseUnite() {
        return prixFraiseUnite;
    }

    public void setPrixFraiseUnite(int prixFraiseUnite) {
        this.prixFraiseUnite = prixFraiseUnite;
    }

    public int getQuantiteFraiseDansCagette() {
        return quantiteFraiseDansCagette;
    }

    public void setQuantiteFraiseDansCagette(int quantiteFraiseDansCagette) {
        this.quantiteFraiseDansCagette = quantiteFraiseDansCagette;
    }
}