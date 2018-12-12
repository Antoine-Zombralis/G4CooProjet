package fr.univamu.iut;

import java.util.List;

public class Arboriculteur extends Fermier {

    private List<Object> mesProductions;

    public Arboriculteur(String prenom, String nom, int id, CompteBancaire monCompte) {
        super(prenom, nom, id, monCompte);
    }

    public void cultiverFruit(Fruit fruit) {
         mesProductions.add(fruit);
    }

    public void cultiverLegule(Légume legume) {
        mesProductions.add(legume);
    }


}