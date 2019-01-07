package fr.univamu.iut.Fermier;

import fr.univamu.iut.CompteBancaire;
import fr.univamu.iut.Produit.Cochon;
import fr.univamu.iut.Produit.Vache;
import fr.univamu.iut.Produit.Viande;
import fr.univamu.iut.Produit.Volaille;

import java.util.ArrayList;
import java.util.List;

public class ProducteurDeViande extends Fermier {

    private List<Viande> mesProductions;

    public ProducteurDeViande(String nom, boolean abonne, int idClient, int idVendeur, CompteBancaire monComte) {
        super(nom, abonne, idClient, idVendeur, monComte);
        mesProductions = new ArrayList<>();
    }

    public void produireVache(Vache vache){
        mesProductions.add(vache);
    }

    public void produireCochon(Cochon cochon){
        mesProductions.add(cochon);
    }
    public void produireVolaille(Volaille volaille){
        mesProductions.add(volaille);
    }

    public List<Viande> getMesProductions() {
        return mesProductions;
    }
}