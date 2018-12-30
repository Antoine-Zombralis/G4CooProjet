package fr.univamu.iut;

import java.util.Date;

public class Arbre extends Vegetal {

    String type;

    public Arbre(BuilderProduit builder, String type) {
        super(builder);
        this.type = type;
    }

    public String getType() {
        return type;
    }
}
