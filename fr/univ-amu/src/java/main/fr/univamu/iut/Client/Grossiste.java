package fr.univamu.iut.Client;



import fr.univamu.iut.Client.Client;
import fr.univamu.iut.CompteBancaire;
import fr.univamu.iut.Produit.Produits;


public class Grossiste extends Client {

    public Grossiste(String nom, boolean abonne, CompteBancaire monComte) {
        super(nom, abonne, monComte);
        //this.monGérantAchat = monGérantAchat;
    }

    @Override
    public void supprimerProduit(Produits produit) {
        for (Produits produitCourant : getMesProduitsAchetes())
            if (produit.equals(produitCourant))
                getMesProduitsAchetes().remove(produitCourant) ;
    }

    //private Set<CentraleAchat> monGérantAchat;

}