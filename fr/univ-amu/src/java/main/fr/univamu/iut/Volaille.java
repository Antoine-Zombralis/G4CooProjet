package fr.univamu.iut;

import java.util.Date;

public class Volaille extends Viande {

    public Volaille(BuilderProduit builder, int poids) {
        super(builder, poids);
    }

    private enum catégorie {
        OIE, DINDE, CANARD, POULE, PINTADE, CHAPON, CAILLE, FAISAN, PIGEON
    }


}