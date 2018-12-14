package fr.univamu.iut;

import java.util.Date;

public class Cochon extends Viande {

    public Cochon(String propriétaire, String id, boolean bio, boolean conforme, int quantité, int prix, Date datePéremption, int poids, int quantité1) {
        super(propriétaire, id, bio, conforme, quantité, prix, datePéremption, poids);
        this.quantité = quantité1;
    }

    private int quantité;

    private enum catégorie{
        LANDRACE_FRANCAIS, BASQUE, GASCON, PIETRAIN
    }

}