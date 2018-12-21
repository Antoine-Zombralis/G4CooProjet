package fr.univamu.iut;

import java.util.*;


public class ProduitCommercialisable extends PropositionProduitFermier {

    private int stock;

    public ProduitCommercialisable(BuilderProduit builder) {
        super(builder);
    }


    public enum label {
        ROUGE, AOC, AOP, AB, IGP, STG, BBC
    }

}
