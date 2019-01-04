package fr.univamu.iut.Produit;

/**
 * 
 */
public class CagettePoire extends Fruit {

    private int prixPoireUnite;
    private int quantitePoireDansCagette;


    public CagettePoire(BuilderProduits builder, int prixPoireUnite, int quantitePoireDansCagette) {
        super(builder);
        this.prixPoireUnite = prixPoireUnite;
        this.quantitePoireDansCagette = quantitePoireDansCagette;

    }

    public int getPrixPoireUnite() {
        return prixPoireUnite;
    }

    public int getQuantitePoire() {
        return quantitePoireDansCagette;
    }

    public void setPrixPoireUnite(int prixPoireUnite) {
        this.prixPoireUnite = prixPoireUnite;
    }

    public void setQuantitePoire(int quantitePoireDansCagette) {
        this.quantitePoireDansCagette = quantitePoireDansCagette;
    }

}