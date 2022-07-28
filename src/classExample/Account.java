package classExample;

public class Account {
    private double balance=0;
    public Account(double balance){
        this.balance=balance;
    }

    public void withdraw(double amount){
        if(amount>0)
        balance-=amount;
    }

    public void deposite(double amount){
        if(amount>0)
        balance+=amount;
    }

    public double getBalance() {
        return balance;
    }

    public void sendMoney(double amount, Account transferTo){
        withdraw(amount);
        transferTo.deposite(amount);
    }
}
