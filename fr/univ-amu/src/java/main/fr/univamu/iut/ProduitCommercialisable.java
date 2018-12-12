package fr.univamu.iut;

import java.util.*;


public class ProduitCommercialisable extends PropositionProduitFermier {

    public ProduitCommercialisable(String propriétaire, String id, boolean bio, boolean conforme, int quantité, int prix, Date datePéremption, int stock) {
        super(propriétaire, id, bio, conforme, quantité, prix, datePéremption);
        this.stock = stock;
    }

    private int stock;

    public enum label {
        ROUGE, AOC, AOP, AB, IGP, STG, BBC
    }


}