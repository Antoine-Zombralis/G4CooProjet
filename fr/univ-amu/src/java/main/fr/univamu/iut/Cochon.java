package fr.univamu.iut;

import java.util.Date;

public class Cochon extends Viande {

    public Cochon(Fermier propriétaire, String id, boolean bio, int quantité, int prix, int poids) {
        super(propriétaire, id, bio, quantité, prix, poids);
    }

    private enum catégorie{
        LANDRACE_FRANCAIS, BASQUE, GASCON, PIETRAIN
    }

}