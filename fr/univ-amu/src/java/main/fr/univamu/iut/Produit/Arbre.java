package fr.univamu.iut.Produit;

import fr.univamu.iut.Produit.Vegetal;

public abstract class Arbre extends Vegetal {

    String type;

    public Arbre(BuilderProduits builder, String type) {
        super(builder);

    }

}
