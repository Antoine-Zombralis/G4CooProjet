package fr.univamu.iut.Client;

import fr.univamu.iut.CompteBancaire;
import fr.univamu.iut.Produit.Produits;
import fr.univamu.iut.Produit.Vegetal;

import java.util.List;

public class CentraleAchat extends Client {
    private List<Client> affiliés ;
    private Grossiste mesGrossistes ;

    public CentraleAchat(String nom, boolean abonne, CompteBancaire monComte) {
        super(nom, abonne, monComte);
    }

    @Override
    public void supprimerProduit(Produits produit) {
        for (Produits produitCourant : getMesProduitsAchetes())
            if (produit.equals(produitCourant))
                getMesProduitsAchetes().remove(produitCourant) ;
    }
}
