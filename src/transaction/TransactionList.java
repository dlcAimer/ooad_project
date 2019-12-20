package transaction;

import java.util.ArrayList;

public class TransactionList {
    private ArrayList<Transaction> transactions = new ArrayList<>();


    public ArrayList<Transaction> getTransactions() {
        return transactions;
    }

    public void setTransactions(ArrayList<Transaction> transactions) {
        this.transactions = transactions;
    }
}
