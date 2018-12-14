package fr.univamu.iut;

import java.util.List;

public abstract class Client {

    private String nom;
    private boolean abonne = false;
    private int idClient = 0;
    private CompteBancaire monComte = null;

    protected List<ProduitCommercialisable> mesProduitsAchetés = null;

    public Client(String nom, boolean abonne, int idClient, CompteBancaire monComte) {
        this.nom = nom;
        this.abonne = abonne;
        this.idClient = idClient;
        this.monComte = monComte;
    }

    public boolean isAbonne() {
        return abonne;
    }

    public void setAbonne(boolean abonne) {
        this.abonne = abonne;
    }

    public int getIdClient() {
        return idClient;
    }

    public void setId(int idClient) {
        this.idClient = idClient;
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
        System.out.println("De nouveaux produit ont été mis en vente pour vous " + client.getNom());
    }

}