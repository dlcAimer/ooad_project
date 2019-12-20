package transaction;

public abstract class Transaction {
    abstract public void commit(TransactionList list);
}
