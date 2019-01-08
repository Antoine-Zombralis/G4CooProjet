package fr.univamu.iut.Produit;

import java.util.Calendar;
import java.util.Date;

public class Fromage extends ProduitLaitier {
    public Fromage(BuilderProduits builder) {
        super(builder);
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.DAY_OF_YEAR, 80) ;
        Date date = calendar.getTime();
        setDatePeremption(date);
    }
}
