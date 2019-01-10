package fr.univamu.iut.Test;

import fr.univamu.iut.Client.Client;
import fr.univamu.iut.Client.Fermier.Arboriculteur;
import fr.univamu.iut.Client.Fermier.Fermier;
import fr.univamu.iut.Client.Trader;
import fr.univamu.iut.CompteBancaire;
import fr.univamu.iut.Produit.Arbre.Arbre;
import fr.univamu.iut.Produit.Arbre.Banzai;
import fr.univamu.iut.Produit.Produits;
import fr.univamu.iut.Produit.Viande.Volaille;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ArboriculteurTest {


    @Test
    void supprimerProduit() {
        Fermier arboriculteur = new Arboriculteur("dédé", false, null);
        arboriculteur.setMonComte(new CompteBancaire(arboriculteur.getIdClient(), 2000));

        Produits banzai = new Banzai.BuilderProduits(12, 22, "banzai")
                .addProprio(arboriculteur)
                .banzaiBuild();

        arboriculteur.supprimerProduit(banzai);
        for (Produits produit : arboriculteur.getMesProduitsAchetes()){
            if (produit.equals(banzai)) {
                fail("Ce produit n'a pas été supprimé !");
            }
        }
    }

    @Test
    void ajouterCommercialisable() {
        Fermier arboriculteur = new Arboriculteur("dédé", false, null);
        arboriculteur.setMonComte(new CompteBancaire(arboriculteur.getIdClient(), 2000));

        Produits banzai = new Banzai.BuilderProduits(12, 22, "banzaiSpécial")
                .addProprio(arboriculteur)
                .banzaiBuild();

        arboriculteur.ajouterCommercialisable(banzai);
        for (Produits produits : ((Arboriculteur) arboriculteur).getMesProduitsCommercialisables()) {
            if (banzai.getNom() != produits.getNom()) {
                fail("Le produit n'a pas été ajouté !");
            }
        }
    }
}