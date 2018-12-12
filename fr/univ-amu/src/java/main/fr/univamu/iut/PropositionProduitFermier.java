package fr.univamu.iut;


import java.util.*;


public class PropositionProduitFermier {

    public PropositionProduitFermier(String propriétaire, String id, boolean bio, boolean conforme, int quantité, int prix, Date datePéremption) {
        this.propriétaire = propriétaire;
        this.id = id;
        this.bio = bio;
        this.conforme = conforme;
        this.quantité = quantité;
        this.prix = prix;
        this.datePéremption = datePéremption;
    }

    private String propriétaire;

    private String id;

    private boolean bio;

    private boolean conforme;

    private int quantité;

    private int prix;

    private Date datePéremption;

    public boolean isBio( PropositionProduitFermier produit) {
        if (bio){
            return true;
        }
        return false;
    }

    public void changerConforme(boolean conforme) {
        if (conforme){
            conforme = false;
        } else {
            conforme = true;
        }
    }

}