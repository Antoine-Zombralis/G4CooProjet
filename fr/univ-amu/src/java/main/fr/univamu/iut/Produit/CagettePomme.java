package fr.univamu.iut.Produit;

import java.util.Calendar;
import java.util.Date;

public class CagettePomme extends Fruit {

    public CagettePomme(BuilderProduits builder) {
        super(builder);
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.DAY_OF_YEAR, 7) ;
        Date date = calendar.getTime();
        setDatePeremption(date);

    }
}