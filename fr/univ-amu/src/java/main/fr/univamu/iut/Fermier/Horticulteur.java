package fr.univamu.iut.Fermier;

import fr.univamu.iut.CompteBancaire;
import fr.univamu.iut.Produit.Produits;
import fr.univamu.iut.Produit.Vegetal;

import java.util.ArrayList;
import java.util.List;

public class Horticulteur extends Fermier {

    private List<Vegetal> mesProductions = new ArrayList<>();


    public Horticulteur(String nom, boolean abonne, int idClient, int idVendeur, CompteBancaire monComte) {
        super(nom, abonne, idClient, idVendeur, monComte);
    }

    public void cultiverVegetal(Vegetal vegetal) {

        mesProductions.add(vegetal);
    }


    public List<Vegetal> getMesProductions() {
        return mesProductions;
    }

    public void afficherMesProductions(){
        for (Produits vegetal : mesProductions){
            System.out.println("mesProductions : " + vegetal.getNom() + " Prix : " + vegetal.getPrix() + " ID : " + vegetal.getId());
        }
    }
}