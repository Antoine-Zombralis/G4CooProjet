package fr.univamu.iut;

import java.util.List;

public class ProducteurDeViande extends Fermier {

    private List<Viande> mesProductions;

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

    public List<Viande> getMesProductions() {
        return mesProductions;
    }
}