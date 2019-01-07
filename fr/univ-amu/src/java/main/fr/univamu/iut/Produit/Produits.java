package fr.univamu.iut.Produit;

import fr.univamu.iut.Client;

import java.util.Calendar;
import java.util.Date;

public class Produits{

    private Client proprietaire;
    private boolean bio, conforme;
    private int quantite, prix, id;
    private Date datePeremption;
    private String nom;
    private double prixVegetalUnite;
    private int quantiteVegetalDansCagette;

    public Produits (BuilderProduits builder) {
        proprietaire = builder.proprietaire;
        nom = builder.nom;
        bio = builder.bio;
        conforme = builder.conforme;
        quantite = builder.quantite;
        id = builder.id;
        prix = builder.prix;
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.DAY_OF_YEAR, 7) ;
        Date date = calendar.getTime();
        datePeremption = date ;
        prixVegetalUnite = builder.prixVegetalUnite;
        quantiteVegetalDansCagette = builder.quantiteVegetalDansCagette;
    }

    public static class BuilderProduits {
        private Client proprietaire;
        private boolean bio, conforme;
        private int quantite, prix, id;
        private Date datePeremption;
        private String nom;
        private double prixVegetalUnite;
        private int quantiteVegetalDansCagette;

        public BuilderProduits(int quantite, int prix, String nom){
            this.quantite = quantite;
            this.prix = prix;
            this.nom = nom;
        }

        public BuilderProduits addId(int id){
            this.id = id; return this;
        }

        public BuilderProduits addProprio(Client proprietaire){
            this.proprietaire = proprietaire; return this;
        }

        public BuilderProduits addBio(boolean bio){
            this.bio = bio; return this;
        }

        public BuilderProduits addConforme(boolean conforme){
            this.conforme = conforme; return this;
        }

        public BuilderProduits addDatePeremption(Date fin){
            datePeremption = fin; return this;
        }

        public BuilderProduits addPrixVegetalUnite(double prix){
            prixVegetalUnite = prix; return this;
        }

        public BuilderProduits addQuantiteVegetalDansCagette(int quantite){
            quantiteVegetalDansCagette = quantite; return this;
        }

        public Produits build(){
            return new Produits(this);
        }

        public CagettePoire poireBuild(){
            return new CagettePoire(this);
        }

        public CagetteAubergine aubergineBuild(){
            return new CagetteAubergine(this);
        }

        }

//        public CagetteChou chouBuilder(){
//         return new CagetteChou(this);
//        }

//        public CagetteFraise fraiseBuilder(){
//        return new CagetteFraise(this);
//        }

    public Client getProprietaire() {
        return proprietaire;
    }

    public void setProprietaire(Client proprietaire) {
        this.proprietaire = proprietaire;
    }

    public boolean isBio() {
        return bio;
    }

    public void setBio(boolean bio) {
        this.bio = bio;
    }

    public boolean isConforme() {
        return conforme;
    }

    public void setConforme(boolean conforme) {
        this.conforme = conforme;
    }

    public int getQuantite() {
        return quantite;
    }

    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }

    public int getPrix() {
        return prix;
    }

    public void setPrix(int prix) {
        this.prix = prix;
    }

    public Date getDatePeremption() {
        return datePeremption ;
    }

    public void setDatePeremption(Date datePeremption) {
        this.datePeremption = datePeremption;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void mettreEnVente(){
        System.out.println("Je suis le produit " + this.getNom() + " mon stock est de " + this.getQuantite() + " et je coute " + this.getPrix() + "euro");
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getPrixVegetalUnite() {
        return prixVegetalUnite;
    }

    public void setPrixVegetalUnite(double prixVegetalUnite) {
        this.prixVegetalUnite = prixVegetalUnite;
    }

    public int getQuantiteVegetalDansCagette() {
        return quantiteVegetalDansCagette;
    }

    public void setQuantiteVegetalDansCagette(int quantiteVegetalDansCagette) {
        this.quantiteVegetalDansCagette = quantiteVegetalDansCagette;
    }

    //    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        PropositionProduitFermier that = (PropositionProduitFermier) o;
//        return isBio() == that.isBio() &&
//                isConforme() == that.isConforme() &&
//                getQuantite() == that.getQuantite() &&
//                getPrix() == that.getPrix() &&
//                Objects.equals(getProprietaire(), that.getProprietaire()) &&
//                Objects.equals(getId(), that.getId()) &&
//                Objects.equals(getDatePeremption(), that.getDatePeremption());
//    }
//    @Override
//    public int hashCode() {
//        return Objects.hash(getProprietaire(), getId(), isBio(), isConforme(), getQuantite(), getPrix(), getDatePeremption());
//    }

}
