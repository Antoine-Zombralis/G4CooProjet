package fr.univamu.iut;

import fr.univamu.iut.Produit.Produits;

import java.util.ArrayList;
import java.util.List;

public class Fermier extends Client {

    private int idVendeur;

    private List<Produits> mesProduitsCommercialisable = new ArrayList<>();

    public Fermier(String nom, boolean abonne, int idClient, int idVendeur, CompteBancaire monComte) {
        super(nom, abonne, idClient, monComte);
        this.idVendeur = idVendeur;
    }

    public void acheterRessources(int prix) {
        this.getMonComte().debiter(getIdClient(), prix);
    }
    public int cotiserSomme(int gain, int Taxe) {
        return gain * Taxe;
    }

    public void proposerProduit(Produits produit) {
        System.out.println("Je propose le produit " + produit + " à la vente");
    }

    public void ajouterCommercialisable(Produits produit){
        mesProduitsCommercialisable.add(produit);
    }

    public void afficherCommercialisable(){
        for (Produits produit : mesProduitsCommercialisable){
            System.out.println("Voici les produits de " + this.getNom() + " : " + produit.getNom()  + " | "  + produit.getPrix() + "$");
        }
    }

    public void alerter(){
        System.out.println("Vous avez recu une sanction");
    }

    @Override
    public void acheterProduit(Produits produitvoulu)  {
//        this.getMonComte().debiter(this.getIdClient(), produitvoulu.getPrix());
        mesProduitsCommercialisable.add(produitvoulu);
    }

    @Override
    public void notifierClient(Client client) {
        System.out.println("De nouveau produit ont été mis en vente pour vous" + client.getNom());
    }

    public int getId() {
        return getIdClient();
    }

    public int getIdVendeur() {
        return idVendeur;
    }

    public List<Produits> getMesProduitsCommercialisable() {
        return mesProduitsCommercialisable;
    }

}