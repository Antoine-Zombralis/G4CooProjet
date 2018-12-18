package fr.univamu.iut;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class main {

    public static void main(String[] args) {


       PropositionProduitFermier produit = new PropositionProduitFermier("Jean", "8", true, true, 8, 5) ;
        System.out.println(produit.getDatePéremption()) ;
        System.out.println(produit.isBio());

    }

}
