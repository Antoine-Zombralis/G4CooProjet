package fr.univamu.iut.Client.Fermier;

import fr.univamu.iut.CompteBancaire;
import fr.univamu.iut.Produit.ProduitsLaitier.ProduitLaitier;

import java.util.ArrayList;
import java.util.List;

public class ProducteurLaitier extends Fermier {

    private List<ProduitLaitier> mesProductions = new ArrayList<>();

    public ProducteurLaitier(String nom, boolean abonne, CompteBancaire monComte) {
        super(nom, abonne, monComte);
    }

    public void produireProduitsLaitier(List <ProduitLaitier> produitLaitier) {
        mesProductions.addAll(produitLaitier);
    }

    public List<ProduitLaitier> getMesProductions() {
        return mesProductions;
    }
}
