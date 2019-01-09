package fr.univamu.iut.Produit.ProduitsLaitier;

import fr.univamu.iut.Produit.Produits;

import java.util.Calendar;
import java.util.Date;

public class Fromage extends ProduitLaitier {
    /**
     * @param builder : Correspond au design patern builder
     * Date correspond à la date de péremption du produit
     */
    public Fromage(Produits.BuilderProduits builder) {
        super(builder);
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.DAY_OF_YEAR, 80) ;
        Date date = calendar.getTime();
        setDatePeremption(date);
    }
}
