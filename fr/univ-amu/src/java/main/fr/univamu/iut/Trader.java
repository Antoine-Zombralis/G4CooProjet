package fr.univamu.iut;

import java.util.List;

public class Trader extends Client {

    private Boolean travaillerSurMarche;
    private List<ProduitCommercialisable> mesProdtuisEnVente = null;

    public Trader(String nom, boolean abonne, int idClient, CompteBancaire monComte, Boolean travaillerSurMarche, List<ProduitCommercialisable> mesProdtuisEnVente) {
        super(nom, abonne, idClient, monComte);
        this.travaillerSurMarche = travaillerSurMarche;
        this.mesProdtuisEnVente = mesProdtuisEnVente;
    }

    @Override
    public void acheterProduit(ProduitCommercialisable produit){
        getMesProduitsAchetes().add(produit) ;
    }

    @Override
    public void notifierClient(Client client){
        System.out.println("De nouveaux produit ont été mis en vente pour vous " + client.getNom());
    }

    public void mettreEnVente(ProduitCommercialisable produit) {
        // TODO implement here
    }

}