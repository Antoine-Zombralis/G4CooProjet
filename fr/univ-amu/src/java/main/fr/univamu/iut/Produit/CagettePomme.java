package fr.univamu.iut.Produit;

import fr.univamu.iut.Produit.Fruit;

public class CagettePomme extends Fruit {

    private int prixPommeUnite;
    private int quantitePommeDansCagette;

    public CagettePomme(BuilderProduits builder, int prixPommeUnite, int quantitePommeDansCagette) {
        super(builder);
        this.prixPommeUnite = prixPommeUnite;
        this.quantitePommeDansCagette = quantitePommeDansCagette;
    }

    public int getPrixPommeUnite() {
        return prixPommeUnite;
    }

    public void setPrixPommeUnite(int prixPommeUnite) {
        this.prixPommeUnite = prixPommeUnite;
    }

    public int getQuantitePommeDansCagette() {
        return quantitePommeDansCagette;
    }

    public void setQuantitePommeDansCagette(int quantitePommeDansCagette) {
        this.quantitePommeDansCagette = quantitePommeDansCagette;
    }
}