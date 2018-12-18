package fr.univamu.iut;

import java.util.Date;

public class Vache extends Viande {

    public Vache(String propriétaire, String id, boolean bio, boolean conforme, int quantité, int prix, Date datePéremption, int poids, int quantité1) {
        super(propriétaire, id, bio, conforme, quantité, prix, datePéremption, poids);
        this.quantité = quantité1;
    }

    public int quantité;


    public enum catégorie{
        CHAROLAISE, LIMOUSINE, NORMANDE, TARENTAISE
    }

}