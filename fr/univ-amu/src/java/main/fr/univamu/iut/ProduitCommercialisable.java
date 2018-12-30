package fr.univamu.iut;

import java.util.*;


public class ProduitCommercialisable extends Produits {


    public ProduitCommercialisable(BuilderProduit builder) {
        super(builder);
    }

    public void mettreEnVente(){
        System.out.println("Je suis le produit " + this.getNom() + " mon stock est de " + this.getQuantite() + " et je coute " + this.getPrix() + "euro");
    }


    public enum label {
        ROUGE, AOC, AOP, AB, IGP, STG, BBC
    }

}
