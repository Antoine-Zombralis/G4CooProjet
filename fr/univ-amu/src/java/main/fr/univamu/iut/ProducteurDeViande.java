package fr.univamu.iut;

import java.util.List;

public class ProducteurDeViande extends Fermier {

    public ProducteurDeViande(String prenom, String nom, int id, CompteBancaire monCompte) {
        super(prenom, nom, id, monCompte);
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
}