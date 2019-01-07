package fr.univamu.iut;

import java.util.*;


public class GrandLivreDuMarche {
    private Set<Transaction> lesTransactions ;

    public GrandLivreDuMarche() {
    }

    public Set<Transaction> getLesTransactions() {
        return lesTransactions;
    }

    public void setLesTransactions(Set<Transaction> lesTransactions) {
        this.lesTransactions = lesTransactions;
    }

    public void ajouterTransaction(Transaction transaction) {
        lesTransactions.add(transaction) ;
    }
}