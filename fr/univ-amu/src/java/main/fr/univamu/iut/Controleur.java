package fr.univamu.iut;


import fr.univamu.iut.Client.Client;
import fr.univamu.iut.Client.Fermier.Fermier;
import fr.univamu.iut.Produit.Produits;
import java.util.*;

/**
 * Classe contrôleur qui gère le bon fonctionnement du marché en éliminant les produits indésirables ou périmés
 */
public class Controleur {

    /**
     * Constructeur par défaut
     */
    public Controleur() {
    }

    /**
     * Liste des produits interdits du marché
     */
    public List<Produits> produitInterdits = new ArrayList();

    /**
     * @param fermier fonction qui envoie un message au fermier pour l'alerter d'un mauvais comportement (commercialisation de produits interdits)
     */
    public void sanctionner(Fermier fermier) {
        fermier.alerter();
    }

    /**
     * @param produit fonction qui permet de rentre un produit généré en produit commercialisable sur le marché en vérifiant s'il n'est pas interdit ou périmé
     */
    public void validerProduit(Produits produit) {
        Calendar calendar = Calendar.getInstance();
        Date date = calendar.getTime();                                     // on obtient la date courante
        int peremption = date.compareTo(produit.getDatePeremption());      // on compare la date courante avec la date de péremption. Renvoie 1 si date > date péremption
        for (Produits produitInter : produitInterdits) {
            if (produit.equals(produitInter))                               // produit interdit
            {
                produit.setConforme(false);
                return;
            }
        }
        if (peremption > 0)                                                 // date de péremption dépassée
            produit.setConforme(false);
        else
            produit.setConforme(true);
    }

    /**
     * @param produit
     * @param intéréssés fonction qui choisie le manière aléatoire un client parmis les clients intéréssés pour le produit
     * @return l'acheteur choisie
     */
    public Client choisirAcheteur(Produits produit, ArrayList<Client> intéréssés) {
        int n = (int) Math.random() * intéréssés.size();    // récupération d'un entier aléatoire entre  et intéréssés.size()
        Client acheteur = intéréssés.get(n);
        return acheteur;
    }

    public List<Produits> getProduitInterdits() {
        return produitInterdits;
    }


    /**
     * @param produit
     * fonction qui permet l'ajout d'un produit dans la liste des produits interdits
     */
    public void ajouterProduitInterdits(Produits produit) {
        produitInterdits.add(produit);
    }

    /**
     * @param produitAutorisé
     * fonction qui permet la suppression d'un produit de la liste des produits interdits
     */
    public void supprimerProduitInterdits(Produits produitAutorisé) {
        produitInterdits.remove(produitAutorisé);
    }
}