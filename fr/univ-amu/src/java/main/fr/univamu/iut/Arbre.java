package fr.univamu.iut;

import fr.univamu.iut.Produit.Vegetal;

public class Arbre extends Vegetal {

    String type;

    public Arbre(BuilderProduits builder, String type) {
        super(builder);
        this.type = type;
    }

    public String getType() {
        return type;
    }
}
