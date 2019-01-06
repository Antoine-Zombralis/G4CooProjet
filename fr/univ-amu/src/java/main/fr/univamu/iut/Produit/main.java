package fr.univamu.iut.Produit;

import fr.univamu.iut.*;
import fr.univamu.iut.Produit.*;
import fr.univamu.iut.Produit.Fruit;

import java.util.ArrayList;
import java.util.List;

public class main {

    public static void main(String[] args) {

        Fermier f1 = new Horticulteur("f1", false, 1, 1, new CompteBancaire(1, 1000));
        Fermier f2 = new Arboriculteur("f2", false, 2, 2, new CompteBancaire(2, 1000));
        Fermier f3 = new ProducteurDeViande("f3", false, 3, 3, new CompteBancaire(3, 1000));
        Fermier f4 = new ProducteurLaitier("f4", false, 4, 4, new CompteBancaire(4, 1000));

        Client c1 = new Grossiste("c1", false, 2, new CompteBancaire(2, 1000));


        for(Produits vegetale :  creationProduitHorticulteur()){
            ((Horticulteur) f1).cultiverVegetal(vegetale);
        }
        ((Horticulteur) f1).afficherMesProductions();

        System.out.println(c1.getMonComte().getSolde());

    }

    public static List<Produits> creationProduitHorticulteur(){

        List<Produits> vegetales = new ArrayList<>();

        Produits poire = new CagettePoire.BuilderProduits(5, 10, "Cagette de poire")
                .addConforme(false)
                .addId(1)
                .addPrixVegetalUnite(0.50)
                .addQuantiteVegetalDansCagette(20)
                .build();

        vegetales.add(poire);

        Produits pomme = new CagettePomme.BuilderProduits(10, 4, "Cagette de pomme")
                .addConforme(false)
                .addId(2)
                .addQuantiteVegetalDansCagette(25)
                .addPrixVegetalUnite(0.75)
                .build();

        vegetales.add(pomme);

        Produits aubergine = new CagetteAubergine.BuilderProduits(10, 4, "Cagette d'aubergine")
                .addConforme(false)
                .addId(3)
                .addQuantiteVegetalDansCagette(25)
                .addPrixVegetalUnite(0.75)
                .build();

        vegetales.add(aubergine);

        Produits carotte = new CagetteCarotte.BuilderProduits(10, 4, "Cagette de carotte")
                .addConforme(false)
                .addId(4)
                .addQuantiteVegetalDansCagette(25)
                .addPrixVegetalUnite(0.75)
                .build();

        vegetales.add(carotte);

        Produits Chou = new CagetteChou.BuilderProduits(10, 4, "Cagette de Chou")
                .addConforme(false)
                .addId(5)
                .addQuantiteVegetalDansCagette(25)
                .addPrixVegetalUnite(0.75)
                .build();

        vegetales.add(Chou);

        Produits fraise = new CagetteFraise.BuilderProduits(10, 4, "Cagette de Fraise")
                .addConforme(false)
                .addId(6)
                .addQuantiteVegetalDansCagette(25)
                .addPrixVegetalUnite(0.75)
                .build();

        vegetales.add(fraise);
        return vegetales;

    }

}
