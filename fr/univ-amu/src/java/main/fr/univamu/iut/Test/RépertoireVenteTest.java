package fr.univamu.iut.Test;

import fr.univamu.iut.Produit.Produits;
import fr.univamu.iut.Produit.Viande.Viande;
import fr.univamu.iut.Produit.Viande.Volaille;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RépertoireVenteTest {

    @Test
    void ajouterViande() {
    }

    @Test
    void supprimerViande() {
        RépertoireVenteTest répertoire = new RépertoireVenteTest();
        Viande viande = new Viande.BuilderProduits(12,25,"poulet").volailleBuild();
        répertoire.supprimerViande(viande);
    }

    @Test
    void afficherEtalageViande() {
    }
}