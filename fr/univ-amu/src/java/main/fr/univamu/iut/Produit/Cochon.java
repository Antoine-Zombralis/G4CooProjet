package fr.univamu.iut.Produit;

import fr.univamu.iut.Produit.Viande;

import java.util.Calendar;
import java.util.Date;

public class Cochon extends Viande {

    public Cochon(BuilderProduits builder, int poids) {
        super(builder, poids);
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.DAY_OF_YEAR, 2) ;
        Date date = calendar.getTime();
        setDatePeremption(date);
    }

}