package fr.univamu.iut;


import java.util.*;


public class Controleur {


    public Controleur() {}


    private List<String> adhérents;
    public List<PropositionProduitFermier> produitInterdits;



    public void sanctionner(Fermier fermier) {
        fermier.alerter() ;
    }


    public void validerProduit(PropositionProduitFermier produit) {
        Calendar calendar = Calendar.getInstance();
        Date date = calendar.getTime(); // on obtient la date courante
        int péremption = date.compareTo(produit.getDatePeremption()) ; // on compare la date courante avec la date de péremption. Renvoie 1 si date > date péremption
        for (PropositionProduitFermier produitInter: produitInterdits) {
            if (produit.equals(produitInter) || péremption > 0) // produit interdit ou date de péremption dépassée
            {
                produit.setConforme(false);
            }
            else {produit.setConforme(true);

        }
        }
    }

    /**
     *
     */
    public void Client choisirActeur() {
        // TODO implement here
    }

}