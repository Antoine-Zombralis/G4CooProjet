package fr.univamu.iut;

import fr.univamu.iut.Produit.Fruit;
import fr.univamu.iut.Produit.Legume;
import fr.univamu.iut.Produit.Viande;

import java.util.ArrayList;

public class RépertoireVente {
    private ArrayList<Fruit> fruitsEnVente ;
    private ArrayList<Legume> legumesEnVente ;
    private ArrayList<Viande> viandesEnVente ;

    public RépertoireVente(ArrayList<Fruit> fruitsEnVente, ArrayList<Legume> legumesEnVente, ArrayList<Viande> viandesEnVente) {
        this.fruitsEnVente = fruitsEnVente;
        this.legumesEnVente = legumesEnVente;
        this.viandesEnVente = viandesEnVente;
    }

    public ArrayList<Fruit> getFruitsEnVente() {
        return fruitsEnVente;
    }

    public void setFruitsEnVente(ArrayList<Fruit> fruitsEnVente) {
        this.fruitsEnVente = fruitsEnVente;
    }

    public ArrayList<Legume> getLégumesEnVente() {
        return légumesEnVente;
    }

    public void setLégumesEnVente(ArrayList<Legume> légumesEnVente) {
        this.légumesEnVente = légumesEnVente;
    }

    public ArrayList<Viande> getViandesEnVente() {
        return viandesEnVente;
    }

    public void setViandesEnVente(ArrayList<Viande> viandesEnVente) {
        this.viandesEnVente = viandesEnVente;
    }

    public void ajouterFruit(Fruit fruit) {
        fruitsEnVente.add(fruit) ;
    }
    public void ajouterLegume(Legume legume) {
        legumesEnVente.add(legume) ;
    }
    public void ajouterViande(Viande viande) {
        viandesEnVente.add(viande) ;
    }
}
