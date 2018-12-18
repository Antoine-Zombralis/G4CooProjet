package fr.univamu.iut;

import java.util.List;

public class CentraleAchat extends Client {
    private List<Client> affiliés ;
    private Grossiste mesGrossistes ;

    public CentraleAchat(String nom, boolean abonne, int idClient, CompteBancaire monComte, List<Client> affiliés) {
        super(nom, abonne, idClient, monComte);
        this.affiliés = affiliés;
    }
}
