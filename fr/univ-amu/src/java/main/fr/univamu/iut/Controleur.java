package fr.univamu.iut;


import java.util.*;


public class Controleur {


    public Controleur() {
        produitInterdits = new ArrayList<>();
    }


    private List<String> adhérents;
    public List<PropositionProduitFermier> produitInterdits;



    public void sanctionner(Fermier fermier) {
        fermier.alerter() ;
    }


    public void validerProduit(PropositionProduitFermier produit) {
        Calendar calendar = Calendar.getInstance();
        Date date = calendar.getTime();
        int périmé = produit.getDatePéremption().compareTo(date) ;
        for (PropositionProduitFermier produitInter: produitInterdits) {
            if (produit.equals(produitInter)) {
                produit.setConforme(false);
            }
            }
         if (périmé < 0)
                produit.changerConforme(false);
         else {
                produit.setConforme(true);
                ProduitCommercialisable commercialisable = (ProduitCommercialisable) produit;
                produit.getPropriétaire().ajouterListe(commercialisable);
            }




    }


//   public void Client choisirActeur() {
//
//    }

}
