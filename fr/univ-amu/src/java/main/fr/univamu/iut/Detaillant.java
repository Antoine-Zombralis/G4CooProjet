package fr.univamu.iut;


import fr.univamu.iut.Produit.ProduitCommercialisable;

public class Detaillant extends Client {

    public Detaillant(String nom, boolean abonne, int idClient, CompteBancaire monComte) {
        super(nom, abonne, idClient, monComte);
    }

    public void acheterProduit(ProduitCommercialisable produit){
        getMesProduitsAchetes().add(produit) ;
    }

    public void notifierClient(Client client){
        System.out.println("De nouveaux produit ont été mis en vente pour vous " + client.getNom());
    }
}