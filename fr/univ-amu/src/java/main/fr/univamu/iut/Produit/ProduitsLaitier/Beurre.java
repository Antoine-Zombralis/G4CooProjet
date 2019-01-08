package fr.univamu.iut.Produit.ProduitsLaitier;

import fr.univamu.iut.Produit.Produits;

import java.util.Calendar;
import java.util.Date;

public class Beurre extends ProduitLaitier {
    public Beurre(Produits.BuilderProduits builder) {
        super(builder);
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.DAY_OF_YEAR, 25) ;
        Date date = calendar.getTime();
        setDatePeremption(date);
    }
}
