package fr.univamu.iut;

import fr.univamu.iut.Client.Client;
import fr.univamu.iut.Client.Fermier.Fermier;

import java.util.*;


public class CompteBancaire {

    public CompteBancaire(int idClient, int solde) {
        this.idClient = idClient;
        this.solde = solde;
    }

    private int idClient;

    private int solde;

    public int getSolde() {
        return solde;
    }

    private List<Fermier> mesFermiers;

    private List<Client> mesClients;

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

    public void ajouterClient(Client client) {
        mesClients.add(client) ;
    }

    public void ajouterFermier(Fermier fermier) {
        mesFermiers.add(fermier) ;
    }

}