package fr.univamu.iut;

import java.util.Calendar;
import java.util.Date;
import java.util.Objects;

public class Produits {

    private Client proprietaire;
    private boolean bio, conforme;
    private int quantite, prix, id;
    private Date datePeremption;


    public Produits(BuilderProduit builder) {
        proprietaire = builder.proprietaire;
        bio = builder.bio;
        conforme = builder.conforme;
        quantite = builder.quantite;
        id = builder.id;
        prix = builder.prix;
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.DAY_OF_YEAR, 7) ;
        Date date = calendar.getTime();
        datePeremption = date ;
    }

    public static class BuilderProduit{
        private Client proprietaire;
        private boolean bio, conforme;
        private int quantite, prix, id;
        private Date datePeremption;

        public BuilderProduit(int quantite, int prix){
            this.quantite = quantite;
            this.prix = prix;
        }

        public BuilderProduit addId(int id){
            this.id = id; return this;
        }

        public BuilderProduit addProprio(Client proprietaire){
            this.proprietaire = proprietaire; return this;
        }

        public BuilderProduit addBio(boolean bio){
            this.bio = bio; return this;
        }

        public BuilderProduit addConforme(boolean conforme){
            this.conforme = conforme; return this;
        }

        public BuilderProduit addDatePeremption(Date fin){
            datePeremption = fin; return this;
        }

        public PropositionProduitFermier build(){
            return new PropositionProduitFermier(this);
        }

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String isBio(PropositionProduitFermier produit) {
        if (bio){
            return "Le produit est bio";
        }
        return "Le produit n'est pas bio";
    }
    public void changerConforme(boolean conforme) {
        if (conforme){
            conforme = false;
        } else {
            conforme = true;
        }
    }


    public Client getPropriétaire() {
        return proprietaire;
    }

    public void setPropriétaire(Client proprietaire) {
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

    public int getQuantité() {
        return quantite;
    }

    public void setQuantité(int quantite) {
        this.quantite = quantite;
    }

    public int getPrix() {
        return prix;
    }

    public void setPrix(int prix) {
        this.prix = prix;
    }

    public Date getDatePéremption() {
        return datePeremption ;
    }

    public void setDatePéremption(Date datePéremption) {
        this.datePeremption = datePéremption;
    }


}
