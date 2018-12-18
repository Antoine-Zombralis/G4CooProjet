package fr.univamu.iut;

import java.util.Date;

public class CagetteCarotte extends Fruit {

    private int prixCarotteUnite;
    private int quantiteCarotte;
    private int prixCagetteUnite;
    private int quantiteCagette;

    public CagetteCarotte(Fermier propriétaire, String id, boolean bio, int quantité, int prix, int poids, int prixCarotteUnite, int quantiteCarotte, int prixCagetteUnite, int quantiteCagette) {
        super(propriétaire, id, bio, quantité, prix, poids);
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