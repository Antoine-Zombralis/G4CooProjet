package fr.univamu.iut;

public class Horticulteur extends Fermier {


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