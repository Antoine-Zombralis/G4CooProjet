package fr.univamu.iut.Test;

import static com.sun.tools.internal.ws.wsdl.parser.Util.fail;


import fr.univamu.iut.CompteBancaire;
import org.junit.jupiter.api.Test;

class CompteBancaireTest {

    @Test
    final void  crediter() {
        CompteBancaire compte = new CompteBancaire(1111, 0);
        int res = 5;
        compte.crediter(1111, 5);
        if (compte.getSolde() != res) {
            fail("Le compte n'a pas été crédité");
        }
    }

    @Test
    final void debiter() {
        CompteBancaire compte = new CompteBancaire(1111, 5);
        int res = 0;
        compte.debiter(1111, 5);
        if (compte.getSolde() != res) {
            fail("Le compte n'a pas été débité");
        }
    }
}