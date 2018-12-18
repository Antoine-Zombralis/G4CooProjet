package fr.univamu.iut;


import java.util.List;

public class Détaillant extends Client {

    public Détaillant(String nom, boolean abonne, int idClient, CompteBancaire monComte) {
        super(nom, abonne, idClient, monComte);
    }

    public void acheterProduit(ProduitCommercialisable produit){
        mesProduitsAchetés.add(produit) ;
    }

    public void notifierClient(Client client){
        System.out.println("De nouveaux produit ont été mis en vente pour vous " + client.getNom());
    }
}