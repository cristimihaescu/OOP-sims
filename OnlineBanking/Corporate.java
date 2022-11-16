package OnlineBanking;

public class Corporate extends BankAccount {

    public Corporate(int balance, String currency) {
        super(balance, currency);
    }

    public void transfer(int amount, BankAccount to) {
    }
}
