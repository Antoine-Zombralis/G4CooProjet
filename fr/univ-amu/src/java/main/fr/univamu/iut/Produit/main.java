package fr.univamu.iut.Produit;

import fr.univamu.iut.*;
import fr.univamu.iut.Produit.*;
import fr.univamu.iut.Produit.Fruit;

public class main {

    public static void main(String[] args) {

        Fermier f1 = new Horticulteur("f1", false, 1, 1, new CompteBancaire(1, 1000));
        Fermier f2 = new Arboriculteur("f2", false, 2, 2, new CompteBancaire(2, 1000));
        Fermier f3 = new ProducteurDeViande("f3", false, 3, 3, new CompteBancaire(3, 1000));
        Fermier f4 = new ProducteurLaitier("f4", false, 4, 4, new CompteBancaire(4, 1000));

        Produits poire = new CagettePoire.BuilderProduits(5, 10, "Cagette de poire")
                .addConforme(false)
                .addId(1)
                .addPrixVegetalUnite(0.50)
                .addQuantiteVegetalDansCagette(20)
                .build();

        Produits pomme= new CagettePomme.BuilderProduits(10, 4, "Cagette de pomme")
                .addConforme(false)
                .addId(2)
                .addQuantiteVegetalDansCagette(25)
                .addPrixVegetalUnite(0.75)
                .build();

        ((Horticulteur) f1).cultiverFruit(poire);
        ((Horticulteur) f1).afficherMesProductions();
        Client c1 = new Grossiste("c1", false, 2, new CompteBancaire(2, 1000));
        c1.acheterProduit(poire);
        System.out.println(c1.getMonComte().getSolde());

    }

}
