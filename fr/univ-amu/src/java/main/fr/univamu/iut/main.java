package fr.univamu.iut;

import java.util.Date;

public class main {

    public static void main(String[] args) {

        Date date = new Date();

        Arboriculteur gile = new Arboriculteur("gilou", false, 1, 1, new CompteBancaire(1, 1000));
        Arbre pin = new Arbre(gile.getNom(), "1", true,true, 1,10, date, 20, "Pin");
        gile.produireArbre(pin);

        for(Arbre objet: gile.getMesArbres()){
            System.out.println(objet.getType());
        }

    }

}
