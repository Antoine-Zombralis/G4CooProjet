package fr.univamu.iut;

import java.util.ArrayList;
import java.util.List;

public class Arboriculteur extends Fermier {

    private List<Arbre> mesArbres;

    public Arboriculteur(String nom, boolean abonne, int idClient, int idVendeur, CompteBancaire monComte) {
        super(nom, abonne, idClient, idVendeur, monComte);
        this.mesArbres = new ArrayList<>();
    }

    public void produireArbre(Arbre arbre){
        mesArbres.add(arbre);
    }

    public List<Arbre> getMesArbres() {
        return this.mesArbres;
    }
}