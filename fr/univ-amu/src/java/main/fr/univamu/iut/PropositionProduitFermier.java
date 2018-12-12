package fr.univamu.iut;


import java.util.*;


public class PropositionProduitFermier {

    private PropositionProduitFermier() {
    }

    private String propriétaire;

    private String id;

    private boolean bio;

    private boolean conforme;

    private int quantité;

    private int prix;

    public Date datePéremption;

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