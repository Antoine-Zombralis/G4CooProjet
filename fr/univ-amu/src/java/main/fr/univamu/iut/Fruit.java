package fr.univamu.iut;

import java.util.Date;

public abstract class Fruit extends Vegetal {

    public Fruit(Fermier propriétaire, String id, boolean bio, int quantité, int prix, int poids) {
        super(propriétaire, id, bio, quantité, prix, poids);
    }
}