package fr.univamu.iut.Produit;

public class CagetteAubergine extends Legume {

    private int prixAubergineUnite;
    private int quantiteAubergineDansCagette;

    public CagetteAubergine(BuilderProduits builder, int prixAubergineUnite, int quantiteAubergineDansCagette) {
        super(builder);
        this.prixAubergineUnite = prixAubergineUnite;
        this.quantiteAubergineDansCagette = quantiteAubergineDansCagette;
    }

    public int getPrixAubergineUnite() {
        return prixAubergineUnite;
    }

    public void setPrixAubergineUnite(int prixAubergineUnite) {
        this.prixAubergineUnite = prixAubergineUnite;
    }

    public int getQuantiteAubergineDansCagette() {
        return quantiteAubergineDansCagette;
    }

    public void setQuantiteAubergineDansCagette(int quantiteAubergineDansCagette) {
        this.quantiteAubergineDansCagette = quantiteAubergineDansCagette;
    }
}