package fr.univamu.iut;

import java.util.List;

public class Horticulteur extends Fermier {

    private List<Vegetal> mesProductions;

    public Horticulteur(String nom, boolean abonne, int idClient, int idVendeur, CompteBancaire monComte) {
        super(nom, abonne, idClient, idVendeur, monComte);
    }

    public void cultiverFruit(Fruit fruit) {
        mesProductions.add(fruit);
    }

    public void cultiverLegume(Legume legume) {
        mesProductions.add(legume);
    }

}