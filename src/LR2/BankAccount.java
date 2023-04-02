package LR2;

public class BankAccount {
    private double balance;

    public BankAccount() {
    }

    public void setBalance(double balance) {
        this.balance = 0;
    }

    public void GetBalance() {
        System.out.println(balance);
    }

    public void Transaction() {
    }

    public static BankAccount CreateBank() {
        return new BankAccount();

    }
}
