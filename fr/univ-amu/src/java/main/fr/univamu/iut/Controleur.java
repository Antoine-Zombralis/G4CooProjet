package fr.univamu.iut;


import fr.univamu.iut.Fermier.Fermier;
import fr.univamu.iut.Produit.Produits;

import java.util.*;


public class Controleur {

    public Controleur() {}

    private List<String> adhérents;
    public List<Produits> produitInterdits;


    public void sanctionner(Fermier fermier) {
        fermier.alerter() ;
    }

    public void validerProduit(Produits produit) {
        Calendar calendar = Calendar.getInstance();
        Date date = calendar.getTime();                                  // on obtient la date courante
        int péremption = date.compareTo(produit.getDatePeremption()) ;   // on compare la date courante avec la date de péremption. Renvoie 1 si date > date péremption
        for (Produits produitInter: produitInterdits) {
            if (produit.equals(produitInter) || péremption > 0)          // produit interdit ou date de péremption dépassée
            {
                produit.setConforme(false);
            }
            else {produit.setConforme(true);

        }
        }
    }

    public void conformerProduit(Produits produit){
        if(Math.random() > 0.5){
            produit.setConforme(true);
        }
        else{
            produit.setConforme(false);
        }
    }

    public Client choisirAcheteur(Produits produit, ArrayList<Client> intéréssés) {
        int n = (int)Math.random() * intéréssés.size() ; // récupération d'un entier aléatoire entre  et intéréssés.size()
        Client acheteur = intéréssés.get(n) ;
        return acheteur ;
    }

    public List<Produits> getProduitInterdits() {
        return produitInterdits;
    }


    public void ajouterProduitInterdits(Produits produit){
        produitInterdits.add(produit) ;
    }

    public void supprimerProduitInterfits(Produits produitAutorisé) {
        for (Produits produit : produitInterdits)
        {
            if (produit.equals(produitAutorisé))
                produitInterdits.remove(produit) ;
        }
    }
}