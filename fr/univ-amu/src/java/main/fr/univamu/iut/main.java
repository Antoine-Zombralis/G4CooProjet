package fr.univamu.iut;

import fr.univamu.iut.Client.*;
import fr.univamu.iut.Client.Fermier.*;
import fr.univamu.iut.Produit.*;
import fr.univamu.iut.Produit.Arbre.*;
import fr.univamu.iut.Produit.Enum.CategorieCochon;
import fr.univamu.iut.Produit.Enum.CategorieVache;
import fr.univamu.iut.Produit.Enum.CategorieVolaille;
import fr.univamu.iut.Produit.Enum.EnumLabel;
import fr.univamu.iut.Produit.ProduitsLaitier.ProduitLaitier;
import fr.univamu.iut.Produit.Viande.Viande;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        List<Client> participants = new ArrayList<>();


        Fermier JeanLouis = new Horticulteur("JeanLouis", false, null);
        JeanLouis.setMonComte(new CompteBancaire(JeanLouis.getIdClient(), 1000));
        participants.add(JeanLouis);
        Fermier Micky = new Horticulteur("Micky", false, null);
        Micky.setMonComte(new CompteBancaire(Micky.getIdClient(), 750));
        participants.add(Micky);

        Fermier Patrick = new Arboriculteur("Patrick", false, null);
        Patrick.setMonComte(new CompteBancaire(Patrick.getIdClient(), 1350));
        participants.add(Patrick);
        Fermier Samuel = new Arboriculteur("Samuel", false, null);
        Samuel.setMonComte(new CompteBancaire(Samuel.getIdClient(), 7000));
        participants.add(Samuel);

        Fermier Antone = new ProducteurDeViande("Antone", false, null);
        Antone.setMonComte(new CompteBancaire(JeanLouis.getIdClient(), 200));
        participants.add(Antone);
        Fermier Corentin = new ProducteurDeViande("Corentin", false, null);
        Corentin.setMonComte(new CompteBancaire(Corentin.getIdClient(), 500));
        participants.add(Corentin);

        Fermier Nicolas = new ProducteurLaitier("Nicolas", false, null);
        Nicolas.setMonComte(new CompteBancaire(Nicolas.getIdClient(), 1500));
        participants.add(Nicolas);
        Fermier Augustin = new ProducteurLaitier("Augustin", false, null);
        Augustin.setMonComte(new CompteBancaire(Augustin.getIdClient(), 2000));
        participants.add(Augustin);

        Client Carrefour = new Grossiste("Carrefour", false, null);
        Carrefour.setMonComte(new CompteBancaire(Carrefour.getIdClient(), 50000));
        participants.add(Carrefour);

        Client Eric = new Detaillant("Eric", false, null);
        Eric.setMonComte(new CompteBancaire(Eric.getIdClient(), 2000));
        participants.add(Eric);

        Client centrale = new CentraleAchat("centrale d'achat", false, null);
        centrale.setMonComte(new CompteBancaire(centrale.getIdClient(), 6000));
        participants.add(centrale);

//        Client trader = new Trader("Trader", false, null);
//        trader.setMonComte(new CompteBancaire(trader.getIdClient(), 2500));

        RépertoireVente repertoireVente = new RépertoireVente();


        List<Vegetal> vegeJean = ((Horticulteur) JeanLouis).generationVegetalAleatoire(100);
        List<Vegetal> vegeMicky = ((Horticulteur) Micky).generationVegetalAleatoire(200);
        List<Arbre> arbrePatrick = ((Arboriculteur) Patrick).generationArbreAleatoire(200);
        List<Arbre> arbreSamuel = ((Arboriculteur) Samuel).generationArbreAleatoire(150);
        List<Viande> viandeAntone = ((ProducteurDeViande) Antone).generationViandeAleatoire(150, EnumLabel.ROUGE, CategorieCochon.LANDRACE_FRANCAIS, CategorieVolaille.CHAPON, CategorieVache.NORMANDE);
        List<Viande> viandeCorentin = ((ProducteurDeViande) Corentin).generationViandeAleatoire(300, EnumLabel.BBC, CategorieCochon.BASQUE, CategorieVolaille.FAISAN, CategorieVache.TARENTAISE);
        List<ProduitLaitier> produitLaitierNico = ((ProducteurLaitier) Nicolas).generationProduitLaitierAleatoire(425);
        List<ProduitLaitier> produitLaitierAugustin = ((ProducteurLaitier) Augustin).generationProduitLaitierAleatoire(250);


        ((Horticulteur) JeanLouis).ajouterDansRépertoire(vegeJean, repertoireVente);
        ((Horticulteur) Micky).ajouterDansRépertoire(vegeMicky, repertoireVente);
        ((Arboriculteur) Patrick).ajouterDansRépertoire(arbrePatrick, repertoireVente);
        ((Arboriculteur) Samuel).ajouterDansRépertoire(arbreSamuel, repertoireVente);
        ((ProducteurDeViande) Antone).ajouterDansRépertoire(viandeAntone, repertoireVente);
        ((ProducteurDeViande) Corentin).ajouterDansRépertoire(viandeCorentin,repertoireVente);
        ((ProducteurLaitier) Nicolas).ajouterDansRépertoire(produitLaitierNico, repertoireVente);
        ((ProducteurLaitier) Augustin).ajouterDansRépertoire(produitLaitierAugustin, repertoireVente);

        OffreAchat offreAchatVegetal0 = new OffreAchat(Eric, vegeJean.get(0), vegeJean.get(0).getPrix(), 2);
        JeanLouis.setOffreAchat(offreAchatVegetal0);
        JeanLouis.accepterOffre(true);
        JeanLouis.validerOffre();

        OffreAchat offreAchatVegetal1 = new OffreAchat(Eric, vegeJean.get(1), vegeJean.get(1).getPrix(), 3);
        Micky.setOffreAchat(offreAchatVegetal1);
        Micky.accepterOffre(true);
        Micky.validerOffre();

        System.out.println((vegeJean.get(0).getQuantite()));

        while (true) {
            Scanner sc = new Scanner(System.in);
            AfficherMenu();
            String str = sc.nextLine();
            if (str.equals("1")) {
                System.out.println("=============== LISTE DES PARTICIPANTS ===============");
                for(Client participant : participants){
                    System.out.println(participant.getNom() + " est présent avec un solde de " + participant.getMonComte().getSolde() +"\n" + "Il a obtenu les produits");
                    participant.afficherMesProduits();
                }
            }else if(str.equals("2")){

            }
            else if (str.equals("3")) {
                System.out.println("1 - Consulter les legumes à la vente \n" + "2 - Consulter les fruits à la vente \n" + "3 - Consulter les viandes à la vente \n" + "4 - Consulter les produits laitiers à la vente \n" + "5 - Consulter les arbres à la vente \n" + "6 - Consulter tous les produits à la vente \n");
                String choix = sc.nextLine();
                if (choix.equals("1"))
                    repertoireVente.afficherEtalageFruit();
                else if (choix.equals("2"))
                    repertoireVente.afficherEtalageLegume();
                else if (choix.equals("3"))
                    repertoireVente.afficherEtalageViande();
                else if (choix.equals("4"))
                    repertoireVente.afficherEtalageProduitLaitier();
                else if (choix.equals("5"))
                    repertoireVente.afficherEtalageArbre();
                else if (choix.equals("6")) {
                    repertoireVente.afficherEtalageViande();
                    repertoireVente.afficherEtalageArbre();
                    repertoireVente.afficherEtalageFruit();
                    repertoireVente.afficherEtalageProduitLaitier();
                    repertoireVente.afficherEtalageLegume();

                }
            }

        }
    }

    public static void AfficherMenu() {
        System.out.println("1 - Afficher l'emsemble des participants \n" + "2 - Consulter les transactions \n" + "3 - Consulter les répertoires de vente");
    }



}
