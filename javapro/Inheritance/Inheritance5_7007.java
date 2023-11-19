/*Write a Java program to create a class known as "BankAccount" with methods called deposit() and withdraw(). Create a subclass called SavingsAccount that
overrides the withdraw() method to prevent withdrawals if the account balance falls below one hundred.*/

class BankAccount 
{
float bal=0;

BankAccount(){}
BankAccount(float b)
{
bal=b;
}

void deposit(int b)
{

bal=bal+b;
System.out.println("Amount " +b+ " Successfully deposited\nCurrent balance = " +bal+ "\n");
}

void withdraw(int b)
{
if (b>0 && b<=bal)
{
System.out.println("Collect your amount = " +b);
bal=bal-b;
System.out.println("Current balance = " +bal+ "\n");
}
else
{
System.out.println("Insufficient balance");
}
}
}


class SavingsAccount extends BankAccount
{


SavingsAccount(float b)
{
bal=b;
}

void withdraw(int b)
{
if(bal<100 && bal<b)
{
System.out.println("Insufficient balence");
} 
else
{
System.out.println("Collect your amount = " +b);
bal=bal-b;
System.out.println("Current balance = " +bal+ "\n");
}
}


public static void main(String args[])
{

BankAccount obj1=new BankAccount(200);

obj1.deposit(100);

obj1.withdraw(300);


SavingsAccount obj2=new SavingsAccount(10);
obj2.withdraw(100);


}


}