package fr.univamu.iut.Client.Fermier;

import fr.univamu.iut.Client.Client;
import fr.univamu.iut.CompteBancaire;
import fr.univamu.iut.Produit.Produits;

import java.util.ArrayList;
import java.util.List;

public abstract class Fermier extends Client {


    private List<Produits> mesProduitsCommercialisable = new ArrayList<>();

    public Fermier(String nom, boolean abonne, CompteBancaire monComte) {
        super(nom, abonne, monComte);
    }

    public void acheterRessources(int prix) {
        this.getMonComte().debiter(getIdClient(), prix);
    }
    public int cotiserSomme(int gain, int Taxe) {
        return gain * Taxe;
    }

    public void proposerProduit(Produits produit) {
        System.out.println("Je propose le produit " + produit + " à la vente");
    }

    public void ajouterCommercialisable(Produits produit){
        mesProduitsCommercialisable.add(produit);
    }

    public abstract void afficherCommercialisable();

    public void alerter(){
        System.out.println("Vous avez recu une sanction");
    }

    public int getId() {
        return getIdClient();
    }


    public List<Produits> getMesProduitsCommercialisable() {
        return mesProduitsCommercialisable;
    }

    public abstract void afficherMesProductions() ;
}