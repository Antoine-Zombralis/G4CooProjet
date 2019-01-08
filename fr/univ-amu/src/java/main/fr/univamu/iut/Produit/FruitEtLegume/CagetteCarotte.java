package fr.univamu.iut.Produit.FruitEtLegume;

import java.util.Calendar;
import java.util.Date;

public class CagetteCarotte extends Legume {

    /**
     * @param builder : Correspond au design patern builder
     * Date correspond à la date de péremption du produit
     */
    public CagetteCarotte(BuilderProduits builder) {
        super(builder);
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.DAY_OF_YEAR, 5) ;
        Date date = calendar.getTime();
        setDatePeremption(date);
    }
}