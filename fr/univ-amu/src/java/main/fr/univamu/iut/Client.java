package fr.univamu.iut;

import java.util.List;

public interface Client {

    List<ProduitCommercialisable> mesProduitsAchetés = null;

    public boolean abonne = false;

    public int id = 0;

    CompteBancaire monComte = null;

    public void acheterProduit(ProduitCommercialisable produit);

    public void notifierClient(int id);

}