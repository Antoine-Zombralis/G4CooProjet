package fr.univamu.iut;

import fr.univamu.iut.Client.Client;
import fr.univamu.iut.Client.Grossiste;
import fr.univamu.iut.Client.Fermier.*;
import fr.univamu.iut.Produit.*;

import java.util.ArrayList;
import java.util.List;

public class main {

    public static void main(String[] args) {


        Fermier f1 = new Horticulteur("f1", false, null);
        f1.setMonComte(new CompteBancaire(f1.getIdClient(),1000));

        Fermier f2 = new Arboriculteur("f2", false, null);
        f2.setMonComte(new CompteBancaire(f2.getIdClient(), 1000));

        Fermier f3 = new ProducteurDeViande("f3", false, null);
        f3.setMonComte(new CompteBancaire(f1.getIdClient(), 1000));

        Fermier f4 = new ProducteurLaitier("f4", false, null);
        f4.setMonComte(new CompteBancaire(f4.getIdClient(), 1000));

        Controleur controleur = new Controleur();
        RépertoireVente repertoireVente = new RépertoireVente() ;
        Client c1 = new Grossiste("c1", false, new CompteBancaire(2, 1000));


        for(Vegetal vegetal :  creationProduitHorticulteur()){
            ((Horticulteur) f1).cultiverVegetal(vegetal);
            controleur.validerProduit(vegetal);
            if (vegetal.isConforme()){
                f1.ajouterCommercialisable(vegetal);
                if (vegetal instanceof Legume)
                    repertoireVente.ajouterLegume(vegetal);
                else if (vegetal instanceof Fruit)
                    repertoireVente.ajouterFruit(vegetal);
            }
        }

        f1.afficherCommercialisable();

        for(Produits vegetal : f1.getMesProduitsCommercialisable()){
            if(vegetal.getId() == 5){
                c1.acheterProduit(vegetal, f1);
            }
        }

        System.out.println(c1.getMonComte().getSolde());

        Vegetal carotte = new CagetteCarotte.BuilderProduits(10, 4, "Cagette de carotte")
                .addConforme(false)
                .addQuantiteVegetalDansCagette(25)
                .addPrixVegetalUnite(0.75)
                .carotteBuild();

        System.out.println(carotte.getDatePeremption());
    }

    public static List<Vegetal> creationProduitHorticulteur(){

        List<Vegetal> vegetals = new ArrayList<>();

        Vegetal poire = new CagettePoire.BuilderProduits(5, 10, "Cagette de poire")
                .addConforme(false)
                .addPrixVegetalUnite(0.50)
                .addQuantiteVegetalDansCagette(20)
                .poireBuild();

        vegetals.add(poire);

        Vegetal pomme = new CagettePomme.BuilderProduits(10, 4, "Cagette de pomme")
                .addConforme(false)
                .addQuantiteVegetalDansCagette(25)
                .addPrixVegetalUnite(0.75)
                .pommeBuild();

        vegetals.add(pomme);

        Vegetal aubergine = new CagetteAubergine.BuilderProduits(10, 4, "Cagette d'aubergine")
                .addConforme(false)
                .addQuantiteVegetalDansCagette(25)
                .addPrixVegetalUnite(0.75)
                .aubergineBuild();

        vegetals.add(aubergine);

        Vegetal carotte = new CagetteCarotte.BuilderProduits(10, 4, "Cagette de carotte")
                .addConforme(false)
                .addQuantiteVegetalDansCagette(25)
                .addPrixVegetalUnite(0.75)
                .carotteBuild();

        vegetals.add(carotte);

        Vegetal Chou = new CagetteChou.BuilderProduits(10, 4, "Cagette de Chou")
                .addConforme(false)
                .addQuantiteVegetalDansCagette(25)
                .addPrixVegetalUnite(0.75)
                .chouBuild();

        vegetals.add(Chou);

        Vegetal fraise = new CagetteFraise.BuilderProduits(10, 4, "Cagette de Fraise")
                .addConforme(false)
                .addQuantiteVegetalDansCagette(25)
                .addPrixVegetalUnite(0.75)
                .fraiseBuild();

        vegetals.add(fraise);
        return vegetals;




    }
    public List<Produits> GenerationProduitAléatoire(int nbDeProduitsAGénérer, Fermier fermier) {
        List<Produits> produits = new ArrayList<>() ;
        if (fermier instanceof Arboriculteur) {
            for (int i = 0; i < nbDeProduitsAGénérer; i++) {
                double alea = Math.random() ;


            }
        }
        return produits ;
    }

}
