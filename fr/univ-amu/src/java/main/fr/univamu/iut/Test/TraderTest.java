package fr.univamu.iut.Test;

import fr.univamu.iut.Client.Client;
import fr.univamu.iut.Client.Detaillant;
import fr.univamu.iut.Client.Fermier.Arboriculteur;
import fr.univamu.iut.Client.Trader;
import fr.univamu.iut.CompteBancaire;
import fr.univamu.iut.Controleur;
import fr.univamu.iut.Produit.Produits;
import fr.univamu.iut.Produit.Viande.Volaille;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TraderTest {


    @Test
    void supprimerProduit() {
        Client trader = new Trader("dédé", false, null);
        trader.setMonComte(new CompteBancaire(trader.getIdClient(), 2000));

        Produits poulet = new Volaille.BuilderProduits(12, 22, "chicken")
                .addProprio(trader)
                .volailleBuild();

        trader.supprimerProduit(poulet);
        for (Produits produit : trader.getMesProduitsAchetes()){
            if (produit.equals(poulet)) {
                fail("Ce produit n'a pas été supprimé !");
            }
        }
    }

    @Test
    void acheterProduit() {
        Client trader = new Trader("dédé", false, null);
        trader.setMonComte(new CompteBancaire(trader.getIdClient(), 2000));

        Produits poulet = new Volaille.BuilderProduits(12, 22, "chicken")
                .addProprio(trader)
                .volailleBuild();

        ((Trader) trader).acheterProduit(poulet);
        for (Produits produit : trader.getMesProduitsAchetes()){
            if (!produit.equals(poulet)) {
                fail("Ce produit n'a pas été ajouté !");
            }
        }
    }
}