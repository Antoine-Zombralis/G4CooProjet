package fr.univamu.iut;

import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
public class main {

    public static void main(String[] args) {

        Date date = new Date();
        Controleur cochon = new Controleur() ;
        Fermier gile = new Fermier("gilou", false, 1, 1, new CompteBancaire(1, 1000));
        PropositionProduitFermier produit =  new PropositionProduitFermier(gile, "1", true, 1,10);

        System.out.println(produit.getDatePéremption()) ;
        System.out.println(produit.isBio());
        System.out.println(produit.isConforme());
        cochon.validerProduit(produit);
        System.out.println(produit.isConforme());
        System.out.println(gile.getMesProduitsCommercialisable());

ProduitCommercialisable produit1 = new ProduitCommercialisable(gile,"45", true, 1, 8, 5) ;
gile.ajouterListe(produit1);
        System.out.println(gile.getMesProduitsCommercialisable());
    }

}
