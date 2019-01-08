package fr.univamu.iut.Produit;

import java.util.Calendar;
import java.util.Date;

public class Lait extends ProduitLaitier {
    public Lait(BuilderProduits builder) {
        super(builder);
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.DAY_OF_YEAR, 4) ;
        Date date = calendar.getTime();
        setDatePeremption(date);
    }
}
