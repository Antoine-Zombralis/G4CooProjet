package fr.univamu.iut;

import java.util.List;

public class Fermier extends Client {

    private int idVendeur;

    private List<ProduitCommercialisable> mesProduitsCommercialisable;

    List<Object> mesProductions;


    public Fermier(String nom, boolean abonne, int idClient, int idVendeur, CompteBancaire monComte) {
        super(nom, abonne, idClient, monComte);
        this.idVendeur = idVendeur;
    }

    public void acheterRessources(int prix) {
        this.getMonComte().debiter(this.getId(), prix);
    }
    public int cotiserSomme(int gain, int Taxe) {
        return gain * Taxe;
    }

    public void proposerProduit(PropositionProduitFermier produit) {
        System.out.println("Je propose le produit " + produit + " à la vente");
    }

    @Override
    public void acheterProduit(ProduitCommercialisable produitvoulu)  {
        this.getMonComte().debiter(this.getIdClient(), produitvoulu.getPrix());
        mesProduitsCommercialisable.add(produitvoulu);
    }

    @Override
    public void notifierClient(Client client) {
        System.out.println("De nouveau produit ont été mis en vente pour vous" + Client.getNom());
    }

    public int getId() {
        return getIdClient();
    }
}