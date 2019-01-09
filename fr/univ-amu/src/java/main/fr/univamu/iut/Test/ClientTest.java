package fr.univamu.iut.Test;

import fr.univamu.iut.Client.Client;
import fr.univamu.iut.Client.Detaillant;
import fr.univamu.iut.Client.Fermier.Fermier;
import fr.univamu.iut.Client.Fermier.Horticulteur;
import fr.univamu.iut.CompteBancaire;
import fr.univamu.iut.OffreAchat;
import fr.univamu.iut.Produit.Produits;
import fr.univamu.iut.Produit.Viande.Volaille;
import fr.univamu.iut.Transaction;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

class ClientTest {

    @Test
    final void acheterProduit() {
        int cptVendeur = 0;
        int cptTransaction = 0;
        Client  client = new Detaillant("dédé", false, null);
        client.setMonComte(new CompteBancaire(client.getIdClient(), 2000));
        double SoldeClientAvantAchat = client.getMonComte().getSolde();

        Client  vendeur = new Detaillant("gégé", false, null);
        vendeur.setMonComte(new CompteBancaire(vendeur.getIdClient(), 3000));
        double SoldeVendeurAvantAchat = vendeur.getMonComte().getSolde();

        Produits poulet = new Volaille.BuilderProduits(12, 22, "chicken")
                .addProprio(vendeur)
                .volailleBuild();

        int QuantiteAvantAchat = poulet.getQuantite();
        client.acheterProduit(poulet,vendeur,3);
        if (QuantiteAvantAchat == poulet.getQuantite()) {
            fail("Le stock de poulet n'a pas changé malgré l'achat !");
        }
        for (Produits produits : client.getMesProduitsAchetes())
        {
            if (poulet.getNom() != produits.getNom()) {
                fail("Le produit acheté n'a pas été ajouté au stock des produits achetés du client !");
            }
        }
        for (Produits produits : vendeur.getMesProduitsAchetes())
        {
            if (produits == poulet) {
                cptVendeur = cptVendeur + 1;
            }
        }
        if (cptVendeur != 0) {
            fail("Le produit vendu n'a pas été enlevé du stock des produits achetés du vendeur !");
        }
        if(SoldeClientAvantAchat == client.getMonComte().getSolde()) {
            fail("Le compte client n'a pas été débité !");
        }
        if(SoldeVendeurAvantAchat == vendeur.getMonComte().getSolde()) {
            fail("Le compte vendeur n'a pas été crédité !");
        }
        for (Transaction transaction : client.getTransaction().getTransactions()) {
            if (transaction == client.getTransaction()) {
                cptTransaction = cptTransaction + 1;
            }
        }
        if (cptTransaction == 0) {
            fail("La transaction n'a pas été ajouté !");
        }
    }

    @Test
    final void notifierClient() {
        CompteBancaire compteClient = new CompteBancaire(2222, 0);
        Client client = new Detaillant("gégé", true, compteClient);
        String res = "De nouveaux produits ont été mis en vente pour vous gégé";
        String affiche = client.notifierClient(client);
        if (!(res.equalsIgnoreCase(affiche))) {
            fail("non");
        }
    }

    @Test
    final void validerOffre() {
        Fermier client = new Horticulteur("dédé", false, null);
        client.setMonComte(new CompteBancaire(client.getIdClient(), 2000));

        Client  vendeur = new Detaillant("gégé", false, null);
        vendeur.setMonComte(new CompteBancaire(vendeur.getIdClient(), 3000));

        Produits poulet = new Volaille.BuilderProduits(20, 22, "chicken").volailleBuild();

        OffreAchat offre = new OffreAchat(vendeur, poulet, poulet.getPrix(), 5);

        client.setOffreAchat(offre);
        client.accepterOffre(true);
        client.validerOffre();
        if (!client.getOffreAchat().isAccepter()) {
            fail("L'offre n'a pas été validée !");
        }
        //...
    }

    @Test
    void accepterOffre() {
        CompteBancaire compteClient = new CompteBancaire(2222, 25);
        Client vendeur = new Detaillant("gégé", true, compteClient);
        Produits poulet = new Volaille.BuilderProduits(12, 3, "chicken").volailleBuild();
        OffreAchat offre = new OffreAchat(vendeur,poulet,22,1);
        vendeur.setOffreAchat(offre);
        vendeur.accepterOffre(true);
        if (!offre.isAccepter()) {
            fail("L'offre n'a pas été acceptée");
        }
    }
}