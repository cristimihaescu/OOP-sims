public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank();
        Corporate corporate = new Corporate(500, "EUR");
        Corporate corporate2 = new Corporate(1500, "EUR");
        Consumer consumer = new Consumer(800, "USD");
        Consumer consumer2 = new Consumer(1000, "USD");
        bank.transfer(150, consumer, consumer2);
        bank.transfer(300, consumer2, consumer);
        bank.transfer(200, corporate2, corporate);
        bank.transfer(50, corporate, corporate2);
        bank.printPersonalTransactions(consumer2);
        bank.printPersonalTransactions(corporate2);
    }
}