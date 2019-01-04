package fr.univamu.iut;
import fr.univamu.iut.Produit.*;

public class main {

    public static void main(String[] args) {

        Fermier f1 = new Horticulteur("f1", false, 1, 1, new CompteBancaire(1, 1000));
        Fermier f2 = new Arboriculteur("f2", false, 2, 2, new CompteBancaire(2, 1000));
        Fermier f3 = new ProducteurDeViande("f3", false, 3, 3, new CompteBancaire(3, 1000));
        Fermier f4 = new ProducteurLaitier("f4", false, 4, 4, new CompteBancaire(4, 1000));

        Produits poire = new CagettePoire(new BuilderProduits(2, 10, "Cagette de poire").addId(1).addConforme(false), 2, 20);
        Produits pommes = new CagettePomme(new BuilderProduits(3, 6, "Cagette de pomme").addId(2).addConforme(false), 2, 10);
        Produits Fraises = new CagetteFraise(new BuilderProduits(4, 15,"Cagette de fraise").addId(3).addConforme(false), 3, 15);

        ((Horticulteur) f1).cultiverFruit((Fruit) poire);

        ProduitCommercialisable poireVente = (ProduitCommercialisable) poire;

        Client c1 = new Grossiste("c1", false, 2, new CompteBancaire(2, 1000));
        c1.acheterProduit(poireVente);
        poireVente.mettreEnVente();
        System.out.println(c1.getMonComte().getSolde());
        System.out.println("test");

    }

}
