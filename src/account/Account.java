package account;

import java.util.ArrayList;

public class Account {
    private int balance;
    private ArrayList<Flow> flows = new ArrayList<>();

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
}
