package fr.univamu.iut.Client;

import fr.univamu.iut.CompteBancaire;

import java.util.List;

public class CentraleAchat extends Client {
    private List<Client> affiliés ;
    private Grossiste mesGrossistes ;

    public CentraleAchat(String nom, boolean abonne, CompteBancaire monComte, List<Client> affiliés) {
        super(nom, abonne, monComte);
        this.affiliés = affiliés;
    }
}
