package fr.univamu.iut;

fermier;

/**
 * 
 */
public interface Client {

    /**
     * 
     */
    private array<ProduitCommercialisable> mesProduitsAchetés;

    /**
     * 
     */
    public bool abonné;

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
    public void void acheterProduit(void ProduitCommercialisable produit);

    /**
     * @param int id
     */
    public void void notifierClient(void int id);

}