package fr.univamu.iut.Client.Fermier;

import fr.univamu.iut.Client.Client;
import fr.univamu.iut.CompteBancaire;
import fr.univamu.iut.OffreAchat;
import fr.univamu.iut.Produit.Produits;

import java.util.ArrayList;
import java.util.List;

/**
 * classe abstraite fermier qui permet d'ajouter des méthodes qui seront redefinis dans ses classes filles
 */
public abstract class Fermier extends Client {

    public Fermier(String nom, boolean abonne, CompteBancaire monComte) {
        super(nom, abonne, monComte);
    }

    public abstract void ajouterCommercialisable(Produits produit);

    public abstract void afficherCommercialisable();

    public void alerter(){
        System.out.println("Vous avez recu une sanction");
    }

    public abstract void afficherMesProductions() ;


    public abstract void supprimerProduit(Produits produits);


}