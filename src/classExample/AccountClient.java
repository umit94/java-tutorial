package classExample;

public class AccountClient {
    public static void main(String[] args) {
        Account account1 = new Account(3000);
        Account account2 = new Account(0);
        System.out.println("Account 1 Balance: "+account1.getBalance());
        System.out.println("Account 2 Balance: "+account2.getBalance());
        account1.sendMoney(1000,account2);
        System.out.println("Money transfer");
        System.out.println("Account 1 Balance: "+account1.getBalance());
        System.out.println("Account 2 Balance: "+account2.getBalance());
        account2.deposite(1000);
        account1.withdraw(1000);
        System.out.println("Account 1 Balance: "+account1.getBalance());
        System.out.println("Account 2 Balance: "+account2.getBalance());
    }
}
