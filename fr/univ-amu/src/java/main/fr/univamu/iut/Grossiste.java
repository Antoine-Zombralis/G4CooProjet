package fr.univamu.iut;



import java.util.*;


public class Grossiste extends Client {

    public Grossiste(String nom, boolean abonne, int idClient, CompteBancaire monComte, Set<CentraleAchat> monGérantAchat) {
        super(nom, abonne, idClient, monComte);
        this.monGérantAchat = monGérantAchat;
    }

    private Set<CentraleAchat> monGérantAchat;


    public void acheterProduit(ProduitCommercialisable produit) {
        mesProduitsAchetés.add(produit) ;
    }

}