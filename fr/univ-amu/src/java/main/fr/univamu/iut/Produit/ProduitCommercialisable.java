package fr.univamu.iut.Produit;


public class ProduitCommercialisable extends Produits {


    public ProduitCommercialisable(BuilderProduits builder) {
        super(builder);
    }

    public void mettreEnVente(){
        System.out.println("Je suis le produit " + this.getNom() + " mon stock est de " + this.getQuantite() + " et je coute " + this.getPrix() + "euro");
    }

}
