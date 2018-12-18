package fr.univamu.iut;


import java.util.Date;

public class Vegetal extends PropositionProduitFermier {

    public Vegetal(String propriétaire, String id, boolean bio, boolean conforme, int quantité, int prix, Date datePéremption, int poids) {
        super(propriétaire, id, bio, conforme, quantité, prix);
        this.poids = poids;
    }

    private int poids;

}