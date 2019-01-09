package fr.univamu.iut;

import fr.univamu.iut.Client.*;
import fr.univamu.iut.Client.Fermier.*;
import fr.univamu.iut.Produit.*;
import fr.univamu.iut.Produit.Arbre.*;
import fr.univamu.iut.Produit.Enum.CategorieCochon;
import fr.univamu.iut.Produit.Enum.CategorieVache;
import fr.univamu.iut.Produit.Enum.CategorieVolaille;
import fr.univamu.iut.Produit.Enum.EnumLabel;
import fr.univamu.iut.Produit.FruitEtLegume.*;
import fr.univamu.iut.Produit.ProduitsLaitier.Beurre;
import fr.univamu.iut.Produit.ProduitsLaitier.Fromage;
import fr.univamu.iut.Produit.ProduitsLaitier.Lait;
import fr.univamu.iut.Produit.ProduitsLaitier.ProduitLaitier;
import fr.univamu.iut.Produit.Viande.Cochon;
import fr.univamu.iut.Produit.Viande.Vache;
import fr.univamu.iut.Produit.Viande.Viande;
import fr.univamu.iut.Produit.Viande.Volaille;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

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

        Client grossiste = new Grossiste("grossiste", false, null);
        grossiste.setMonComte(new CompteBancaire(grossiste.getIdClient(), 5000));

        Client detaillant = new Detaillant("detaillant", false, null);
        detaillant.setMonComte(new CompteBancaire(detaillant.getIdClient(), 2000));

        Client centrale = new CentraleAchat("centrale d'achat", false, null);
        centrale.setMonComte(new CompteBancaire(centrale.getIdClient(), 6000));

        Client trader = new Trader("Trader", false, null);
        trader.setMonComte(new CompteBancaire(trader.getIdClient(), 2500));


        Controleur controleur = new Controleur();
        RépertoireVente repertoireVente = new RépertoireVente();


        List<Vegetal> vegetals = ((Horticulteur) f1).generationVegetalAleatoire(100);
        List<Arbre> arbres = ((Arboriculteur) f2).generationArbreAleatoire(200);
        List<Viande> viandes = ((ProducteurDeViande)f3).generationViandeAleatoire(150, EnumLabel.ROUGE, CategorieCochon.LANDRACE_FRANCAIS, CategorieVolaille.CHAPON, CategorieVache.NORMANDE);
        List<ProduitLaitier> produitLaitiers = ((ProducteurLaitier) f4).generationProduitLaitierAleatoire(425);

        ((Horticulteur) f1).cultiverVegetal(vegetals);
        ((Arboriculteur) f2).produireArbre(arbres);
        ((ProducteurDeViande) f3).produireViande(viandes);
        ((ProducteurLaitier) f4).produireProduitsLaitier(produitLaitiers);

        for(Vegetal vegetal:  vegetals){
            controleur.validerProduit(vegetal);
            f1.ajouterCommercialisable(vegetal);
        }

        for(Arbre arbre : arbres){
            controleur.validerProduit(arbre);
            f2.ajouterCommercialisable(arbre);
        }

        for(Viande viande : viandes){
            controleur.validerProduit(viande);
            f3.ajouterCommercialisable(viande);
        }

        for(ProduitLaitier produitLaitier : produitLaitiers){
            controleur.validerProduit(produitLaitier);
            f4.ajouterCommercialisable(produitLaitier);
        }

        OffreAchat offreAchatVegetal = new OffreAchat(detaillant, vegetals.get(0), vegetals.get(0).getPrix(), 10) ;
        f1.setOffreAchat(offreAchatVegetal);
        f1.accepterOffre(true);
        f1.validerOffre();

        System.out.println(detaillant.getMonComte().getSolde());

        Scanner sc = new Scanner(System.in);
        System.out.println("1 - Consulter les produits en vente \n" + "2 - Consulter les transactions \n" + "3 - Consulter les répertoires de vente");
        String str = sc.nextLine();

        if(str.equals("1")){
            f1.afficherCommercialisable();
            f2.afficherCommercialisable();
            f3.afficherCommercialisable();
            f4.afficherCommercialisable();
        }
        else if (str.equals("3")) {
            System.out.println("1 - Consulter les légumes à la vente \n" + "2 - Consulter les fruits à la vente \n" + "3 - Consulter les viandes à la vente \n ");
            String choix = sc.nextLine();
            if (choix.equals("1")) {
                repertoireVente.afficherEtalageFruit();
            }
            else if (choix.equals("2")) {
                repertoireVente.afficherEtalageLegume();

            }
            else if (choix.equals("3"))
                repertoireVente.afficherEtalageViande();

        }

    }



}
