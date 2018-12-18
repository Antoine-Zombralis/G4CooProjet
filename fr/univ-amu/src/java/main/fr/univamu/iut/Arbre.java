package fr.univamu.iut;

import java.util.Date;

public class Arbre extends Vegetal {

    String type;

    public Arbre(String propriétaire, String id, boolean bio, boolean conforme, int quantité, int prix, Date datePéremption, int poids, String type) {
        super(propriétaire, id, bio, conforme, quantité, prix, datePéremption, poids);
        this.type = type;
    }

    public String getType() {
        return type;
    }
}
