package fr.univamu.iut.Client.Fermier;

import fr.univamu.iut.CompteBancaire;
import fr.univamu.iut.Produit.Vache;

import java.util.ArrayList;
import java.util.List;

public class ProducteurLaitier extends Fermier {

    private List<Vache> mesProductions;

    public ProducteurLaitier(String nom, boolean abonne, CompteBancaire monComte) {
        super(nom, abonne, monComte);
        mesProductions = new ArrayList<>();
    }

    public void produiretLait(Vache vache) {

        mesProductions.add(vache);

    }

    public List<Vache> getMesProductions() {
        return mesProductions;
    }
}