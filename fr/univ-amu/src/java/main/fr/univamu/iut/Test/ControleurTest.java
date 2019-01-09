package fr.univamu.iut.Test;

import fr.univamu.iut.Controleur;
import fr.univamu.iut.Produit.Produits;
import fr.univamu.iut.Produit.Produits.BuilderProduits;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

import fr.univamu.iut.Produit.Viande.Cochon;
import fr.univamu.iut.Produit.Viande.Vache;
import fr.univamu.iut.Produit.Viande.Volaille;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.fail;

class ControleurTest {
    ControleurTest() {
    }

    @Test
    final void supprimerProduitInterdits() {
        Produits produits = new Volaille.BuilderProduits(12,23.9,"chicken").volailleBuild();
    }

    @Test
    final void ajouterProduitInterdits() {
        Produits produits = new Volaille.BuilderProduits(12,23.9,"chicken").volailleBuild();
    }

    @Test
    final void validerProduit() {
        Controleur controleur = new Controleur();
        Produits produitPérimé = new Volaille.BuilderProduits(12,23.9,"poulet périmé").volailleBuild();
        Calendar calendar = Calendar.getInstance();
        calendar.set(2019,0,7,12,23,15);
        produitPérimé.setDatePeremption(calendar.getTime());
        Produits produitInterdit = new Cochon.BuilderProduits(12,23.9,"cochon interdit").cochonBuild();
        controleur.ajouterProduitInterdits(produitInterdit);
        Produits produitAutorisé = new Vache.BuilderProduits(12,25,"vache valide").vacheBuild();
        controleur.validerProduit(produitInterdit);
        controleur.validerProduit(produitPérimé);
        controleur.validerProduit(produitAutorisé);
        System.out.println(produitPérimé.getDatePeremption());
        if (produitInterdit.isConforme()) {
            fail("Erreur, ce produit a été validé alors qu'il était interdit !");
        }
        if (produitPérimé.isConforme()) {
            fail("Erreur, ce produit a été validé alors qu'il était périmé !");
        }
        if (!produitAutorisé.isConforme()) {
            fail("Erreur, ce produit n a pas été validé alors qu'il était valide!");
        }
    }
}