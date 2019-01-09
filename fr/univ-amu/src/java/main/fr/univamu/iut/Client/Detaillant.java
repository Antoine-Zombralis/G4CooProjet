package fr.univamu.iut.Client;


import fr.univamu.iut.Client.Client;
import fr.univamu.iut.CompteBancaire;
import fr.univamu.iut.Produit.Produits;

public class Detaillant extends Client {

    public Detaillant(String nom, boolean abonne, CompteBancaire monComte) {
        super(nom, abonne, monComte);
    }

    @Override
    public void supprimerProduit(Produits produit) {
        for (Produits produitCourant : getMesProduitsAchetes())
            if (produit.equals(produitCourant))
                getMesProduitsAchetes().remove(produitCourant) ;
    }

    public void acheterProduit(Produits produit){
        getMesProduitsAchetes().add(produit) ;
    }


}