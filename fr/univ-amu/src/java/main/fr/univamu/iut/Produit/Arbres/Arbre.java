package fr.univamu.iut.Produit.Arbres;

import fr.univamu.iut.Produit.Vegetal;

public abstract class Arbre extends Vegetal {

    /**
     * @param builder : Correspond au design patern builder
     *
     */
    public Arbre(BuilderProduits builder) {
        super(builder);

    }

}
