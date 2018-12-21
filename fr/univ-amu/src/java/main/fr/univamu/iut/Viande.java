package fr.univamu.iut;


import java.util.*;

public class Viande extends PropositionProduitFermier {

    private int poids;

    public Viande(BuilderProduit builder, int poids) {
        super(builder);
        this.poids = poids;
    }

    public int getPoids() {
        return poids;
    }
}