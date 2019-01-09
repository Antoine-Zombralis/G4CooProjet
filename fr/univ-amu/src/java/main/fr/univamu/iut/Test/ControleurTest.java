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
        Controleur controleur = new Controleur();
        Produits produitAutorisé = new Volaille.BuilderProduits(12,23.9,"poulet autorisé").volailleBuild();
        controleur.supprimerProduitInterfits(produitAutorisé);
        for (Produits produit : controleur.getProduitInterdits()){
            if (produit.equals(produitAutorisé)) {
                fail("Ce produit est toujours interdit !");
            }
        }
    }

    @Test
    final void ajouterProduitInterdits() {
        int cpt = 0;
        Controleur controleur = new Controleur();
        Produits produitInterdit = new Volaille.BuilderProduits(12,23.9,"poulet interdit").volailleBuild();
        controleur.ajouterProduitInterdits(produitInterdit);
        for (Produits produit : controleur.getProduitInterdits()){
            if(produit.equals(produitInterdit)) {
                cpt = cpt + 1;
            }
        }
        if(cpt == 0) {
            fail("Ce produit n'est toujours pas interdit !");
        }
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