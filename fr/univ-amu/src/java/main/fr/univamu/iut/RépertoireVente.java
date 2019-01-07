package fr.univamu.iut;

import fr.univamu.iut.Produit.Fruit;
import fr.univamu.iut.Produit.Legume;
import fr.univamu.iut.Produit.Viande;

import java.util.ArrayList;

public class RépertoireVente {
    private ArrayList<Fruit> fruitsEnVente ;
    private ArrayList<Legume> legumesEnVente ;
    private ArrayList<Viande> viandesEnVente ;

    public RépertoireVente() {

    }

    public ArrayList<Fruit> getFruitsEnVente() {
        return fruitsEnVente;
    }

    public void setFruitsEnVente(ArrayList<Fruit> fruitsEnVente) {
        this.fruitsEnVente = fruitsEnVente;
    }

    public ArrayList<Legume> getLegumesEnVente() {
        return legumesEnVente;
    }

    public void setLegumesEnVente(ArrayList<Legume> legumesEnVente) {
        this.legumesEnVente = legumesEnVente;
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

    public void supprimerFruit(Fruit fruit) {
        for (Fruit fruitCourant : fruitsEnVente)
            if (fruit.equals(fruitCourant))
                fruitsEnVente.remove(fruitCourant) ;
    }

    public void su(Fruit fruit) {
        for (Fruit fruitCourant : fruitsEnVente)
            if (fruit.equals(fruitCourant))
                fruitsEnVente.remove(fruitCourant) ;
    }

    public void supprimerFruit(Fruit fruit) {
        for (Fruit fruitCourant : fruitsEnVente)
            if (fruit.equals(fruitCourant))
                fruitsEnVente.remove(fruitCourant) ;
    }

    public void afficherEtalageViande() {
        for (Viande viande : viandesEnVente)
            System.out.println("Il reste " + viande.getQuantite() + " kg de cette " + viande.getNom() + " à " + viande.getPrix() + " le kg.");
    }


    public void afficherEtalageLegume() {
        for (Legume legume : legumesEnVente)
            System.out.println("Il reste " + legume.getQuantite() + " kg de cette cagette de " + legume.getNom() + " à " + legume.getPrix() + " le kg.");
    }


    public void afficherEtalageFruit() {
        for (Fruit fruit : fruitsEnVente)
            System.out.println("Il reste " + fruit.getQuantite() + " kg de cette cagette de " + fruit.getNom() + " à " + fruit.getPrix() + " le kg.");
    }


}
