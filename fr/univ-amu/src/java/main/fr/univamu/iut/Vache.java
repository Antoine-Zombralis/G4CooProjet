package fr.univamu.iut;

import java.util.Date;

public class Vache extends Viande {

    public Vache(String propriétaire, String id, boolean bio, boolean conforme, int quantité, int prix, Date datePéremption, int poids) {
        super(propriétaire, id, bio, conforme, quantité, prix, datePéremption, poids);
    }

    public enum catégorie{
        CHAROLAISE, LIMOUSINE, NORMANDE, TARENTAISE
    }

}