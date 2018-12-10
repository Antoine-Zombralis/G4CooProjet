package fr.univamu.iut;

import java.util.List;

/**
 * 
 */
public interface Client {

    /**
     * 
     */
    List<ProduitCommercialisable> mesProduitsAchetés;

    /**
     * 
     */
    public boolean abonne;

    /**
     * 
     */
    public int id;

    /**
     * 
     */
    private CompteBancaire monComte;


    /**
     * @param ProduitCommercialisable produit
     */
    public void void acheterProduit(ProduitCommercialisable produit);

    /**
     * @param int id
     */
    public void void notifierClient(void int id);

}