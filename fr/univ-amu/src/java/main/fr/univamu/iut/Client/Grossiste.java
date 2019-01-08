package fr.univamu.iut.Client;



import fr.univamu.iut.Client.Client;
import fr.univamu.iut.CompteBancaire;


public class Grossiste extends Client {

    public Grossiste(String nom, boolean abonne, CompteBancaire monComte) {
        super(nom, abonne, monComte);
        //this.monGérantAchat = monGérantAchat;
    }

    //private Set<CentraleAchat> monGérantAchat;

}