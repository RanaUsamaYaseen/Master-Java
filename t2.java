abstract class BankAccount {
    protected double balance;

    public BankAccount(double initialBalance) {
        balance = initialBalance;
    }

    public abstract void deposit(double amount);

    public abstract void withdraw(double amount);
}

class SavingsAccount extends BankAccount {
    public SavingsAccount(double initialBalance) {
        super(initialBalance);
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
    }

    @Override
    public void withdraw(double amount) {
        if (balance - amount >= 0) {
            balance -= amount;
        } else {
            System.out.println("Insufficient funds");
        }
    }
}

class CurrentAccount extends BankAccount {
    public CurrentAccount(double initialBalance) {
        super(initialBalance);
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
    }

    @Override
    public void withdraw(double amount) {
        if (balance - amount >= 0) {
            balance -= amount;
        } else {
            System.out.println("Insufficient funds");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        SavingsAccount savingsAccount = new SavingsAccount(5000);
        savingsAccount.deposit(2000);
        savingsAccount.withdraw(1000);
        System.out.println("Current balance in savings account: " + savingsAccount.balance);

        CurrentAccount currentAccount = new CurrentAccount(10000);
        currentAccount.deposit(5000);
        currentAccount.withdraw(15000);
        System.out.println("Current balance in current account: " + currentAccount.balance);
    }
}
