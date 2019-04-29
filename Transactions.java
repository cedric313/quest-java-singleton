public class Transactions {

    public static void transactions() {

        Singleton singleton = Singleton.getInstance();

        singleton.withdraw(300);
        singleton.deposit(12);
        singleton.deposit(54);
        singleton.withdraw(47);
    }

    public static void balance() {
	Singleton singleton = Singleton.getInstance();
        // TODO 2 : call singleton and get total
	Bank bank = singleton.getBank();
        int total = 0;
        System.out.printf("Your balance is:%d%n", bank.getTotal());
    }
}
