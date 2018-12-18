package fr.univamu.iut;

import java.util.List;

public class ProducteurLaitier extends Fermier {

    private List<Vache> mesProductions;

    public ProducteurLaitier(String nom, boolean abonne, int idClient, int idVendeur, CompteBancaire monComte) {
        super(nom, abonne, idClient, idVendeur, monComte);
    }

    public void produiretLait(Vache vache) {

        mesProductions.add(vache);

    }

    public List<Vache> getMesProductions() {
        return mesProductions;
    }
}