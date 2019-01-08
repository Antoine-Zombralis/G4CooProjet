package fr.univamu.iut.Produit;

public abstract class Vegetal extends Produits {

    /**
     * @param builder : Correspond au design patern builder
     */
    public Vegetal(BuilderProduits builder) {
        super(builder);
    }
}