package fr.univamu.iut.Produit;

import fr.univamu.iut.Client.Client;
import fr.univamu.iut.Produit.Arbre.Banzai;
import fr.univamu.iut.Produit.Arbre.Pommier;
import fr.univamu.iut.Produit.Arbre.Rosier;
import fr.univamu.iut.Produit.Arbre.Sapin;
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

/**
 * Classe Produits qui a un builder qui permet d'ajouter des parametres optonnelles à ses classes filles.
 * Le builder retourne une instance différente pour chaque type des classe filles
 */

public class Produits {

    private Client proprietaire;
    private boolean bio, conforme;
    private int quantite, id;
    private double prix;
    private static int cpt = 0;
    private Date datePeremption;
    private String nom;
    private double prixUnite;
    private int quantiteVegetalDansCagette;
    private EnumLabel label;
    private CategorieVache categorieVache;
    private CategorieCochon categorieCochon;
    private CategorieVolaille categorieVolaille;

    /**
     * @param builder
     * L'identifiant est généré automatiquement
     */
    public Produits(BuilderProduits builder) {
        proprietaire = builder.proprietaire;
        nom = builder.nom;
        bio = builder.bio;
        conforme = false;
        quantite = builder.quantite;
        setId(++cpt);
        prix = builder.prix;
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.DAY_OF_YEAR, 7);
        Date date = calendar.getTime();
        datePeremption = date;
        prixUnite = builder.prixUnite;
        quantiteVegetalDansCagette = builder.quantiteVegetalDansCagette;
        label = builder.label;
        categorieCochon = builder.categorieCochon;
        categorieVache = builder.categorieVache;
        categorieVolaille = builder.categorieVolaille;
    }

    /**
     * La classe static BuilderProduits permet d'ajouter des attributs optionnels aux sous-classe de produit
     */
    public static class BuilderProduits {
        private Client proprietaire;
        private boolean bio;
        private int quantite;
        private double prix;
        private Date datePeremption;
        private String nom;
        private double prixUnite;
        private int quantiteVegetalDansCagette;
        private EnumLabel label;
        private CategorieVache categorieVache;
        private CategorieCochon categorieCochon;
        private CategorieVolaille categorieVolaille;


        /**
         * @param quantite
         * @param prix
         * @param nom
         */
        public BuilderProduits(int quantite, double prix, String nom) {
            this.quantite = quantite;
            this.prix = prix;
            this.nom = nom;
        }


        /**
         * @param proprietaire
         * @return this
         */
        public BuilderProduits addProprio(Client proprietaire) {
            this.proprietaire = proprietaire;
            return this;
        }

        /**
         * @param bio
         * @return this
         */
        public BuilderProduits addBio(boolean bio) {
            this.bio = bio;
            return this;
        }

        /**
         * @param fin
         * @return this
         */
        public BuilderProduits addDatePeremption(Date fin) {
            datePeremption = fin;
            return this;
        }

        /**
         * @param prix
         * @return this
         */
        public BuilderProduits addPrixUnite(double prix) {
            prixUnite = prix;
            return this;
        }

        /**
         * @param quantite
         * @return this
         */
        public BuilderProduits addQuantiteVegetalDansCagette(int quantite) {
            quantiteVegetalDansCagette = quantite;
            return this;
        }

        /**
         * @param label
         * @return this
         */
        public BuilderProduits addLabel(EnumLabel label) {
            this.label = label;
            return this;
        }

        /**
         * @param categorieVache
         * @return this
         */
        public BuilderProduits addCategorieVache(CategorieVache categorieVache) {
            this.categorieVache = categorieVache;
            return this;
        }

        /**
         * @param categorieVolaille
         * @return this
         */
        public BuilderProduits addCategorieVolaille(CategorieVolaille categorieVolaille) {
            this.categorieVolaille = categorieVolaille;
            return this;
        }

        /**
         * @param categorieCochon
         * @return this
         */
        public BuilderProduits addCategorieCochon(CategorieCochon categorieCochon) {
            this.categorieCochon = categorieCochon;
            return this;
        }

        /**
         * @return nouvelle instance de CagetteDePoire
         */
        public CagettePoire poireBuild() {
            return new CagettePoire(this);
        }

        /**
         * @return nouvelle instance de CagetteDeAubergine
         */
        public CagetteAubergine aubergineBuild() {
            return new CagetteAubergine(this);
        }

        /**
         * @return nouvelle instance de CagetteDeCarotte
         */
        public CagetteCarotte carotteBuild() {
            return new CagetteCarotte(this);
        }

        /**
         * @return nouvelle instance de CagetteDeChou
         */
        public CagetteChou chouBuild() {
            return new CagetteChou(this);
        }

        /**
         * @return nouvelle instance de CagetteDeFraise
         */
        public CagetteFraise fraiseBuild() {
            return new CagetteFraise(this);
        }

        /**
         * @return nouvelle instance de CagetteDePomme
         */
        public CagettePomme pommeBuild() {
            return new CagettePomme(this);
        }

        /**
         * @return nouvelle instance de Banzai
         */
        public Banzai banzaiBuild() {
            return new Banzai(this);
        }

        /**
         * @return nouvelle instance de Pommier
         */
        public Pommier pommierBuild() {
            return new Pommier(this);
        }

        /**
         * @return nouvelle instance de Rosier
         */
        public Rosier rosierBuid() {
            return new Rosier(this);
        }

        /**
         * @return nouvelle instance de Sapin
         */
        public Sapin sapinBuild() {
            return new Sapin(this);
        }

        /**
         * @return nouvelle instance de Beurre
         */
        public Beurre beurreBuild() {
            return new Beurre(this);
        }

        /**
         * @return nouvelle instance de Fromage
         */
        public Fromage fromageBuild() {
            return new Fromage(this);
        }

        /**
         * @return nouvelle instance de Lait
         */
        public Lait laitBuild() {
            return new Lait(this);
        }

        /**
         * @return nouvelle instance de Vache
         */
        public Vache vacheBuild() {
            return new Vache(this);
        }

        /**
         * @return nouvelle instance de Cochon
         */
        public Cochon cochonBuild() {
            return new Cochon(this);
        }

        /**
         * @return nouvelle instance de Volailles
         */
        public Volaille volailleBuild() {
            return new Volaille(this);
        }

        /**
         * @return nouvelle instance de Produits
         */
        public Produits build() {
            return new Produits(this);
        }

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
        return datePeremption;
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

    public void mettreEnVente() {
        System.out.println("Je suis le produit " + this.getNom() + " mon stock est de " + this.getQuantite() + " et je coute " + this.getPrix() + "euro");
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getPrixUnite() {
        return prixUnite;
    }

    public void setPrixUnite(double prixUnite) {
        this.prixUnite = prixUnite;
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
}

