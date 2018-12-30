package fr.univamu.iut;

import com.sun.istack.internal.NotNull;

import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
public class main {

    public static void main(String[] args) {

      /*  Date date = new Date();

        Arboriculteur gile = new Arboriculteur("gilou", false, 1, 1, new CompteBancaire(1, 1000));
        Arbre pin = new Arbre(gile.getNom(), "1", true,true, 1,10, date, 20, "Pin");
        gile.produireArbre(pin);

        PropositionProduitFermier produit = new PropositionProduitFermier("Jean", "8", true, true, 8, 5) ;
        System.out.println(produit.getDatePéremption()) ;
        System.out.println(produit.isBio());

        for(Arbre objet: gile.getMesProductions()){
            System.out.println(objet.getType());
        }*/

      Produits poire = new CagettePoire.BuilderProduit(2, 10, "Cagette de poire")
              .addId(1)
              .addConforme(false)
              .build();

      Fermier f1 = new Horticulteur("f1", false, 1, 1, new CompteBancaire(1, 1000));
      f1.proposerProduit(poire);

      ProduitCommercialisable poireVente = (ProduitCommercialisable) poire;

      Client c1 = new Grossiste("c1", false, 2, new CompteBancaire(2, 1000));
      c1.acheterProduit(poireVente);
      poireVente.mettreEnVente();
      System.out.println(c1.getMonComte().getSolde());
        System.out.println("test");

    }

}
