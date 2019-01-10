package fr.univamu.iut.Test;

import fr.univamu.iut.Produit.Arbre.Banzai;
import fr.univamu.iut.Produit.FruitEtLegume.CagetteChou;
import fr.univamu.iut.Produit.FruitEtLegume.CagetteFraise;
import fr.univamu.iut.Produit.FruitEtLegume.Legume;
import fr.univamu.iut.Produit.Produits;
import fr.univamu.iut.Produit.ProduitsLaitier.Lait;
import fr.univamu.iut.Produit.Viande.Viande;
import fr.univamu.iut.Produit.Viande.Volaille;
import org.junit.jupiter.api.Test;


class RépertoireVenteTest {

    @Test
    void ajouterProduit() {
        Produits viande = new Volaille.BuilderProduits(5,5,"chicken").volailleBuild();

        Produits legume = new CagetteChou.BuilderProduits(50,5,"cagetteCHOUX").chouBuild();

        Produits arbres = new Banzai.BuilderProduits(3,10,"banzais").banzaiBuild();

        Produits lait = new Lait.BuilderProduits(100,20,"milk").laitBuild();

        Produits fruit = new CagetteFraise.BuilderProduits(50,5,"cagetteCHOUX").fraiseBuild();

        RépertoireVenteTest répertoire = new RépertoireVenteTest();

        //...

    }

}