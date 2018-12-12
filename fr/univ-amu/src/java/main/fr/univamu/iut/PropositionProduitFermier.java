package fr.univamu.iut;

fermier;

import java.util.*;


private class PropositionProduitFermier {

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

    /**
     * @param bool conforme
     */
    public void changerConforme(boolean conforme) {
        if (conforme){
            conforme = false;
        } else {
            conforme = true;
        }
    }

}