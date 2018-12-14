package fr.univamu.iut;

public class Horticulteur extends Fermier {


    public Horticulteur(String prenom, String nom, int id, CompteBancaire monCompte) {
        super(prenom, nom, id, monCompte);
    }

    public void cultiverFruit(Fruit fruit) {
        mesProductions.add(fruit);
    }

    public void cultiverLegume(Legume legume) {
        mesProductions.add(legume);
    }

}