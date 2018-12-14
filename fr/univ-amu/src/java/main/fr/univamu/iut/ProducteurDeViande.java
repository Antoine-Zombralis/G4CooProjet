package fr.univamu.iut;

public class ProducteurDeViande extends Fermier {

    public ProducteurDeViande(String nom, boolean abonne, int idClient, int idVendeur, CompteBancaire monComte) {
        super(nom, abonne, idClient, idVendeur, monComte);
    }

    public void produireVache(Vache vache){
        mesProductions.add(vache);
    }

    public void produireCochon(Cochon cochon){
        mesProductions.add(cochon);
    }
    public void produireVolaille(Volaille volaille){
        mesProductions.add(volaille);
    }
}