package fr.univamu.iut.Test;

import fr.univamu.iut.Client.Client;
import fr.univamu.iut.Client.Detaillant;
import fr.univamu.iut.Client.Fermier.Arboriculteur;
import fr.univamu.iut.CompteBancaire;
import fr.univamu.iut.Produit.Produits;
import fr.univamu.iut.Produit.Viande.Volaille;
import fr.univamu.iut.Transaction;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TransactionTest {

    @Test
    void addTransaction() {
        int cpt = 0;
        int sizeTransaction = 0;
        Client client = new Arboriculteur("dédé", false, null);
        client.setMonComte(new CompteBancaire(client.getIdClient(), 2000));

        Client  vendeur = new Detaillant("gégé", false, null);
        vendeur.setMonComte(new CompteBancaire(vendeur.getIdClient(), 3000));

        Produits poulet = new Volaille.BuilderProduits(12, 22, "chicken")
                .addProprio(vendeur)
                .volailleBuild();

        Transaction transaction = new Transaction(vendeur,client,poulet);
        sizeTransaction = transaction.getTransactions().size();
        transaction.addTransaction(transaction);
        for(Transaction transac : transaction.getTransactions()) {
            cpt = cpt + 1;
        }
        if(cpt == sizeTransaction) {
            fail("La transaction n'a pas été effectuée");
        }
    }
}