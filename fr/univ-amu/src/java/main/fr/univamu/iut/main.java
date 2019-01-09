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

        Client trader = new Trader("Trader", false, null);
        trader.setMonComte(new CompteBancaire(trader.getIdClient(), 2500));
        participants.add(trader);

        RépertoireVente repertoireVente = new RépertoireVente();


        List<Vegetal> vegeJean = ((Horticulteur) JeanLouis).generationVegetalAleatoire(100);
        List<Vegetal> vegeMicky = ((Horticulteur) Micky).generationVegetalAleatoire(200);
        List<Arbre> arbrePatrick = ((Arboriculteur) Patrick).generationArbreAleatoire(200);
        List<Arbre> arbreSamuel = ((Arboriculteur) Samuel).generationArbreAleatoire(150);
        List<Viande> viandeAntone = ((ProducteurDeViande) Antone).generationViandeAleatoire(10000, EnumLabel.ROUGE, CategorieCochon.LANDRACE_FRANCAIS, CategorieVolaille.CHAPON, CategorieVache.NORMANDE);
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

        OffreAchat offreAchatVegetal1 = new OffreAchat(Eric, vegeJean.get(1), vegeJean.get(1).getPrix(), 4);
        JeanLouis.setOffreAchat(offreAchatVegetal1);
        JeanLouis.accepterOffre(true);
        JeanLouis.validerOffre();

        OffreAchat offreAchatVegetal2 = new OffreAchat(Eric, vegeMicky.get(2), vegeMicky.get(2).getPrix(), 5);
        Micky.setOffreAchat(offreAchatVegetal2);
        Micky.accepterOffre(true);
        Micky.validerOffre();

        OffreAchat offreAchatViande = new OffreAchat(Carrefour, viandeAntone.get(0), viandeAntone.get(0).getPrix(), 200);
        Antone.setOffreAchat(offreAchatViande);
        Antone.accepterOffre(true);
        Antone.validerOffre();

        OffreAchat offreAchatArbre = new OffreAchat(centrale, arbreSamuel.get(1), arbreSamuel.get(1).getPrix(), 20);
        Samuel.setOffreAchat(offreAchatArbre);
        Samuel.accepterOffre(true);
        Samuel.validerOffre();

        OffreAchat offreLait = new OffreAchat(trader, produitLaitierNico.get(2), 1, 10);
        Nicolas.setOffreAchat(offreLait);
        //Nicolas est pas d'accord avec cette offre
        offreLait.setMontant(4);
        ((Trader) trader).Negocier(offreLait, 3);
        //Trader negocie el prix
        Nicolas.accepterOffre(true);
        Nicolas.validerOffre();

        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("1 - Afficher l'emsemble des participants \n" + "2 - Consulter les transactions \n" + "3 - Consulter les répertoires de vente\n" + "4 - Prix moyens des produits sur le marché");
            String str = sc.nextLine();
            if (str.equals("1")) {
                System.out.println("=============== LISTE DES PARTICIPANTS ===============");
                for(Client participant : participants){
                    System.out.println(participant.getNom() + " est présent avec un solde de " + participant.getMonComte().getSolde() +"\n" + "Il a obtenu les produits");
                    participant.afficherMesProduits();
                }
            }else if(str.equals("2")){
                for(Transaction transaction : Client.getTransactionsClient()){
                    System.out.println("Transaction entre " + transaction.getAcheteur().getNom() + " et " + transaction.getVendeur().getNom() + " du montant " + transaction.getMontant() + "$\n");
                }
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
            else if(str.equals("4")){
                double prix = 0;
                int cpt = 0;
                for(Vegetal vegetal : repertoireVente.getFruitsEnVente()){
                    ++cpt;
                    prix += vegetal.getPrix();
                }
                for(Vegetal vegetal : repertoireVente.getLegumesEnVente()){
                    ++cpt;
                    prix += vegetal.getPrix();
                }
                for(ProduitLaitier laitier : repertoireVente.getProduitLaitiersEnVente()){
                    ++cpt;
                    prix += laitier.getPrix();
                }
                for(Arbre vegetal : repertoireVente.getArbresEnVente()){
                    ++cpt;
                    prix += vegetal.getPrix();
                }
                for(Viande viande : repertoireVente.getViandesEnVente()){
                    ++cpt;
                    prix += viande.getPrix();
                }

                System.out.println("============= PRIX MOYEN DES VENTES =============\n" + "Le prix moyen de tous les produits en ventes est de " + prix/cpt + "$\n");
            }

        }
    }




}
