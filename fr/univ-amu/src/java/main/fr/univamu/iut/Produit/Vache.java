package fr.univamu.iut.Produit;

import java.util.Calendar;
import java.util.Date;

public class Vache extends Viande {

    public Vache(BuilderProduits builder, int poids) {
        super(builder, poids);
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.DAY_OF_YEAR, 2) ;
        Date date = calendar.getTime();
        setDatePeremption(date);
    }

}