package fr.univamu.iut;

import java.util.Date;

public class Arbre extends Vegetal {

    String type;

    public Arbre(Fermier propriétaire, String id, boolean bio, int quantité, int prix, int poids, String type) {
        super(propriétaire, id, bio, quantité, prix, poids);
        this.type = type;
    }

    public String getType() {
        return type;
    }
}
