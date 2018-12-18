package fr.univamu.iut;


import java.util.Date;

public class Vegetal extends PropositionProduitFermier {

    public Vegetal(Fermier propriétaire, String id, boolean bio, int quantité, int prix, int poids) {
        super(propriétaire, id, bio, quantité, prix);
        this.poids = poids;
    }

    private int poids;

}