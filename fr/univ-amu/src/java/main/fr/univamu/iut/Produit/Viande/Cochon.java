package fr.univamu.iut.Produit.Viande;

import java.util.Calendar;
import java.util.Date;

public class Cochon extends Viande {

    /**
     * @param builder : Correspond au design patern builder
     * Date correspond à la date de péremption du produit
     */
    public Cochon(BuilderProduits builder) {
        super(builder);
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.DAY_OF_YEAR, 2) ;
        Date date = calendar.getTime();
        setDatePeremption(date);
    }
}