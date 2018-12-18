package fr.univamu.iut;

import java.util.Date;

public class Volaille extends Viande {

    public Volaille(Fermier propriétaire, String id, boolean bio, int quantité, int prix, int poids) {
        super(propriétaire, id, bio, quantité, prix, poids);
    }

    private enum catégorie {
        OIE, DINDE, CANARD, POULE, PINTADE, CHAPON, CAILLE, FAISAN, PIGEON
    }


}