package fr.univamu.iut;

import fr.univamu.iut.Client.Client;
import fr.univamu.iut.Produit.Produits;

import java.util.List;

public class Trader extends Client {

    private Boolean travaillerSurMarche;
    private List<Produits> mesProdtuisEnVente = null;

    public Trader(String nom, boolean abonne, int idClient, CompteBancaire monComte, Boolean travaillerSurMarche, List<Produits> mesProdtuisEnVente) {
        super(nom, abonne, idClient, monComte);
        this.travaillerSurMarche = travaillerSurMarche;
        this.mesProdtuisEnVente = mesProdtuisEnVente;
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