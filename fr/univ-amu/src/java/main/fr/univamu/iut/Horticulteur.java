package fr.univamu.iut;

import fr.univamu.iut.Produit.Fruit;
import fr.univamu.iut.Produit.Legume;
import fr.univamu.iut.Produit.Vegetal;

import java.util.ArrayList;
import java.util.List;

public class Horticulteur extends Fermier {

    private List<Vegetal> mesProductions;

    public Horticulteur(String nom, boolean abonne, int idClient, int idVendeur, CompteBancaire monComte) {
        super(nom, abonne, idClient, idVendeur, monComte);
        mesProductions = new ArrayList<>();
    }

    public void cultiverFruit(Fruit fruit) {

        mesProductions.add(fruit);
    }

    public void cultiverLegume(Legume legume) {
        mesProductions.add(legume);
    }

    public List<Vegetal> getMesProductions() {
        return mesProductions;
    }
}