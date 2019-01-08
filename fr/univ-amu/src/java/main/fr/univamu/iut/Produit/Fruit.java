package fr.univamu.iut.Produit;

public abstract class Fruit extends Vegetal {

    /**
     * @param builder : Correspond au design patern builder
     */
    public Fruit(BuilderProduits builder) {
        super(builder);
    }
}