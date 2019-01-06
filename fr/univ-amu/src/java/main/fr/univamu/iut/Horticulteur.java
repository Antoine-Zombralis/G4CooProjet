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

    public void cultiverFruit(Produits fruit) {

        mesProductions.add(fruit);
    }

    public void cultiverLegume(Legume legume) {
        mesProductions.add(legume);
    }

    public List<Produits> getMesProductions() {
        return mesProductions;
    }

    public void afficherMesProductions(){
        for (Produits vegetal : mesProductions){
            System.out.println("Produit : " + vegetal.getNom() + " Prix : " + vegetal.getPrix() + " ID : " + vegetal.getId());
        }
    }
}