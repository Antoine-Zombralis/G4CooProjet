package fr.univamu.iut.Produit;

public abstract class  Viande extends Produits {


    /**
     * @param builder : Correspond au design patern builder
     */
    public Viande(BuilderProduits builder) {
        super(builder);
    }

}