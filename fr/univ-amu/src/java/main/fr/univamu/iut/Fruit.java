package fr.univamu.iut;

import java.util.Date;

public abstract class Fruit extends Vegetal {

    public Fruit(String propriétaire, String id, boolean bio, boolean conforme, int quantité, int prix, Date datePéremption, int poids) {
        super(propriétaire, id, bio, conforme, quantité, prix, datePéremption, poids);
    }
}