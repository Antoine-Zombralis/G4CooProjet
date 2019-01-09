package fr.univamu.iut.Client.Fermier;

import fr.univamu.iut.Produit.Arbre.Arbre;
import fr.univamu.iut.CompteBancaire;
import fr.univamu.iut.Produit.Produits;
import fr.univamu.iut.Produit.Vegetal;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Arboriculteur extends Fermier {

    private List<Arbre> mesProductions = new ArrayList<>() ;
    private List<Arbre> mesProduitsCommercialisables = new ArrayList<>() ;

    public Arboriculteur(String nom, boolean abonne, CompteBancaire monComte) {
        super(nom, abonne, monComte);
    }

    @Override
    public void ajouterCommercialisable(Produits produit) {
        if(produit.isConforme()){
            mesProduitsCommercialisables.add((Arbre) produit);
        }
    }

    @Override
    public void afficherCommercialisable() {
        System.out.println("Voici les produits commercialisables de " + this.getNom() + ": ");
        for (Produits produit : mesProduitsCommercialisables){
            System.out.println(produit.getNom() + " --> " + produit.getQuantite() + " produits disponibles : \n \t Prix à l'unité : " + produit.getPrix() + "$ \n \t Prix total : " + produit.getPrix() * produit.getQuantite() + "$\n");
        }
    }

    @Override
    public void afficherMesProductions() {
        System.out.println("Voici les produits de " + this.getNom() + ": ");
        for (Produits produit : mesProductions){
            System.out.println(produit.getNom() + " --> " + produit.getQuantite() + " produits disponibles : \n \t Prix à l'unité : " + produit.getPrix() + "$ \n \t Prix total : " + produit.getPrix() * produit.getQuantite() + "$\n");
        }
    }

    @Override
    public void supprimerProduit(Produits arbre) {
        for (Vegetal arbreCourant : mesProduitsCommercialisables)
            if (arbre.equals(arbreCourant))
                mesProduitsCommercialisables.remove(arbreCourant) ;
    }

    public void produireArbre(List<Arbre> arbre){
        mesProductions.addAll(arbre);
    }

    public List<Arbre> getMesProductions() {
        return mesProductions;
    }


}