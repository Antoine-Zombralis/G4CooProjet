package fr.univamu.iut;

import java.util.Date;

public class Cochon extends Viande {

    public Cochon(BuilderProduit builder, int poids) {
        super(builder, poids);
    }

    private enum catégorie{
        LANDRACE_FRANCAIS, BASQUE, GASCON, PIETRAIN
    }

}