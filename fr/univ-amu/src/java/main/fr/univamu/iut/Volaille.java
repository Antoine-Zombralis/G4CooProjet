package fr.univamu.iut;

import java.util.Date;

public class Volaille extends Viande {

    public Volaille(String propriétaire, String id, boolean bio, boolean conforme, int quantité, int prix, Date datePéremption, int poids) {
        super(propriétaire, id, bio, conforme, quantité, prix, datePéremption, poids);
    }

    private enum catégorie {
        OIE, DINDE, CANARD, POULE, PINTADE, CHAPON, CAILLE, FAISAN, PIGEON
    }


}