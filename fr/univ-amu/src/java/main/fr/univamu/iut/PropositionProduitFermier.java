package fr.univamu.iut;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;
public class PropositionProduitFermier {
    public PropositionProduitFermier(String propriétaire, String id, boolean bio, boolean conforme, int quantité, int prix) {
        this.propriétaire = propriétaire;
        this.id = id;
        this.bio = bio;
        this.conforme = conforme;
        this.quantité = quantité;
        this.prix = prix;
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.DAY_OF_YEAR, 7) ;
        Date date = calendar.getTime();
        this.datePéremption = date ;
    }
    private String propriétaire;
    private String id;
    private boolean bio;
    private boolean conforme;
    private int quantité;
    private int prix;
    private Date datePéremption;
    public String isBio( PropositionProduitFermier produit) {
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
    public String getPropriétaire() {
        return propriétaire;
    }
    public void setPropriétaire(String propriétaire) {
        this.propriétaire = propriétaire;
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
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
        return quantité;
    }
    public void setQuantité(int quantité) {
        this.quantité = quantité;
    }
    public int getPrix() {
        return prix;
    }
    public void setPrix(int prix) {
        this.prix = prix;
    }
    public Date getDatePéremption() {
        return datePéremption ;
    }
    public void setDatePéremption(Date datePéremption) {
        this.datePéremption = datePéremption;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PropositionProduitFermier that = (PropositionProduitFermier) o;
        return bio == that.bio &&
                conforme == that.conforme &&
                quantité == that.quantité &&
                prix == that.prix &&
                Objects.equals(propriétaire, that.propriétaire) &&
                Objects.equals(id, that.id) &&
                Objects.equals(datePéremption, that.datePéremption);
    }
    @Override
    public int hashCode() {
        return Objects.hash(propriétaire, id, bio, conforme, quantité, prix, datePéremption);
    }
}