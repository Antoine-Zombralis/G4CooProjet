package fr.univamu.iut;

import fr.univamu.iut.Produit.Fruit;
import fr.univamu.iut.Produit.Legume;
import fr.univamu.iut.Produit.Vegetal;
import fr.univamu.iut.Produit.Viande;

import java.util.ArrayList;

public class RépertoireVente {
    private ArrayList<Vegetal> fruitsEnVente ;
    private ArrayList<Vegetal> legumesEnVente ;
    private ArrayList<Viande> viandesEnVente ;

    public RépertoireVente() {

    }

    public ArrayList<Vegetal> getFruitsEnVente() {
        return fruitsEnVente;
    }

    public void setFruitsEnVente(ArrayList<Vegetal> fruitsEnVente) {
        this.fruitsEnVente = fruitsEnVente;
    }

    public ArrayList<Vegetal> getLegumesEnVente() {
        return legumesEnVente;
    }

    public void setLegumesEnVente(ArrayList<Vegetal> legumesEnVente) {
        this.legumesEnVente = legumesEnVente;
    }

    public ArrayList<Viande> getViandesEnVente() {
        return viandesEnVente;
    }

    public void setViandesEnVente(ArrayList<Viande> viandesEnVente) {
        this.viandesEnVente = viandesEnVente;
    }

    public void ajouterFruit(Vegetal fruit) {
        fruitsEnVente.add(fruit) ;
    }
    public void ajouterLegume(Vegetal legume) {
        legumesEnVente.add(legume) ;
    }
    public void ajouterViande(Viande viande) {
        viandesEnVente.add(viande) ;
    }

    public void supprimerFruit(Fruit fruit) {
        for (Vegetal fruitCourant : fruitsEnVente)
            if (fruit.equals(fruitCourant))
                fruitsEnVente.remove(fruitCourant) ;
    }

    public void supprimerViande(Viande viande) {
        for (Viande viandeCourante : viandesEnVente)
            if (viande.equals(viandeCourante))
                fruitsEnVente.remove(viandeCourante) ;
    }

    public void supprimerLegume(Legume legume) {
        for (Vegetal legumeCourant : legumesEnVente)
            if (legume.equals(legumeCourant))
                fruitsEnVente.remove(legumeCourant) ;
    }

    public void afficherEtalageViande() {
        for (Viande viande : viandesEnVente)
            System.out.println("Il reste " + viande.getQuantite() + " kg de cette " + viande.getNom() + " à " + viande.getPrix() + " le kg.");
    }


    public void afficherEtalageLegume() {
        for (Vegetal legume : legumesEnVente)
            System.out.println("Il reste " + legume.getQuantite() + " kg de cette cagette de " + legume.getNom() + " à " + legume.getPrix() + " le kg.");
    }


    public void afficherEtalageFruit() {
        for (Vegetal fruit : fruitsEnVente)
            System.out.println("Il reste " + fruit.getQuantite() + " kg de cette cagette de " + fruit.getNom() + " à " + fruit.getPrix() + " le kg.");
    }


}
