package class15Encapsulation;

public class MyAccount {
    private double balance;

    public double getBalance() {
        //validate
        return balance;
    }

    public void setBalance(double amount) {
        //validate
        this.balance += amount;
    }
}
