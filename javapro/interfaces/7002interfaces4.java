// A class to represent a bank
class Bank {
  // A list of accounts in the bank
  private java.util.List<Account> accounts;

  // A constructor to initialize the list
  public Bank() {
    accounts = new java.util.ArrayList<Account>();
  }

  // A method to add an account to the bank
  public void addAccount(Account account) {
    accounts.add(account);
  }

  // A method to display the details of all accounts
  public void displayAccounts() {
    for (Account account : accounts) {
      System.out.println(account);
    }
  }
}

// An interface to represent an account
interface Account {
  // A method to deposit money into the account
  public void deposit(double amount);

  // A method to withdraw money from the account
  public void withdraw(double amount);

  // A method to calculate the interest on the account
  public double calculateInterest();

  // A method to view the balance of the account
  public double getBalance();

  // A method to display the details of the account
  public String toString();
}

// A class to represent a savings account
class SavingsAccount implements Account {
  // A constant to store the interest rate
  private static final double INTEREST_RATE = 0.05;

  // A variable to store the account number
  private int accountNumber;

  // A variable to store the balance of the account
  private double balance;

  // A constructor to initialize the account number and balance
  public SavingsAccount(int accountNumber, double balance) {
    this.accountNumber = accountNumber;
    this.balance = balance;
  }

  // A method to deposit money into the account
  public void deposit(double amount) {
    balance += amount;
  }

  // A method to withdraw money from the account
  public void withdraw(double amount) {
    if (balance >= amount) {
      balance -= amount;
    } else {
      System.out.println("Insufficient funds");
    }
  }

  // A method to calculate the interest on the account
  public double calculateInterest() {
    return balance * INTEREST_RATE;
  }

  // A method to view the balance of the account
  public double getBalance() {
    return balance;
  }

  // A method to display the details of the account
  public String toString() {
    return "SavingsAccount[accountNumber=" + accountNumber + ", balance=" + balance + "]";
  }
}

// A class to represent a current account
class CurrentAccount implements Account {
  // A constant to store the overdraft limit
  private static final double OVERDRAFT_LIMIT = 1000;

  // A variable to store the account number
  private int accountNumber;

  // A variable to store the balance of the account
  private double balance;

  // A constructor to initialize the account number and balance
  public CurrentAccount(int accountNumber, double balance) {
    this.accountNumber = accountNumber;
    this.balance = balance;
  }

  // A method to deposit money into the account
  public void deposit(double amount) {
    balance += amount;
  }

  // A method to withdraw money from the account
  public void withdraw(double amount) {
    if (balance + OVERDRAFT_LIMIT >= amount) {
      balance -= amount;
    } else {
      System.out.println("Overdraft limit exceeded");
    }
  }

  // A method to calculate the interest on the account
  public double calculateInterest() {
    return 0; // No interest for current account
  }

  // A method to view the balance of the account
  public double getBalance() {
    return balance;
  }

  // A method to display the details of the account
  public String toString() {
    return "CurrentAccount[accountNumber=" + accountNumber + ", balance=" + balance + "]";
  }
}

// A class to test the program
class Test {
  public static void main(String[] args) {
    // Create a bank object
    Bank bank = new Bank();

    // Create some account objects
    Account a1 = new SavingsAccount(101, 5000);
    Account a2 = new CurrentAccount(102, 3000);
    Account a3 = new SavingsAccount(103, 7000);
    Account a4 = new CurrentAccount(104, 4000);

    // Add the accounts to the bank
    bank.addAccount(a1);
    bank.addAccount(a2);
    bank.addAccount(a3);
    bank.addAccount(a4);

    // Display the details of all accounts
    bank.displayAccounts();

    // Deposit some money into a1
    a1.deposit(1000);

    // Withdraw some money from a2
    a2.withdraw(2000);

    // Calculate the interest for a3
    System.out.println("Interest for a3: " + a3.calculateInterest());

    // Display the balance of a4
    System.out.println("Balance of a4: " + a4.getBalance());

    // Display the details of all accounts again
    bank.displayAccounts();
  }
}
