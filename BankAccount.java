import java.util.UUID;

public abstract class BankAccount {
    private UUID id = UUID.randomUUID();
    private int balance;
    private String currency;
    private Client client;

    public BankAccount(int balance, String currency) {
        this.balance = balance;
        this.currency = currency;
        this.client = client;
    }

    public UUID getId() {
        return this.id;
    }

    public int getBalance() {
        return this.balance;
    }

    public String getCurrency() {
        return this.currency;
    }
public abstract void transfer(int var1, BankAccount var2);
}
