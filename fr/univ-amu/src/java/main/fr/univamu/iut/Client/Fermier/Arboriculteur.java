package fr.univamu.iut.Client.Fermier;

import fr.univamu.iut.Produit.Arbre;
import fr.univamu.iut.CompteBancaire;

import java.util.ArrayList;
import java.util.List;

public class Arboriculteur extends Fermier {

    private List<Arbre> mesProductions;

    public Arboriculteur(String nom, boolean abonne, int idClient, int idVendeur, CompteBancaire monComte) {
        super(nom, abonne, idClient, idVendeur, monComte);
        mesProductions = new ArrayList<>();
    }

    public void produireArbre(Arbre arbre){
        mesProductions.add(arbre);
    }

    public List<Arbre> getMesProductions() {
        return mesProductions;
    }
}