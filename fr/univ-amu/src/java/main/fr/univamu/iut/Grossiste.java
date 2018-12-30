package fr.univamu.iut;



import java.util.*;


public class Grossiste extends Client {

    public Grossiste(String nom, boolean abonne, int idClient, CompteBancaire monComte) {
        super(nom, abonne, idClient, monComte);
        //this.monGérantAchat = monGérantAchat;
    }

    //private Set<CentraleAchat> monGérantAchat;

}