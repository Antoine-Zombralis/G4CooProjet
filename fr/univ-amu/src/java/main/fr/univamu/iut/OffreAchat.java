package fr.univamu.iut;

public class OffreAchat {
    private Client monCréateur ;
    private Produits produitConcerné ;
    private int montant ;
    private boolean conforme = false ;

    public OffreAchat(Client monCréateur, Produits produitConcerné, int montant) {
        this.monCréateur = monCréateur;
        this.produitConcerné = produitConcerné;
        this.montant = montant;
    }

    public void conformerOffreAchat() {
        if (monCréateur.getMonComte().getSolde() > montant)
            setConforme(true);
        else
            System.out.println("Vous n'avez pas assaez d'argent pour effectuer la transaction");
    }


    public Client getMonCréateur() {
        return monCréateur;
    }

    public void setMonCréateur(Client monCréateur) {
        this.monCréateur = monCréateur;
    }

    public Produits getProduitConcerné() {
        return produitConcerné;
    }

    public void setProduitConcerné(Produits produitConcerné) {
        this.produitConcerné = produitConcerné;
    }

    public int getMontant() {
        return montant;
    }

    public void setMontant(int montant) {
        this.montant = montant;
    }

    public boolean isConforme() {
        return conforme;
    }

    public void setConforme(boolean conforme) {
        this.conforme = conforme;
    }
}
