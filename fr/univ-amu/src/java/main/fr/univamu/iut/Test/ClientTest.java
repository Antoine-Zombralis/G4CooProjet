package fr.univamu.iut.Test;

import fr.univamu.iut.Client.Client;
import fr.univamu.iut.Client.Detaillant;
import fr.univamu.iut.CompteBancaire;
import fr.univamu.iut.OffreAchat;
import fr.univamu.iut.Produit.Produits;
import fr.univamu.iut.Produit.Viande.Volaille;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

class ClientTest {

    @Test
    final void acheterProduit() {
        CompteBancaire compteVendeur = new CompteBancaire(2222,1000);
        Client vendeur = new Detaillant("gégé", true, compteVendeur);
        CompteBancaire compteClient = new CompteBancaire(2222, 1000);
        Client client = new Detaillant("dédé", true, compteClient);
        double SoldeAvantAchat = client.getMonComte().getSolde();
        Produits poulet = new Volaille.BuilderProduits(12, 22, "chicken")
                .addProprio(vendeur)
                .volailleBuild();
        client.acheterProduit(poulet,vendeur,3);
        System.out.println(poulet.getQuantite());
        if(SoldeAvantAchat == client.getMonComte().getSolde()) {
            fail("L'achat n'a pas eu lieu");
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

//    @Test
//    final void validerOffre() {
//        CompteBancaire compteClient = new CompteBancaire(2222, 25);
//        Client vendeur = new Detaillant("gégé", true, compteClient);
//        Produits poulet = new Volaille.BuilderProduits(12, 22, "chicken").volailleBuild();
//        OffreAchat offre = new OffreAchat(vendeur, poulet, 12, 10);
//        double SoldeAvantAchat = 0;
//        SoldeAvantAchat = compteClient.getSolde();
//        vendeur.validerOffre();
//        if (SoldeAvantAchat == compteClient.getSolde()) {
//            fail("L'offre n'a pas été validée !");
//        }
//    }

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