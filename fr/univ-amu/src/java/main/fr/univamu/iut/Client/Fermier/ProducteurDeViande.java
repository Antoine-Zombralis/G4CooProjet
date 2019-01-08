package fr.univamu.iut.Client.Fermier;

import fr.univamu.iut.CompteBancaire;
import fr.univamu.iut.Produit.Viande.Cochon;
import fr.univamu.iut.Produit.Viande.Vache;
import fr.univamu.iut.Produit.Viande.Viande;
import fr.univamu.iut.Produit.Viande.Volaille;

import java.util.ArrayList;
import java.util.List;

public class ProducteurDeViande extends Fermier {

    private List<Viande> mesProductions = new ArrayList<>();

    public ProducteurDeViande(String nom, boolean abonne, CompteBancaire monComte) {
        super(nom, abonne, monComte);
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
