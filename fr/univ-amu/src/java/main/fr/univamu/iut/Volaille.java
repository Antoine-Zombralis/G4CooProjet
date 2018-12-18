package fr.univamu.iut;

import java.util.Date;

public class Volaille extends Viande {

    public Volaille(String propriétaire, String id, boolean bio, boolean conforme, int quantité, int prix, Date datePéremption, int poids, int quantité1) {
        super(propriétaire, id, bio, conforme, quantité, prix, datePéremption, poids);
        this.quantité = quantité1;
    }

    private int quantité;

    private enum catégorie {
        OIE, DINDE, CANARD, POULE, PINTADE, CHAPON, CAILLE, FAISAN, PIGEON
    }


    public int getQuantité() {
        return quantité;
    }

    public void setQuantité(int quantité) {
        this.quantité = quantité;
    }
}