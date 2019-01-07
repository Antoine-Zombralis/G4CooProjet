package fr.univamu.iut;

import fr.univamu.iut.Fermier.*;
import fr.univamu.iut.Produit.*;

import java.util.ArrayList;
import java.util.List;

public class main {

    public static void main(String[] args) {

        Fermier f1 = new Horticulteur("f1", false, 1, 1, new CompteBancaire(1, 1000));
        Fermier f2 = new Arboriculteur("f2", false, 2, 2, new CompteBancaire(2, 1000));
        Fermier f3 = new ProducteurDeViande("f3", false, 3, 3, new CompteBancaire(3, 1000));
        Fermier f4 = new ProducteurLaitier("f4", false, 4, 4, new CompteBancaire(4, 1000));

        Controleur controleur = new Controleur();
        GrandLivreDuMarche livreDuMarche = new GrandLivreDuMarche() ;
        RépertoireVente répertoireVente = new RépertoireVente() ;

        Client c1 = new Grossiste("c1", false, 2, new CompteBancaire(2, 1000));


        for(Vegetal vegetal :  creationProduitHorticulteur()){
            ((Horticulteur) f1).cultiverVegetal(vegetal);
            controleur.validerProduit(vegetal);
            if (vegetal.isConforme()){
                f1.ajouterCommercialisable(vegetal);
            }
        }

        f1.afficherCommercialisable();

        for(Produits vegetale : f1.getMesProduitsCommercialisable()){
            if(vegetale.getId() == 5){
                c1.acheterProduit(vegetale);
                Transaction transac1 = new Transaction(1, f1, c1, vegetale);
                transac1.addTransaction(transac1);
            }
        }

        System.out.println(c1.getMonComte().getSolde());

    }

    public static List<Vegetal> creationProduitHorticulteur(){

        List<Vegetal> vegetals = new ArrayList<>();

        Vegetal poire = new CagettePoire.BuilderProduits(5, 10, "Cagette de poire")
                .addConforme(false)
                .addId(1)
                .addPrixVegetalUnite(0.50)
                .addQuantiteVegetalDansCagette(20)
                .poireBuild();

        vegetals.add(poire);

        Vegetal pomme = new CagettePomme.BuilderProduits(10, 4, "Cagette de pomme")
                .addConforme(false)
                .addId(2)
                .addQuantiteVegetalDansCagette(25)
                .addPrixVegetalUnite(0.75)
                .pommeBuild();

        vegetals.add(pomme);

        Vegetal aubergine = new CagetteAubergine.BuilderProduits(10, 4, "Cagette d'aubergine")
                .addConforme(false)
                .addId(3)
                .addQuantiteVegetalDansCagette(25)
                .addPrixVegetalUnite(0.75)
                .aubergineBuild();

        vegetals.add(aubergine);

        Vegetal carotte = new CagetteCarotte.BuilderProduits(10, 4, "Cagette de carotte")
                .addConforme(false)
                .addId(4)
                .addQuantiteVegetalDansCagette(25)
                .addPrixVegetalUnite(0.75)
                .carotteBuild();

        vegetals.add(carotte);

        Vegetal Chou = new CagetteChou.BuilderProduits(10, 4, "Cagette de Chou")
                .addConforme(false)
                .addId(5)
                .addQuantiteVegetalDansCagette(25)
                .addPrixVegetalUnite(0.75)
                .chouBuild();

        vegetals.add(Chou);

        Vegetal fraise = new CagetteFraise.BuilderProduits(10, 4, "Cagette de Fraise")
                .addConforme(false)
                .addId(6)
                .addQuantiteVegetalDansCagette(25)
                .addPrixVegetalUnite(0.75)
                .fraiseBuild();
        vegetals.add(fraise);
        return vegetals;

    }

}
