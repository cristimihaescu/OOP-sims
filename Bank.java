import java.util.List;

public class Bank {
    private List<Transaction> personalTransactions;
    private List<Transaction> transactions;

    public Bank() {
    }

    public void addTransaction(Transaction transaction) {
    }

    public void transfer(int amount, BankAccount from, BankAccount to) {
    }

    public void printPersonalTransactions(BankAccount bankAccount) {
        System.out.println(bankAccount);
    }
}
