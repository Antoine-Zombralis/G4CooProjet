package fr.univamu.iut;

import java.util.List;

public class CentraleAchat extends Client {
    private List<Client> affiliés ;
    private Grossiste mesGrossistes ;

    public CentraleAchat(String nom, boolean abonne, int id, CompteBancaire monComte, List<ProduitCommercialisable> mesProduitsAchetés, List<Client> affiliés) {
        super(nom, abonne, id, monComte, mesProduitsAchetés);
        this.affiliés = affiliés;
    }
}
