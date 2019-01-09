package fr.univamu.iut.Test;

import fr.univamu.iut.Client.Client;
import fr.univamu.iut.Client.Detaillant;
import fr.univamu.iut.CompteBancaire;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

class ClientTest {

    @Test
    final void acheterProduit() {
        CompteBancaire compteClient = new CompteBancaire(2222, 0);
        Client clientProduit = new Detaillant("gégé", true, compteClient);
    }

    @Test
    final void notifierClient() {
        CompteBancaire compteClient = new CompteBancaire(2222, 0);
        Client client = new Detaillant("gégé", true, compteClient);
        String res = "De nouveaux produits ont été mis en vente pour vous gégé";
        String affiche = client.notifierClient(client);
        if(!(res.equalsIgnoreCase(affiche))) {
            fail("non");
        }

    }
}