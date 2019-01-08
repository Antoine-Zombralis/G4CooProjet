package fr.univamu.iut.Client.Fermier;

import fr.univamu.iut.Produit.Arbre.Arbre;
import fr.univamu.iut.CompteBancaire;

import java.util.ArrayList;
import java.util.List;

public class Arboriculteur extends Fermier {

    private List<Arbre> mesProductions;

    public Arboriculteur(String nom, boolean abonne, CompteBancaire monComte) {
        super(nom, abonne, monComte);
        mesProductions = new ArrayList<>();
    }

    public void produireArbre(Arbre arbre){
        mesProductions.add(arbre);
    }

    public List<Arbre> getMesProductions() {
        return mesProductions;
    }
}