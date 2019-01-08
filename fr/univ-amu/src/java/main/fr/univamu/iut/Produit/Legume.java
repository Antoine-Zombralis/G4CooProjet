package fr.univamu.iut.Produit;


public abstract class Legume extends Vegetal {

    /**
     * @param builder : Correspond au design patern builder
     */
    public Legume(BuilderProduits builder) {
        super(builder);
    }
}