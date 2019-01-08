package fr.univamu.iut.Produit;

import java.util.Calendar;
import java.util.Date;

public class CagetteFraise extends Fruit {

    /**
     * @param builder : Correspond au design patern builder
     * Date correspond à la date de péremption du produit
     */
    public CagetteFraise(BuilderProduits builder) {
        super(builder);
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.DAY_OF_YEAR, 3) ;
        Date date = calendar.getTime();
        setDatePeremption(date);
    }
}