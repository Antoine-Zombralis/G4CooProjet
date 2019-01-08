package fr.univamu.iut.Produit.FruitEtLegume;

import java.util.Calendar;
import java.util.Date;

public class CagetteAubergine extends Legume {

    /**
     * @param builder : Correspond au design patern builder
     * Date correspond à la date de péremption du produit
     */
    public CagetteAubergine(BuilderProduits builder) {
        super(builder);
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.DAY_OF_YEAR, 4) ;
        Date date = calendar.getTime();
        setDatePeremption(date);
    }
}