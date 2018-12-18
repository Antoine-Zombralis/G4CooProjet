package fr.univamu.iut;

import java.util.Date;

public class Vache extends Viande {

    public Vache(Fermier propriétaire, String id, boolean bio, int quantité, int prix, int poids) {
        super(propriétaire, id, bio, quantité, prix, poids);
    }

    public enum catégorie{
        CHAROLAISE, LIMOUSINE, NORMANDE, TARENTAISE
    }

}