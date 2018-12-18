package fr.univamu.iut;

import java.util.List;

public class Arboriculteur extends Fermier {

    List<Arbre> mesArbres;

    public Arboriculteur(String nom, boolean abonne, int idClient, int idVendeur, CompteBancaire monComte) {
        super(nom, abonne, idClient, idVendeur, monComte);
    }

    public void produireArbre(Arbre arbre){
        mesArbres.add(arbre);
    }

    public List<Arbre> getMesArbres() {
        return mesArbres;
    }
}