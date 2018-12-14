package fr.univamu.iut;

private class Aubergine extends Legume {

    private int prixAubergineUnite;
    private int quantiteAubergine;
    private int prixCagetteUnite;
    private int quantiteCagette;

    public CagetteAubergine(int prixAubergineUnite, int quantiteAubergine, int quantiteCagette) {
        this.prixAubergineUnite = prixAubergineUnite;
        this.quantiteAubergine = quantiteAubergine;
        this.prixCagetteUnite = quantiteAubergine * prixAubergineUnite;
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