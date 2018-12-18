package fr.univamu.iut;

import java.util.ArrayList;
import java.util.List;

public class Arboriculteur extends Fermier {

    private List<Arbre> mesProductions;
    private List<ProduitCommercialisable> mesProduitsCommercialisable;


    public Arboriculteur(String nom, boolean abonne, int idClient, int idVendeur, CompteBancaire monComte) {
        super(nom, abonne, idClient, idVendeur, monComte);
        mesProductions = new ArrayList<>();
        mesProduitsCommercialisable = new ArrayList<>();
    }

    public void produireArbre(Arbre arbre){
        mesProductions.add(arbre);
    }

    public void ajouterProduitCommercialisable(ProduitCommercialisable produit){
        mesProduitsCommercialisable.add(produit);
    }

    public List<Arbre> getMesProductions() {
        return mesProductions;
    }
}