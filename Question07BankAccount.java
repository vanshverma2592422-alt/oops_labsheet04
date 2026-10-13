package labsheet04;

class BankAccount {
    private double balance;

    public BankAccount(double openingBalance) {
        if (openingBalance >= 0) {
            balance = openingBalance;
        }
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit successful.");
        } else {
            System.out.println("Deposit must be greater than zero.");
        }
    }

    public void displayBalance() {
        System.out.println("Balance: " + balance);
    }
}

public class Question07BankAccount {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(500.00);
        account.deposit(150.00);
        account.deposit(-20.00);
        account.displayBalance();
    }
}