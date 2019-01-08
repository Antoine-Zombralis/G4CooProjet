package fr.univamu.iut.Client.Fermier;

import fr.univamu.iut.Produit.Arbre.Arbre;
import fr.univamu.iut.CompteBancaire;
import fr.univamu.iut.Produit.Produits;

import java.util.ArrayList;
import java.util.List;

public class Arboriculteur extends Fermier {

    private List<Arbre> mesProductions = new ArrayList<>() ;
    private List<Arbre> mesProduitsCommercialisables = new ArrayList<>() ;

    public Arboriculteur(String nom, boolean abonne, CompteBancaire monComte) {
        super(nom, abonne, monComte);
    }

    @Override
    public void afficherCommercialisable() {
        System.out.println("Voici les produits commercialisables de " + this.getNom() + ": ");
        for (Produits produit : mesProduitsCommercialisables){
            System.out.println(produit.getNom() + " --> " + produit.getQuantite() + " kg disponibles "  + " | "  + produit.getPrix() + "$");
        }
    }

    @Override
    public void afficherMesProductions() {
        System.out.println("Voici les produits de " + this.getNom() + ": ");
        for (Produits produit : mesProductions){
            System.out.println(produit.getNom() + " --> " + produit.getQuantite() + " kg disponibles "  + " | "  + produit.getPrix() + "$");
        }
    }

    public void produireArbre(List<Arbre> arbre){
        mesProductions.addAll(arbre);
    }

    public List<Arbre> getMesProductions() {
        return mesProductions;
    }


}