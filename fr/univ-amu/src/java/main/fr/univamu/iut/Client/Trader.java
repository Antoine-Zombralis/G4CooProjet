package fr.univamu.iut.Client;

import fr.univamu.iut.Client.Client;
import fr.univamu.iut.CompteBancaire;
import fr.univamu.iut.Produit.Produits;

import java.util.ArrayList;
import java.util.List;

public class Trader extends Client {

    private List<Produits> mesProdtuisEnVente = new ArrayList<>();

    public Trader(String nom, boolean abonne, CompteBancaire monComte) {
        super(nom, abonne, monComte);
    }

//    @Override
//    public void acheterProduit(Produits produit){
//        getMesProduitsAchetes().add(produit) ;
//    }



//    public void mettreEnVente(Produits produit) {
//        if (produit instanceof Viande)
//
//
//    }

}