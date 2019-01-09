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
//        OffreAchat offreAchat = new OffreAchat() ;


        List<Vegetal> vegetals = generationVegetalAleatoire(100);
        List<Arbre> arbres = generationArbreAleatoire(200);
        List<Viande> viandes = generationViandeAleatoire(150, EnumLabel.ROUGE, CategorieCochon.LANDRACE_FRANCAIS, CategorieVolaille.CHAPON, CategorieVache.NORMANDE);
        List<ProduitLaitier> produitLaitiers = generationProduitLaitierAleatoire(425);

        ((Horticulteur) f1).cultiverVegetal(vegetals);
        ((Arboriculteur) f2).produireArbre(arbres);
        ((ProducteurDeViande) f3).produireViande(viandes);
        ((ProducteurLaitier) f4).produireProduitsLaitier(produitLaitiers);

        for(Vegetal vegetal:  vegetals){
            controleur.conformerProduit(vegetal);
            f1.ajouterCommercialisable(vegetal);
        }

        for(Arbre arbre : arbres){
            controleur.conformerProduit(arbre);
            f2.ajouterCommercialisable(arbre);
        }

        for(Viande viande : viandes){
            controleur.conformerProduit(viande);
            f3.ajouterCommercialisable(viande);
        }

        for(ProduitLaitier produitLaitier : produitLaitiers){
            controleur.conformerProduit(produitLaitier);
            f4.ajouterCommercialisable(produitLaitier);
        }

        Scanner sc = new Scanner(System.in);
        System.out.println("1 - Consulter les produits en vente\n" + "2 - Consulter les transactions \n");
        String str = sc.nextLine();

        if(str.equals("1")){
            f1.afficherCommercialisable();
            f2.afficherCommercialisable();
            f3.afficherCommercialisable();
            f4.afficherCommercialisable();
        }

        RépertoireVente repertoireVente = new RépertoireVente() ;

    }


    public static List<Arbre> generationArbreAleatoire(int nbDeProduitsAGenerer) {
        List<Arbre> produits = new ArrayList<>();
        int cptRosier = 0;
        int cptBanzai = 0;
        int cptSapin = 0;
        int cptPommier = 0;
        for (int i = 0; i < nbDeProduitsAGenerer; i++) {
            double alea = Math.random();
            if (alea < 0.25)
                ++cptRosier;
            else if (alea > 0.25 && alea < 0.5)
                ++cptBanzai;
            else if (alea > 0.50 && alea < 0.75)
                ++cptSapin;
            else
                ++cptPommier;
        }
        Rosier rosier = new Rosier.BuilderProduits(cptRosier, 45 * cptRosier, "Rosier fleurie")
                .rosierBuid();
        Pommier pommier = new Pommier.BuilderProduits(cptPommier, 250 * cptPommier, "Pommier d'Alsace")
                .pommierBuild();
        Sapin sapin = new Sapin.BuilderProduits(cptSapin, 25 * cptSapin, "Sapin de Noel")
                .sapinBuild();
        Banzai banzai = new Banzai.BuilderProduits(cptBanzai, 15 * cptBanzai, "Banzai")
                .banzaiBuild();
        produits.add(rosier);
        produits.add(pommier);
        produits.add(sapin);
        produits.add(banzai);

        return produits;
    }

    public static List<ProduitLaitier> generationProduitLaitierAleatoire(int nbDeProduitsAGenerer) {
            List<ProduitLaitier> produits = new ArrayList<>();
            int cptLait = 0 ;
            int cptFromage = 0 ;
            int cptBeurre = 0 ;
            for (int i = 0; i < nbDeProduitsAGenerer; i++) {
                double alea = Math.random() ;
                if (alea < 0.33)
                    ++cptLait ;
                else if (alea > 0.33 && alea <0.66)
                    ++cptBeurre ;
                else
                    ++cptFromage ;
            }
            Lait lait = new Lait.BuilderProduits(cptLait, 1.33 * cptLait, "Lait demi-écrémé")
                    .laitBuild();
            Beurre beurre = new Beurre.BuilderProduits(cptBeurre, 2 * cptBeurre, "Barquette de beurre")
                    .beurreBuild();
            Fromage fromage = new Fromage.BuilderProduits(cptFromage, 45 * cptFromage, "Fromage de brebis")
                    .fromageBuild();
            produits.add(lait) ;
            produits.add(beurre) ;
            produits.add(fromage) ;
            return produits;
        }

    public static List<Vegetal> generationVegetalAleatoire(int nbDeProduitsAGenerer) {
        List<Vegetal> produits = new ArrayList<>();

        int cptAubergine = 0 ;
            int cptCarotte = 0 ;
            int cptChou = 0 ;
            int cptFraise = 0 ;
            int cptPoire = 0 ;
            int cptPomme = 0 ;
            for (int i = 0; i < nbDeProduitsAGenerer; i++) {
                double alea = Math.random() ;
                if (alea < 0.166)
                    ++cptAubergine ;
                else if (alea > 0.166 && alea < 0.333)
                    ++cptCarotte ;
                else if (alea > 0.333 && alea < 0.5)
                    ++cptChou ;
                else if (alea > 0.5 && alea < 0.666)
                    ++cptFraise ;
                else if (alea > 0.666 && alea < 0.833)
                    ++cptPoire ;
                else
                    ++cptPomme ;
            }
            CagetteAubergine aubergine = new CagetteAubergine.BuilderProduits(cptAubergine, 2 * cptAubergine, "Cagette d'aubergines")
                    .addPrixVegetalUnite(2)
                    .aubergineBuild();
            CagetteCarotte carotte = new CagetteCarotte.BuilderProduits(cptCarotte, 2 * cptCarotte, "Cagette de carottes")
                    .addPrixVegetalUnite(2)
                    .carotteBuild();
            CagetteChou chou = new CagetteChou.BuilderProduits(cptChou, 1.25 * cptChou, "Cagette de chou")
                    .addPrixVegetalUnite(1.25)
                    .chouBuild();
            CagetteFraise fraise = new CagetteFraise.BuilderProduits(cptFraise, 13 * cptFraise, "Cagette de fraises")
                    .addPrixVegetalUnite(13)
                    .fraiseBuild();
            CagettePoire poire = new CagettePoire.BuilderProduits(cptPoire, 8 * cptPoire, "Cagette de poires")
                    .addPrixVegetalUnite(8)
                    .poireBuild() ;
            CagettePomme pomme = new CagettePomme.BuilderProduits(cptPomme, 5 * cptPomme, "Cagette de pommes")
                    .addPrixVegetalUnite(5)
                    .pommeBuild() ;
            produits.add(aubergine) ;
            produits.add(carotte) ;
            produits.add(chou) ;
            produits.add(fraise) ;
            produits.add(poire) ;
            produits.add(pomme) ;

            return produits;
        }
    public static List<Viande> generationViandeAleatoire(int nbDeProduitsAGenerer, EnumLabel label, CategorieCochon categorieCochon, CategorieVolaille categorieVolaille, CategorieVache categorieVache) {
        List<Viande> produits = new ArrayList<>();

        int cptCochon = 0 ;
            int cptVolaille = 0 ;
            int cptVache = 0 ;
            for (int i = 0; i < nbDeProduitsAGenerer; i++) {
                double alea = Math.random() ;
                if (alea < 0.33)
                    ++cptCochon ;
                else if (alea > 0.33 && alea <0.66)
                    ++cptVache ;
                else
                    ++cptVolaille ;
            }
            Cochon cochon = new Cochon.BuilderProduits(cptCochon, 24 * cptCochon, "Entrecote de porc")
                    .addLabel(label)
                    .addCategorieCochon(categorieCochon)
                    .cochonBuild();
            Vache vache = new Vache.BuilderProduits(cptVache, 36 * cptVache, "Steack de vache")
                    .addLabel(label)
                    .addCategorieVache(categorieVache)
                    .vacheBuild();
            Volaille volaille = new Volaille.BuilderProduits(cptVolaille, 15 * cptVolaille, "Poulet fermier")
                    .addLabel(label)
                    .addCategorieVolaille(categorieVolaille)
                    .volailleBuild();

            produits.add(cochon) ;
            produits.add(vache) ;
            produits.add(volaille) ;
            return produits;
        }



}
