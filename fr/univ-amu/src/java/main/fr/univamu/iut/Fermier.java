package fr.univamu.iut;

import java.util.List;

public class Fermier extends Client {

    private String prenom;

    private String nom;

    private int id;

    private CompteBancaire monCompte;

    private List<ProduitCommercialisable> mesProduitsCommercialisable;

    Fermier(String prenom, String nom, int id, CompteBancaire monCompte) {
        this.prenom = prenom;
        this.nom = nom;
        this.id = id;
        this.monCompte = monCompte;
    }

    public void acheterRessources(int prix) {
        this.monCompte.debiter(this.id, prix);
    }
    public int cotiserSomme(int gain, int Taxe) {
        return gain * Taxe;
    }

    public void proposerProduit(PropositionProduitFermier produit) {
        System.out.println("Je propose le produit " + produit + " à la vente");
    }

    @Override
    public void acheterProduit(ProduitCommercialisable produitvoulu)  {
        this.monCompte.debiter(this.id, produitvoulu.getPrix());
        mesProduitsCommercialisable.add(produitvoulu);
    }

    @Override
    public void notifierClient(Client client) {
        System.out.println("De nouveau produit ont été mis en vente pour vous" + Client.getNom());
    }

    public int getId() {
        return id;
    }
}