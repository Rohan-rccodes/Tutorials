import java.util.ArrayList;
import java.util.List;

class Bank {
    private List<Account> accounts;

    public Bank() {
        accounts = new ArrayList<>();
    }

    public void addAccount(Account account) {
        accounts.add(account);
    }

    public void removeAccount(Account account) {
        accounts.remove(account);
    }

    public void depositMoney(Account account, double amount) {
        account.deposit(amount);
    }

    public void withdrawMoney(Account account, double amount) {
        account.withdraw(amount);
    }
}

class Account {
    private String customerName;
    private double balance;

    public Account(String customerName) {
        this.customerName = customerName;
        balance = 0.0;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
        } else {
            System.out.println("Insufficient balance");
        }
    }

    public double getBalance() {
        return balance;
    }
}

class Main {
    public static void main(String[] args) {
        Bank bank = new Bank();

        Account account1 = new Account("John Doe");
        Account account2 = new Account("Jane Smith");

        bank.addAccount(account1);
        bank.addAccount(account2);

        bank.depositMoney(account1, 1000.0);
        bank.depositMoney(account2, 500.0);

        bank.withdrawMoney(account1, 200.0);
        bank.withdrawMoney(account2, 100.0);

        System.out.println("Account 1 balance: " + account1.getBalance());
        System.out.println("Account 2 balance: " + account2.getBalance());
    }
}
