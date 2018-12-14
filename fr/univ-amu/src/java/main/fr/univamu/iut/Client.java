package fr.univamu.iut;

import java.util.List;

public abstract class Client {

    private String nom;
    private boolean abonne = false;
    private int id = 0;
    private CompteBancaire monComte = null;
    protected List<ProduitCommercialisable> mesProduitsAchetés = null;

    public Client(String nom, boolean abonne, int id, CompteBancaire monComte, List<ProduitCommercialisable> mesProduitsAchetés) {
        this.nom = nom;
        this.abonne = abonne;
        this.id = id;
        this.monComte = monComte;
        this.mesProduitsAchetés = mesProduitsAchetés;
    }

    public boolean isAbonne() {
        return abonne;
    }

    public void setAbonne(boolean abonne) {
        this.abonne = abonne;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public CompteBancaire getMonComte() {
        return monComte;
    }

    public void setMonComte(CompteBancaire monComte) {
        this.monComte = monComte;
    }

    public List<ProduitCommercialisable> getMesProduitsAchetés() {
        return mesProduitsAchetés;
    }

    public void setMesProduitsAchetés(List<ProduitCommercialisable> mesProduitsAchetés) {
        this.mesProduitsAchetés = mesProduitsAchetés;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void acheterProduit(ProduitCommercialisable produit){
        mesProduitsAchetés.add(produit) ;
    }

    public void notifierClient(Client client){
        System.out.println("De nouveaux produit ont été mis en vente pour vous oui " + client.getNom());
    }

}