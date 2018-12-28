package fr.univamu.iut;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;
public class PropositionProduitFermier extends ProduitCommercialisable {

    public PropositionProduitFermier(BuilderProduit builder) {
        super(builder);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PropositionProduitFermier that = (PropositionProduitFermier) o;
        return isBio() == that.isBio() &&
                isConforme() == that.isConforme() &&
                getQuantite() == that.getQuantite() &&
                getPrix() == that.getPrix() &&
                Objects.equals(getProprietaire(), that.getProprietaire()) &&
                Objects.equals(getId(), that.getId()) &&
                Objects.equals(getDatePeremption(), that.getDatePeremption());
    }
    @Override
    public int hashCode() {
        return Objects.hash(getProprietaire(), getId(), isBio(), isConforme(), getQuantite(), getPrix(), getDatePeremption());
    }


}