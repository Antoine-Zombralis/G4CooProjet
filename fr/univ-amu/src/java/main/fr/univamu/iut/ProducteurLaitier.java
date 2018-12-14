package fr.univamu.iut;

public class ProducteurLaitier extends Fermier {

    public ProducteurLaitier(String nom, boolean abonne, int idClient, int idVendeur, CompteBancaire monComte) {
        super(nom, abonne, idClient, idVendeur, monComte);
    }

    public void produiretLait(Vache vache) {

        mesProductions.add(vache);

    }

}