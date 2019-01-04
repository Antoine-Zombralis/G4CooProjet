package fr.univamu.iut.Produit;

public class CagetteCarotte extends Fruit {

    private int prixCarotteUnite;
    private int quantiteCarotteDansCagette;

    public CagetteCarotte(BuilderProduits builder, int prixCarotteUnite, int quantiteCarotteDansCagette) {
        super(builder);
        this.prixCarotteUnite = prixCarotteUnite;
        this.quantiteCarotteDansCagette = quantiteCarotteDansCagette;
    }

    public int getPrixCarotteUnite() {
        return prixCarotteUnite;
    }

    public void setPrixCarotteUnite(int prixCarotteUnite) {
        this.prixCarotteUnite = prixCarotteUnite;
    }

    public int getQuantiteCarotteDansCagette() {
        return quantiteCarotteDansCagette;
    }

    public void setQuantiteCarotteDansCagette(int quantiteCarotteDansCagette) {
        this.quantiteCarotteDansCagette = quantiteCarotteDansCagette;
    }
}