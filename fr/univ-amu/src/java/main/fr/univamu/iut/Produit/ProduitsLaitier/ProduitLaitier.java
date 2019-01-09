package fr.univamu.iut.Produit.ProduitsLaitier;

import fr.univamu.iut.Produit.Produits;

public abstract class ProduitLaitier extends Produits {
    /**
     * @param builder  : Correspond au design patern builder
     */
    public ProduitLaitier(BuilderProduits builder) {
        super(builder);
    }
}
