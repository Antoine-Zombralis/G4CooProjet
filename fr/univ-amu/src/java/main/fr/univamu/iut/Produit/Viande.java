package fr.univamu.iut.Produit;


public abstract class  Viande extends PropositionProduitFermier {

    private int poids;

    public Viande(BuilderProduits builder, int poids) {
        super(builder);
        this.poids = poids;
    }

}