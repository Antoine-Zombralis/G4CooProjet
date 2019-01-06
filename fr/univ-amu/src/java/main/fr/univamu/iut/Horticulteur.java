package fr.univamu.iut;

import fr.univamu.iut.Produit.Fruit;
import fr.univamu.iut.Produit.Legume;
import fr.univamu.iut.Produit.Produits;
import fr.univamu.iut.Produit.Vegetal;

import java.util.ArrayList;
import java.util.List;

public class Horticulteur extends Fermier {

    private List<Produits> mesProductions;

    public Horticulteur(String nom, boolean abonne, int idClient, int idVendeur, CompteBancaire monComte) {
        super(nom, abonne, idClient, idVendeur, monComte);
        mesProductions = new ArrayList<>();
    }

    public void cultiverVegetal(Produits vegetal) {

        mesProductions.add(vegetal);
    }

    public void cultiverLegume(Produits legume) {
        mesProductions.add(legume);
    }

    public List<Produits> getMesProductions() {
        return mesProductions;
    }

    public void afficherMesProductions(){
        for (Produits vegetal : mesProductions){
            System.out.println("mesProductions : " + vegetal.getNom() + " Prix : " + vegetal.getPrix() + " ID : " + vegetal.getId());
        }
    }
}