package fr.univamu.iut.Produit;

public abstract class  Viande extends Produits {

    private int poids;

    public Viande(BuilderProduits builder, int poids) {
        super(builder);
        this.poids = poids;
    }

}