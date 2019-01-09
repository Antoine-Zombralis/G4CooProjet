package fr.univamu.iut.Test;

import fr.univamu.iut.Produit.Produits;
import fr.univamu.iut.Produit.Produits.BuilderProduits;
import java.util.ArrayList;
import org.junit.jupiter.api.Test;

class ControleurTest {
    ControleurTest() {
    }

    @Test
    final void supprimerProduitInterdits() {
        Produits produits = (new BuilderProduits(12, 23.9, "chicken")).volailleBuild();
        new ArrayList();
    }

    @Test
    final void ajouterProduitInterdits() {
        Produits produits = (new BuilderProduits(12, 23.9, "chicken")).volailleBuild();
    }
}