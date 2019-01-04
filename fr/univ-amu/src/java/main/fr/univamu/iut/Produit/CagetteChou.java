package fr.univamu.iut.Produit;

public class CagetteChou extends Legume {

    private int prixChouUnite;
    private int quantiteChouDansCagette;

    public CagetteChou(BuilderProduits builder, int prixChouUnite, int quantiteChouDansCagette) {
        super(builder);
        this.prixChouUnite = prixChouUnite;
        this.quantiteChouDansCagette = quantiteChouDansCagette;
    }

    public int getPrixChouUnite() {
        return prixChouUnite;
    }

    public void setPrixChouUnite(int prixChouUnite) {
        this.prixChouUnite = prixChouUnite;
    }

    public int getQuantiteChouDansCagette() {
        return quantiteChouDansCagette;
    }

    public void setQuantiteChouDansCagette(int quantiteChouDansCagette) {
        this.quantiteChouDansCagette = quantiteChouDansCagette;
    }
}