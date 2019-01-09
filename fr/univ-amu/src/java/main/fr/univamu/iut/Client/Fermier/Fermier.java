package fr.univamu.iut.Client.Fermier;

import fr.univamu.iut.Client.Client;
import fr.univamu.iut.CompteBancaire;
import fr.univamu.iut.OffreAchat;
import fr.univamu.iut.Produit.Produits;

import java.util.ArrayList;
import java.util.List;

public abstract class Fermier extends Client {

    public Fermier(String nom, boolean abonne, CompteBancaire monComte) {
        super(nom, abonne, monComte);
    }

    public int cotiserSomme(int gain, int Taxe) {
        return gain * Taxe;
    }

    public void proposerProduit(Produits produit) {
        System.out.println("Je propose le produit " + produit + " à la vente");
    }



    public abstract void ajouterCommercialisable(Produits produit);

    public abstract void afficherCommercialisable();

    public void alerter(){
        System.out.println("Vous avez recu une sanction");
    }

    public abstract void afficherMesProductions() ;

    public abstract void supprimerProduit(Produits produits);

}