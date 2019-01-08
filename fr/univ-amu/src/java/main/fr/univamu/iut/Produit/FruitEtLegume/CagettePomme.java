package fr.univamu.iut.Produit.FruitEtLegume;

import java.util.Calendar;
import java.util.Date;

public class CagettePomme extends Fruit {

    /**
     * @param builder : Correspond au design patern builder
     * Date correspond à la date de péremption du produit
     */
    public CagettePomme(BuilderProduits builder) {
        super(builder);
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.DAY_OF_YEAR, 7) ;
        Date date = calendar.getTime();
        setDatePeremption(date);

    }
}