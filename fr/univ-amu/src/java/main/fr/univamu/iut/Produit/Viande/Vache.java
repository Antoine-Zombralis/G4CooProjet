package fr.univamu.iut.Produit.Viande;

import fr.univamu.iut.Produit.Viande.Viande;

import java.util.Calendar;
import java.util.Date;

public class Vache extends Viande {

    /**
     * @param builder : Correspond au design patern builder
     * Date correspond à la date de péremption du produit
     */
    public Vache(BuilderProduits builder) {
        super(builder);
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.DAY_OF_YEAR, 2) ;
        Date date = calendar.getTime();
        setDatePeremption(date);
    }

}