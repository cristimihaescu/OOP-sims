import java.util.UUID;

public class Transaction {
    private UUID id = UUID.randomUUID();
    private BankAccount from;
    private BankAccount to;
    private int amount;

    public Transaction(BankAccount from, BankAccount to, int amount) {
        this.from = from;
        this.to = to;
        this.amount = amount;
    }

    public UUID getTransactionId() {
        return this.id;
    }

    public BankAccount getFrom() {
        return this.from;
    }

    public BankAccount getTo() {
        return this.to;
    }

    public int getAmount() {
        return this.amount;
    }
}
