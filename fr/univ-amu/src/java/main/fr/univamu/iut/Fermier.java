package fr.univamu.iut;

public class Fermier implements Client {

    private String prenom;

    private String nom;

    private int id;

    private CompteBancaire monCompte;

    public Fermier(String prenom, String nom,int id, CompteBancaire monCompte) {
        this.prenom = prenom;
        this.nom = nom;
        this.id = id;
        this.monCompte = monCompte;
    }

    public void acheterRessources() {
        // TODO implement here
    }
    public int cotiserSomme(int gain) {
        return 0;
    }

    public void proposerProduit(PropositionProduitFermier produit) {
        // TODO implement here
    }
    @Override
    public void acheterProduit(ProduitCommercialisable produitvoulu)  {

    }

    @Override
    public void notifierClient(int id) {

    }

}