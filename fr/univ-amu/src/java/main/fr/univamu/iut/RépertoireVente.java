package fr.univamu.iut;

import fr.univamu.iut.Produit.Arbre.Arbre;
import fr.univamu.iut.Produit.FruitEtLegume.Fruit;
import fr.univamu.iut.Produit.FruitEtLegume.Legume;
import fr.univamu.iut.Produit.Produits;
import fr.univamu.iut.Produit.Vegetal;
import fr.univamu.iut.Produit.Viande.Viande;

import java.util.ArrayList;

public class RépertoireVente {
    private ArrayList<Vegetal> fruitsEnVente = new ArrayList<>();
    private ArrayList<Vegetal> legumesEnVente = new ArrayList<>();
    private ArrayList<Viande> viandesEnVente = new ArrayList<>();
    private ArrayList<Arbre> arbresEnVentee = new ArrayList<>();
    private ArrayList<Viande> viandesEnVente = new ArrayList<>();

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

    public void ajouterProduit(Produits produit, RépertoireVente répertoireVente) {
        if (produit instanceof Legume)
            legumesEnVente.add((Legume) produit);
        else if (produit instanceof Fruit)
            fruitsEnVente.add((Fruit) produit);
        else if (produit instanceof Viande)
            viandesEnVente.add((Viande)produit);
    }

    public void supprimerFruit(Fruit fruit) {
                fruitsEnVente.remove(fruit) ;
    }

    public void supprimerViande(Viande viande) {
                viandesEnVente.remove(viande) ;
    }

    public void supprimerLegume(Legume legume) {
                legumesEnVente.remove(legume) ;
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
