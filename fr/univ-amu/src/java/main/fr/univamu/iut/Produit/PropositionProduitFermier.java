package fr.univamu.iut.Produit;

import fr.univamu.iut.Produit.ProduitCommercialisable;

public class PropositionProduitFermier extends ProduitCommercialisable {

    public PropositionProduitFermier(BuilderProduits builder) {
        super(builder);
    }

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        PropositionProduitFermier that = (PropositionProduitFermier) o;
//        return isBio() == that.isBio() &&
//                isConforme() == that.isConforme() &&
//                getQuantite() == that.getQuantite() &&
//                getPrix() == that.getPrix() &&
//                Objects.equals(getProprietaire(), that.getProprietaire()) &&
//                Objects.equals(getId(), that.getId()) &&
//                Objects.equals(getDatePeremption(), that.getDatePeremption());
//    }
//    @Override
//    public int hashCode() {
//        return Objects.hash(getProprietaire(), getId(), isBio(), isConforme(), getQuantite(), getPrix(), getDatePeremption());
//    }


}