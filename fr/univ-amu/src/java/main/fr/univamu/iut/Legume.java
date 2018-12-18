package fr.univamu.iut;


import java.util.Date;

public abstract class Legume extends Vegetal {

    public Legume(String propriétaire, String id, boolean bio, boolean conforme, int quantité, int prix, Date datePéremption, int poids) {
        super(propriétaire, id, bio, conforme, quantité, prix, datePéremption, poids);
    }
}