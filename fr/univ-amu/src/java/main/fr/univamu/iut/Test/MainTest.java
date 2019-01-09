package fr.univamu.iut.Test;

import fr.univamu.iut.Controleur;
import fr.univamu.iut.Produit.Arbre.Arbre;
import fr.univamu.iut.Produit.Produits;
import fr.univamu.iut.Produit.Produits.BuilderProduits;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import static org.junit.Assert.*;

import static org.junit.jupiter.api.Assertions.fail;

public class MainTest {

    @Test
    public void generationArbreAleatoire() {
        List<Arbre> arbres = generationArbreAleatoire(200);
    }
}
