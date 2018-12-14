package fr.univamu.iut;

import java.util.List;

public class Arboriculteur extends Fermier {

    public Arboriculteur(String prenom, String nom, int id, CompteBancaire monCompte) {
        super(prenom, nom, id, monCompte);
    }

    public void produireArbre(Arbre arbre){
        mesProductions.add(arbre);
    }

}