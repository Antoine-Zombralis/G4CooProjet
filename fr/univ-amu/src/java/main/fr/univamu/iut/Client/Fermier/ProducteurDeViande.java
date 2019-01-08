package fr.univamu.iut.Client.Fermier;

import fr.univamu.iut.CompteBancaire;
import fr.univamu.iut.Produit.Produits;
import fr.univamu.iut.Produit.Vegetal;
import fr.univamu.iut.Produit.Viande.Cochon;
import fr.univamu.iut.Produit.Viande.Vache;
import fr.univamu.iut.Produit.Viande.Viande;
import fr.univamu.iut.Produit.Viande.Volaille;

import java.util.ArrayList;
import java.util.List;

public class ProducteurDeViande extends Fermier {

    private List<Viande> mesProductions = new ArrayList<>();
    private List<Viande> mesProduitsCommercialisables = new ArrayList<>() ;


    public ProducteurDeViande(String nom, boolean abonne, CompteBancaire monComte) {
        super(nom, abonne, monComte);
    }

    public void produireViande(List<Viande> viandes){
        mesProductions.addAll(viandes);
    }

    public List<Viande> getMesProductions() {
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
