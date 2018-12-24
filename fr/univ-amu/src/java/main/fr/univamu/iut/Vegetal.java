package fr.univamu.iut;


import java.util.Date;

public abstract class Vegetal extends ProduitCommercialisable {

    private int poids;

    public Vegetal(BuilderProduit builder) {
        super(builder);
    }
}