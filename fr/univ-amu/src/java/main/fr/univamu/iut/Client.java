package fr.univamu.iut;

import java.util.ArrayList;
import java.util.List;

public abstract class Client {

    private String nom;
    private boolean abonne;
    private int idClient;
    private CompteBancaire monComte;

    private List<ProduitCommercialisable> mesProduitsAchetes = new ArrayList<>();

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

    public List<ProduitCommercialisable> getMesProduitsAchetes() {
        return mesProduitsAchetes;
    }

    public void setMesProduitsAchetes(List<ProduitCommercialisable> mesProduitsAchetes) {
        this.mesProduitsAchetes = mesProduitsAchetes;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void acheterProduit(ProduitCommercialisable produit){
        mesProduitsAchetes.add(produit);
        monComte.debiter(idClient, produit.getPrix());
    }

    public void notifierClient(Client client){
        System.out.println("De nouveaux produit ont été mis en vente pour vous " + client.getNom());
    }

}