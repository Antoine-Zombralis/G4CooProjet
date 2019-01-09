package fr.univamu.iut;

/**
 * Classe qui gère les comptes bancaire des clients
 */
public class CompteBancaire {

    private int idClient;
    private double solde;

    /**
     * @param idClient
     * @param solde
     * Constructeur du compte bancaire qui prend en paramètre un idClient et un solde de base
     */
    public CompteBancaire(int idClient, int solde) {
        this.idClient = idClient;
        this.solde = solde;
    }

    /**
     * @param idClient
     * @param solde (montant à créditer)
     * Crédite le compte du client (idClient), d'un montant spécifié dans les paramètres (par exemple lors d'une vente)
     */
    public void crediter(int idClient,double solde) {
        if(this.idClient == idClient){
            this.solde = this.solde + solde;
        }
    }

    /**
     * @param idClient
     * @param solde (montant à débiter)
     * Débite le compte du client (idClient), d'un montant spécifié dans les paramètres (par exemple lors d'un achat)
     */
    public void debiter(int idClient, double solde) {
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

    public double getSolde() {
        return solde;
    }

}