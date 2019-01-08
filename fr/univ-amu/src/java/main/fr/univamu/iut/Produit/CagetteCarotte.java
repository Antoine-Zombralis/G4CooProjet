package fr.univamu.iut.Produit;

import java.util.Calendar;
import java.util.Date;

public class CagetteCarotte extends Legume {
    public CagetteCarotte(BuilderProduits builder) {
        super(builder);
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.DAY_OF_YEAR, 5) ;
        Date date = calendar.getTime();
        setDatePeremption(date);
    }
}