package OnlineBanking;

import java.util.ArrayList;
import java.util.List;

public class Client {
    private List<BankAccount> accounts = new ArrayList();
    public Client() {
    }

    public void addNewBankAccount(BankAccount bankAccount) {
        this.accounts.add(bankAccount);
    }
}
