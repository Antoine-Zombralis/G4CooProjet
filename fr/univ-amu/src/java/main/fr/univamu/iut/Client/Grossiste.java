package fr.univamu.iut.Client;



import fr.univamu.iut.Client.Client;
import fr.univamu.iut.CompteBancaire;


public class Grossiste extends Client {

    public Grossiste(String nom, boolean abonne, int idClient, CompteBancaire monComte) {
        super(nom, abonne, idClient, monComte);
        //this.monGérantAchat = monGérantAchat;
    }

    //private Set<CentraleAchat> monGérantAchat;

}