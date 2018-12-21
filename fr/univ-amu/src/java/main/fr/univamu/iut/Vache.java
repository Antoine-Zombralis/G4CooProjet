package fr.univamu.iut;

import java.util.Date;

public class Vache extends Viande {

    public Vache(BuilderProduit builder, int poids) {
        super(builder, poids);
    }

    public enum catégorie{
        CHAROLAISE, LIMOUSINE, NORMANDE, TARENTAISE
    }

}