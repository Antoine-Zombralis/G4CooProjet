package fr.univamu.iut;


import java.util.*;

public class Viande extends PropositionProduitFermier {

    public Viande(Fermier propriétaire, String id, boolean bio, int quantité, int prix, int poids) {
        super(propriétaire, id, bio, quantité, prix);
        this.poids = poids;
    }

    private int poids;

    public int getPoids() {
        return poids;
    }
}