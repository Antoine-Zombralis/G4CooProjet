package fr.univamu.iut;


import java.util.List;

public class Détaillant extends Client {

    public Détaillant(String nom, boolean abonne, int id, CompteBancaire monComte, List<ProduitCommercialisable> mesProduitsAchetés) {
        super(nom, abonne, id, monComte, mesProduitsAchetés);
    }

    public void acheterProduit(ProduitCommercialisable produit){
        mesProduitsAchetés.add(produit) ;
    }

    public void notifierClient(Client client){
        System.out.println("De nouveaux produit ont été mis en vente pour vous " + client.getNom());
    }
}