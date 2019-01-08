package fr.univamu.iut.Produit;

import java.util.Calendar;
import java.util.Date;

public class CagettePoire extends Fruit {

    /**
     * @param builder : Correspond au design patern builder
     * Date correspond à la date de péremption du produit
     */
    public CagettePoire(BuilderProduits builder) {
        super(builder);
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.DAY_OF_YEAR, 5) ;
        Date date = calendar.getTime();
        setDatePeremption(date);
    }
}