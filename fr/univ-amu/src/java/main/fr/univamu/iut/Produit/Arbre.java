package fr.univamu.iut.Produit;

import fr.univamu.iut.Produit.Vegetal;

public abstract class Arbre extends Vegetal {

    String type;

    /**
     * @param builder : Correspond au design patern builder
     * @param type : Correspond au type d'arbre généré
     */

    public Arbre(BuilderProduits builder, String type) {
        super(builder);

    }

}