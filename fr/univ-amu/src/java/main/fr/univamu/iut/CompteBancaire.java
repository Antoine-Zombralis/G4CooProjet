package fr.univamu.iut;

import fr.univamu.iut.Client.Client;
import fr.univamu.iut.Client.Fermier.Fermier;

import java.util.*;


public class CompteBancaire {

    private int idClient;
    private int solde;

    public CompteBancaire(int idClient, int solde) {
        this.idClient = idClient;
        this.solde = solde;
    }

    public int getSolde() {
        return solde;
    }

    public void crediter(int idClient, int solde) {
        if(this.idClient == idClient){
            this.solde = this.solde + solde;
        }
    }

    public void debiter(int idClient, int solde) {
        if(this.idClient == idClient){
            this.solde = this.solde - solde;
        }
    }

    public void setIdClient(int idClient) {
        this.idClient = idClient;
    }

    public void setSolde(int solde) {
        this.solde = solde;
    }
}