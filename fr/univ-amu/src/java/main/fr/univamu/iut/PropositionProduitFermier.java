package fr.univamu.iut;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;
public class PropositionProduitFermier extends Produits {

    public PropositionProduitFermier(BuilderProduit builder) {
        super(builder);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PropositionProduitFermier that = (PropositionProduitFermier) o;
        return bio == that.bio &&
                conforme == that.conforme &&
                quantite == that.quantite &&
                prix == that.prix &&
                Objects.equals(proprietaire, that.proprietaire) &&
                Objects.equals(id, that.id) &&
                Objects.equals(datePeremption, that.datePeremption);
    }
    @Override
    public int hashCode() {
        return Objects.hash(proprietaire, id, bio, conforme, quantite, prix, datePeremption);
    }


}