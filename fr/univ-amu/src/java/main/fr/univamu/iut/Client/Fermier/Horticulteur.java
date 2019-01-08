package fr.univamu.iut.Client.Fermier;

import fr.univamu.iut.CompteBancaire;
import fr.univamu.iut.Produit.Arbre.Arbre;
import fr.univamu.iut.Produit.Produits;
import fr.univamu.iut.Produit.Vegetal;

import java.util.ArrayList;
import java.util.List;

public class Horticulteur extends Fermier {

    private List<Vegetal> mesProductions = new ArrayList<>();
    private List<Vegetal> mesProduitsCommercialisables = new ArrayList<>() ;


    public Horticulteur(String nom, boolean abonne, CompteBancaire monComte) {
        super(nom, abonne, monComte);
    }

    public void cultiverVegetal(List<Vegetal> vegetal) {

        mesProductions.addAll(vegetal);
    }


    public List<Vegetal> getMesProductions() {
        return mesProductions;
    }

    @Override
    public void afficherMesProductions() {
        System.out.println("Voici les produits de " + this.getNom() + ": ");
        for (Produits produit : mesProductions){
            System.out.println(produit.getNom() + " --> " + produit.getQuantite() + " kg disponibles "  + " | "  + produit.getPrix() + "$");
        }
    }

    @Override
    public void afficherCommercialisable() {
        System.out.println("Voici les produits commercialisables de " + this.getNom() + ": ");
        for (Produits produit : mesProduitsCommercialisables){
            System.out.println(produit.getNom() + " --> " + produit.getQuantite() + " kg disponibles "  + " | "  + produit.getPrix() + "$");
        }
    }

}