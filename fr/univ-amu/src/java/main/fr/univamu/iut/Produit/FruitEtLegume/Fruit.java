package fr.univamu.iut.Produit.FruitEtLegume;

import fr.univamu.iut.Produit.Vegetal;

public abstract class Fruit extends Vegetal {

    /**
     * @param builder : Correspond au design patern builder
     */
    public Fruit(BuilderProduits builder) {
        super(builder);
    }
}