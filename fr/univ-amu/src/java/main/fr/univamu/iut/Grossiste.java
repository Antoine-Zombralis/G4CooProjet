package fr.univamu.iut;



import java.util.*;


public class Grossiste extends Client {

    public Grossiste(String nom, boolean abonne, int id, CompteBancaire monComte, List<ProduitCommercialisable> mesProduitsAchetés, Set<CentraleAchat> monGérantAchat) {
        super(nom, abonne, id, monComte, mesProduitsAchetés);
        this.monGérantAchat = monGérantAchat;
    }

    private Set<CentraleAchat> monGérantAchat;


    public void acheterProduit(ProduitCommercialisable produit) {
        mesProduitsAchetés.add(produit) ;
    }

}