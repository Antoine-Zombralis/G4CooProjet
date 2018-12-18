package fr.univamu.iut;

import java.util.Date;

public class CagetteCarotte extends Fruit {

    private int prixCarotteUnite;
    private int quantiteCarotte;
    private int prixCagetteUnite;
    private int quantiteCagette;

    public CagetteCarotte(String propriétaire, String id, boolean bio, boolean conforme, int quantité, int prix, Date datePéremption, int poids, int prixCarotteUnite, int quantiteCarotte, int prixCagetteUnite, int quantiteCagette) {
        super(propriétaire, id, bio, conforme, quantité, prix, datePéremption, poids);
        this.prixCarotteUnite = prixCarotteUnite;
        this.quantiteCarotte = quantiteCarotte;
        this.prixCagetteUnite = prixCagetteUnite;
        this.quantiteCagette = quantiteCagette;
    }

    public int getQuantiteCarotte() {
        return quantiteCarotte;
    }

    public int getQuantiteCagette() {
        return quantiteCagette;
    }

    public int getPrixCarotteUnite(){ return prixCarotteUnite; }

    public void setQuantiteCarotte(int quantiteCarotte) {
        this.quantiteCarotte = quantiteCarotte;
    }

    public void setQuantiteCagette(int quantiteCagette) {
        this.quantiteCagette = quantiteCagette;
    }

    public void setPrixCarotteUnite(int prixCarotteUnite) {
        this.prixCarotteUnite = prixCarotteUnite;
    }
}