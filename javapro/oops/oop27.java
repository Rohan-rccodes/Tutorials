import java.util.Scanner;

class bankaccount {
    private String accountNumber;
    private double balance;

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public static void main(String[] a) {
        Scanner s = new Scanner(System.in);

        bankaccount myAccount = new bankaccount();

        System.out.print("Enter your account number: ");
        String accountNumber = s.nextLine();
        myAccount.setAccountNumber(accountNumber);

        System.out.print("Enter your initial balance: ");
        double initialBalance = s.nextDouble();
        myAccount.setBalance(initialBalance);

        System.out.println("Account Information:");
        System.out.println("Account Number: " + myAccount.getAccountNumber());
        System.out.println("Balance: Rs " + myAccount.getBalance());
    }
}


