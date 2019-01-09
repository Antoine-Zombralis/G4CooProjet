package fr.univamu.iut.Client;

import fr.univamu.iut.Client.Fermier.Fermier;
import fr.univamu.iut.CompteBancaire;
import fr.univamu.iut.OffreAchat;
import fr.univamu.iut.Produit.Produits;
import fr.univamu.iut.Transaction;

import java.util.ArrayList;
import java.util.List;

/**
 * La classe abstract cliet est la plus haute classe de notre hierachie et elle permet de donner ses attributs aux sous-classes et notamment aux fermier qui sont aussi des clients.
 */
public abstract class Client {

    private String nom;
    private boolean abonne;
    private int idClient;
    private static int cpt = 0;
    private CompteBancaire monComte;
    private Transaction transaction;
    private OffreAchat offreAchat;

    private List<Produits> mesProduitsAchetes = new ArrayList<>();
    private static List<Transaction> transactionsClient = new ArrayList<>();


    /**
     * @param nom
     * @param abonne
     * @param monComte
     * L'identifiant est généré automatiquement
     */
    public Client(String nom, boolean abonne, CompteBancaire monComte) {
        this.nom = nom;
        this.abonne = abonne;
        setId(++cpt);
        this.monComte = monComte;
    }

    /**
     * @param produit
     * Est en abstract car les sous classes vont redéfinir cette classe
     */
    public abstract void supprimerProduit(Produits produit);


    public boolean isAbonne() {
        return abonne;
    }

    public void setAbonne(boolean abonne) {
        this.abonne = abonne;
    }

    public int getIdClient() {
        return idClient;
    }

    public void setId(int idClient) {
        this.idClient = idClient;
    }

    public CompteBancaire getMonComte() {
        return monComte;
    }

    public void setMonComte(CompteBancaire monComte) {
        this.monComte = monComte;
    }

    public List<Produits> getMesProduitsAchetes() {
        return mesProduitsAchetes;
    }
    public Transaction getTransaction() {
        return transaction;
    }

    public void setTransaction(Transaction transaction) {
        this.transaction = transaction;
    }

    public OffreAchat getOffreAchat() {
        return offreAchat;
    }

    public void setOffreAchat(OffreAchat offreAchat) {
        this.offreAchat = offreAchat;
    }

    public static List<Transaction> getTransactionsClient() {
        return transactionsClient;
    }

    /**
     * Permet de valider un offre si le vendeur accepte l'offre d'achat et si il a l'argent necessaire sur son compte
     */
    public void validerOffre() {
        if (offreAchat.isAccepter() && offreAchat.getMonCreateur().getMonComte().getSolde() > offreAchat.getMontant()) {
            offreAchat.getMonCreateur().acheterProduit(offreAchat.getProduitConcerne(), offreAchat.getProduitConcerne().getProprietaire(), offreAchat.getQuantite());
        } else {
            System.out.println("Vous ne pouvez pas acheter ce produit...");
        }
    }

    /**
     * @param accepter
     * met l'attribut accepter a true
     */
    public void accepterOffre(boolean accepter) {
        if (accepter) {
            offreAchat.setConforme(accepter);
        }
    }

    public void setMesProduitsAchetes(List<Produits> mesProduitsAchetes) {
        this.mesProduitsAchetes = mesProduitsAchetes;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    /**
     * @param produit
     * @param vendeur
     * @param quantite
     * Permet d'acheter un produit.
     * Le compte de l'acheteur va être débiter et les produits qu'il vend seront supprimés de sa liste de produit
     * Le compte du vendeur va être créditer et les produits qu'il achete seront ajoutés à sa liste de produit
     */
    public void acheterProduit(Produits produit, Client vendeur, int quantite) {
        if(quantite > produit.getQuantite()){
            System.out.println("Pas assez de produits pour cette transaction");
        }
        else{
            int newQuantite = produit.getQuantite() - quantite;
            Produits nouveau = new Produits.BuilderProduits(quantite, produit.getPrix(), produit.getNom()).build();
            produit.setQuantite(newQuantite);
            mesProduitsAchetes.add(nouveau);
            monComte.debiter(idClient, produit.getPrix() * quantite);
            vendeur.getMonComte().setSolde(vendeur.getMonComte().getSolde() + produit.getPrix() * quantite);
            transaction = new Transaction(vendeur, this, produit, produit.getPrix()*quantite);
            transactionsClient.add(transaction);

            if(produit.getQuantite() <= 0){
                produit.getProprietaire().supprimerProduit(produit);
            }

        }

    }

    /**
     * @param client
     * @return string
     * notifier un client lorsqu'un produit est mis en vente
     */
    public String notifierClient(Client client) {
        return "De nouveaux produits ont été mis en vente pour vous " + client.getNom();
    }

    /**
     * Affiche les produits qui ont été acheté
     */
    public void afficherMesProduits(){
        for(Produits produit: mesProduitsAchetes){
            System.out.println("Produit : " + produit.getNom() + " - quantité : " + produit.getQuantite());
        }
    }

}

