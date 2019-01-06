//package fr.univamu.iut.Produit;
//
//import fr.univamu.iut.Client;
//
//import java.util.Date;
//
//public class BuilderProduits {
//    private Client proprietaire;
//    private boolean bio, conforme;
//    private int quantite, prix, id;
//    private Date datePeremption;
//    private String nom;
//
//    public BuilderProduits(int quantite, int prix, String nom){
//        this.quantite = quantite;
//        this.prix = prix;
//        this.nom = nom;
//    }
//
//    public BuilderProduits addId(int id){
//        this.id = id; return this;
//    }
//
//    public BuilderProduits addProprio(Client proprietaire){
//        this.proprietaire = proprietaire; return this;
//    }
//
//    public BuilderProduits addBio(boolean bio){
//        this.bio = bio; return this;
//    }
//
//    public BuilderProduits addConforme(boolean conforme){
//        this.conforme = conforme; return this;
//    }
//
//    public BuilderProduits addDatePeremption(Date fin){
//        datePeremption = fin; return this;
//    }
//
//    public Client getProprietaire() {
//        return proprietaire;
//    }
//
//    public void setProprietaire(Client proprietaire) {
//        this.proprietaire = proprietaire;
//    }
//
//
//    public boolean isBio() {
//        return bio;
//    }
//
//    public void setBio(boolean bio) {
//        this.bio = bio;
//    }
//
//    public boolean isConforme() {
//        return conforme;
//    }
//
//    public void setConforme(boolean conforme) {
//        this.conforme = conforme;
//    }
//
//    public int getQuantite() {
//        return quantite;
//    }
//
//    public void setQuantite(int quantite) {
//        this.quantite = quantite;
//    }
//
//    public int getPrix() {
//        return prix;
//    }
//
//    public void setPrix(int prix) {
//        this.prix = prix;
//    }
//
//    public int getId() {
//        return id;
//    }
//
//    public void setId(int id) {
//        this.id = id;
//    }
//
//    public Date getDatePeremption() {
//        return datePeremption;
//    }
//
//    public void setDatePeremption(Date datePeremption) {
//        this.datePeremption = datePeremption;
//    }
//
//    public String getNom() {
//        return nom;
//    }
//
//    public void setNom(String nom) {
//        this.nom = nom;
//    }
//}
//
