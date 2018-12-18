package fr.univamu.iut;

import java.util.*;


public class ProduitCommercialisable extends PropositionProduitFermier {

    public ProduitCommercialisable(Fermier propriétaire, String id, boolean bio, int quantité, int prix, int stock) {
        super(propriétaire, id, bio, quantité, prix);
        this.stock = stock;
    }

    private int stock;

    public enum label {
        ROUGE, AOC, AOP, AB, IGP, STG, BBC
    }

}
