package fr.univamu.iut;

import java.util.List;

/**
 * 
 */
public class Trader implements Client {

    private boolean abonne = false;
    private int id = 0;
    private CompteBancaire monComte = null;
    private Boolean travaillerSurMarché;
    private List<ProduitCommercialisable> mesProduitsAchetés = null;
    private List<ProduitCommercialisable> mesProdtuisEnVente = null;

    public Trader(boolean abonne, int id, CompteBancaire monComte, Boolean travaillerSurMarché, List<ProduitCommercialisable> mesProduitsAchetés, List<ProduitCommercialisable> mesProdtuisEnVente) {
        this.abonne = abonne;
        this.id = id;
        this.monComte = monComte;
        this.travaillerSurMarché = travaillerSurMarché;
        this.mesProduitsAchetés = mesProduitsAchetés;
        this.mesProdtuisEnVente = mesProdtuisEnVente;
    }

    public boolean isAbonne() {
        return abonne;
    }

    public void setAbonne(boolean abonne) {
        this.abonne = abonne;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public CompteBancaire getMonComte() {
        return monComte;
    }

    public void setMonComte(CompteBancaire monComte) {
        this.monComte = monComte;
    }

    public Boolean getTravaillerSurMarché() {
        return travaillerSurMarché;
    }

    public void setTravaillerSurMarché(Boolean travaillerSurMarché) {
        this.travaillerSurMarché = travaillerSurMarché;
    }

    public List<ProduitCommercialisable> getMesProduitsAchetés() {
        return mesProduitsAchetés;
    }

    public void setMesProduitsAchetés(List<ProduitCommercialisable> mesProduitsAchetés) {
        this.mesProduitsAchetés = mesProduitsAchetés;
    }

    public List<ProduitCommercialisable> getMesProdtuisEnVente() {
        return mesProdtuisEnVente;
    }

    public void setMesProdtuisEnVente(List<ProduitCommercialisable> mesProdtuisEnVente) {
        this.mesProdtuisEnVente = mesProdtuisEnVente;
    }

    @Override
    public void acheterProduit(ProduitCommercialisable produit){
        mesProduitsAchetés.add(produit) ;
    }

    @Override
    public void notifierClient(Client client){
        System.out.println("De nouveaux produit ont été mis en vente pour vous " + Client.getNom);
    }

    public void mettreEnVente(ProduitCommercialisable produit) {
        // TODO implement here
    }

}