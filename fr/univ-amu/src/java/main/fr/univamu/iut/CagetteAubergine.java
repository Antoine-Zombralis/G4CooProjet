package fr.univamu.iut;

import java.util.Date;

public class CagetteAubergine extends Legume {

    private int prixAubergineUnite;
    private int quantiteAubergine;
    private int prixCagetteUnite;
    private int quantiteCagette;

    public CagetteAubergine(BuilderProduit builder, int prixAubergineUnite, int quantiteAubergine, int prixCagetteUnite, int quantiteCagette) {
        super(builder);
        this.prixAubergineUnite = prixAubergineUnite;
        this.quantiteAubergine = quantiteAubergine;
        this.prixCagetteUnite = prixCagetteUnite;
        this.quantiteCagette = quantiteCagette;
    }

    public int getQuantiteAubergine() {
        return quantiteAubergine;
    }

    public int getQuantiteCagette() {
        return quantiteCagette;
    }

    public int getPrixAubergineUnite(){ return prixAubergineUnite; }

    public void setQuantiteAubergine(int quantiteAubergine) {
        this.quantiteAubergine = quantiteAubergine;
    }

    public void setQuantiteCagette(int quantiteCagette) {
        this.quantiteCagette = quantiteCagette;
    }

    public void setPrixAubergineUnite(int prixAubergineUnite) {
        this.prixAubergineUnite = prixAubergineUnite;
    }

}