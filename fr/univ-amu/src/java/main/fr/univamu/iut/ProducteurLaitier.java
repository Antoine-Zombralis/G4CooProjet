package fr.univamu.iut;

import fr.univamu.iut.Produit.Vache;

import java.util.ArrayList;
import java.util.List;

public class ProducteurLaitier extends Fermier {

    private List<Vache> mesProductions;

    public ProducteurLaitier(String nom, boolean abonne, int idClient, int idVendeur, CompteBancaire monComte) {
        super(nom, abonne, idClient, idVendeur, monComte);
        mesProductions = new ArrayList<>();
    }

    public void produiretLait(Vache vache) {

        mesProductions.add(vache);

    }

    public List<Vache> getMesProductions() {
        return mesProductions;
    }
}