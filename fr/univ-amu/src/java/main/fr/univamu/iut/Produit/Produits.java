package fr.univamu.iut.Produit;

import fr.univamu.iut.Client.Client;
import fr.univamu.iut.Produit.Arbre.Banzai;
import fr.univamu.iut.Produit.Arbre.Pommier;
import fr.univamu.iut.Produit.Arbre.Rosier;
import fr.univamu.iut.Produit.Arbre.Sapin;
import fr.univamu.iut.Produit.Arbres.Banzai;
import fr.univamu.iut.Produit.Arbres.Pommier;
import fr.univamu.iut.Produit.Arbres.Rosier;
import fr.univamu.iut.Produit.Arbres.Sapin;
import fr.univamu.iut.Produit.Enum.CategorieCochon;
import fr.univamu.iut.Produit.Enum.CategorieVache;
import fr.univamu.iut.Produit.Enum.CategorieVolaille;
import fr.univamu.iut.Produit.Enum.EnumLabel;
import fr.univamu.iut.Produit.FruitEtLegume.*;
import fr.univamu.iut.Produit.ProduitsLaitier.Beurre;
import fr.univamu.iut.Produit.ProduitsLaitier.Fromage;
import fr.univamu.iut.Produit.ProduitsLaitier.Lait;
import fr.univamu.iut.Produit.Viande.Cochon;
import fr.univamu.iut.Produit.Viande.Vache;
import fr.univamu.iut.Produit.Viande.Volaille;

import java.util.Calendar;
import java.util.Date;

public abstract class Produits{

    private Client proprietaire;
    private boolean bio, conforme;
    private int quantite, id;
    private double prix;
    private static int cpt = 0;
    private Date datePeremption;
    private String nom;
    private double prixVegetalUnite;
    private int quantiteVegetalDansCagette;
    private EnumLabel label;
    private CategorieVache categorieVache;
    private CategorieCochon categorieCochon;
    private CategorieVolaille categorieVolaille;

    public Produits (BuilderProduits builder) {
        proprietaire = builder.proprietaire;
        nom = builder.nom;
        bio = builder.bio;
        conforme = builder.conforme;
        quantite = builder.quantite;
        setId(++cpt);
        prix = builder.prix;
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.DAY_OF_YEAR, 7) ;
        Date date = calendar.getTime();
        datePeremption = date ;
        prixVegetalUnite = builder.prixVegetalUnite;
        quantiteVegetalDansCagette = builder.quantiteVegetalDansCagette;
        label = builder.label;
        categorieCochon = builder.categorieCochon;
        categorieVache = builder.categorieVache;
        categorieVolaille = builder.categorieVolaille;
    }

    public static class BuilderProduits {
        private Client proprietaire;
        private boolean bio, conforme;
        private int quantite;
        private double prix;
        private Date datePeremption;
        private String nom;
        private double prixVegetalUnite;
        private int quantiteVegetalDansCagette;
        private EnumLabel label;
        private CategorieVache categorieVache;
        private CategorieCochon categorieCochon;
        private CategorieVolaille categorieVolaille;


        public BuilderProduits(int quantite, double prix, String nom){
            this.quantite = quantite;
            this.prix = prix;
            this.nom = nom;
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

        public BuilderProduits addLabel(EnumLabel label){
            this.label = label; return this;
        }

        public BuilderProduits addCategorieVache(CategorieVache categorieVache){
             this.categorieVache = categorieVache; return this;
        }

        public BuilderProduits addCategorieVolaille(CategorieVolaille categorieVolaille){
            this.categorieVolaille = categorieVolaille; return this;
        }

        public BuilderProduits addCategorieCochon(CategorieCochon categorieCochon){
            this.categorieCochon = categorieCochon; return this;
        }

        public CagettePoire poireBuild(){
            return new CagettePoire(this);
        }

        public CagetteAubergine aubergineBuild(){
            return new CagetteAubergine(this);
        }

        public CagetteCarotte carotteBuild(){return new CagetteCarotte(this);
        }

        public CagetteChou chouBuild(){
            return new CagetteChou(this);
        }

        public CagetteFraise fraiseBuild(){
            return new CagetteFraise(this);
        }

        public CagettePoire poirebuild(){
            return new CagettePoire(this);
        }

        public CagettePomme pommeBuild(){
            return new CagettePomme(this);
        }

        public Banzai banzaiBuild(){
            return new Banzai(this);
        }

        public Pommier pommierBuild(){
            return new Pommier(this);
        }

        public Rosier rosierBuid(){
            return new Rosier(this);
        }

        public Sapin sapinBuild(){
            return new Sapin(this);
        }

        public Beurre beurreBuild(){return new Beurre(this);}

        public Fromage fromageBuild(){return new Fromage(this);}

        public Lait laitBuild(){return new Lait(this);}

        public Vache vacheBuild(){return new Vache(this);}

        public Cochon cochonBuild(){return new Cochon(this);}

        public Volaille volailleBuild(){return new Volaille(this);}

        }


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

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
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

    public EnumLabel getLabel() {
        return label;
    }

    public void setLabel(EnumLabel label) {
        this.label = label;
    }

    public CategorieVache getCategorieVache() {
        return categorieVache;
    }

    public void setCategorieVache(CategorieVache categorieVache) {
        this.categorieVache = categorieVache;
    }

    public CategorieCochon getCategorieCochon() {
        return categorieCochon;
    }

    public void setCategorieCochon(CategorieCochon categorieCochon) {
        this.categorieCochon = categorieCochon;
    }

    public CategorieVolaille getCategorieVolaille() {
        return categorieVolaille;
    }

    public void setCategorieVolaille(CategorieVolaille categorieVolaille) {
        this.categorieVolaille = categorieVolaille;
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
