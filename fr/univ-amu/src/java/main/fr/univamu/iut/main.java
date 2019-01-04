package fr.univamu.iut;
import fr.univamu.iut.Produit.BuilderProduits;
import fr.univamu.iut.Produit.CagettePoire;
import fr.univamu.iut.Produit.ProduitCommercialisable;
import fr.univamu.iut.Produit.Produits;

public class main {

    public static void main(String[] args) {


      Produits poire = new CagettePoire(new BuilderProduits(2, 10, "Cagette de poire").addId(1).addConforme(false), 2, 20);


      Fermier f1 = new Horticulteur("f1", false, 1, 1, new CompteBancaire(1, 1000));
      f1.proposerProduit(poire);

      ProduitCommercialisable poireVente = (ProduitCommercialisable) poire;

      Client c1 = new Grossiste("c1", false, 2, new CompteBancaire(2, 1000));
      c1.acheterProduit(poireVente);
      poireVente.mettreEnVente();
      System.out.println(c1.getMonComte().getSolde());
        System.out.println("test");

    }

}
