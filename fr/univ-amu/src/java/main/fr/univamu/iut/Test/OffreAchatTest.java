//package fr.univamu.iut.Test;
//
//import fr.univamu.iut.CompteBancaire;
//import fr.univamu.iut.OffreAchat;
//import fr.univamu.iut.Client.Client;
//import fr.univamu.iut.Client.Detaillant;
//import fr.univamu.iut.Produit.Produits;
//import fr.univamu.iut.Produit.Produits.BuilderProduits;
//import org.junit.jupiter.api.Test;
//
//import static org.junit.jupiter.api.Assertions.fail;
//
//class Test {
//
//    @Test
//    void accepterOffre() {
//        CompteBancaire compteClient = new CompteBancaire(2222, 150);
//        Client monCreateur = new Detaillant("gégé", true, compteClient);
//        Produits produits = (new BuilderProduits(12, 23.9, "chicken")).volailleBuild();
//        OffreAchat offre = new OffreAchat(monCreateur, produits, 12,14);
//        monCreateur.accepterOffre(true);
//        if (!offre.isAccepter()) {
//            fail("Vous n'avez pas assez d'argent pour effectuer la transaction");
//        }
//
//    }
//}