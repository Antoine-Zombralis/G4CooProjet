package fr.univamu.iut;


import java.util.Date;

public abstract class Legume extends Vegetal {

    public Legume(Fermier propriétaire, String id, boolean bio, int quantité, int prix, int poids) {
        super(propriétaire, id, bio, quantité, prix, poids);
    }
}