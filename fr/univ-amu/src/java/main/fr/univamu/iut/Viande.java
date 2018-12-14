package fr.univamu.iut;


import java.util.*;

public class Viande extends PropositionProduitFermier {

    public Viande(String propriétaire, String id, boolean bio, boolean conforme, int quantité, int prix, Date datePéremption, int poids) {
        super(propriétaire, id, bio, conforme, quantité, prix, datePéremption);
        this.poids = poids;
    }

    private int poids;

    public int getPoids() {
        return poids;
    }
}