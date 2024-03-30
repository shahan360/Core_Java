/* In this program, we have demonstrated runtime polymorphism using abstract class and abstract methods. 
We have created an abstract class Account with instance variables name and balance, and abstract method 
getRate(). The Account class has final methods display() and deposit() to display the account details 
and deposit amount to the account. The Account class also has a static method creditInterest() to 
credit interest to the account. The SavingsAccount, FixedDepositAccount, and CurrentAccount classes 
extend the Account class and provide implementation for the getRate() method to return the interest rate 
for each account type. In the main method, we have created objects of SavingsAccount, FixedDepositAccount, 
and CurrentAccount classes and displayed the account details. We have also credited interest to the accounts 
using the creditInterest() method and displayed the account details after crediting interest. */

abstract class Account //Account class is made abstract to prevent it from being instantiated and to enforce the subclasses to provide implementation for the getRate() method
{
    String name; //name of the account holder
    double balance; //balance in the account
    public Account(String name, double balance) //constructor to initialize the name and balance
    {
        this.name = name; //this keyword is used to refer to the instance variable of the class
        this.balance = balance; //this keyword is used to refer to the instance variable of the class
    }

    public final void display() //final keyword is used to prevent the subclasses from overriding the display() method of Account superclass
    {
        System.out.println("Name:"+this.name); //this keyword is used to refer to the instance variable of the class
        System.out.println("Balance:"+this.balance); //this keyword is used to refer to the instance variable of the class
        System.out.println("Account Type:"+this.getClass().getName()); //getClass().getName() method is used to get the name of the class
        System.out.println("Interest Rate:"+this.getRate()); //getRate() method is called to get the interest rate
    }

    public final void deposit(double amount) //final keyword is used to prevent the subclasses from overriding the deposit() method of Account superclass
    {
        balance = balance + amount; //amount is added to the balance
    }

    public abstract double getRate(); //abstract method to get the interest rate, the subclasses should provide implementation for this method

    public static void creditInterest(Account ref) //static method to credit interest to the account
    {
        double interest = ref.getRate(); //getRate() method is called to get the interest rate
        interest = ((ref.balance)*(interest/4))/100; //interest is calculated
        ref.deposit(interest); //interest is deposited to the account
    }
}

class SavingsAccount extends Account //SavingsAccount class extends Account class
{
    public SavingsAccount(String name, double balance) //constructor to initialize the name and balance
    {
        super(name, balance); //super keyword is used to call the constructor of the superclass to set the name and balance of the account
    }

    public double getRate() //getRate() method is implemented to return the interest rate
    {
        return 4.0; //interest rate for savings account is 4%
    }
}

class FixedDepositAccount extends Account //FixedDepositAccount class extends Account class
{
    public FixedDepositAccount(String name, double balance) //constructor to initialize the name and balance
    {
        super(name, balance); //super keyword is used to call the constructor of the superclass to set the name and balance of the account
    }

    public double getRate() //getRate() method is implemented to return the interest rate
    {
        return 8.0; //interest rate for fixed deposit account is 8%
    }
}

class CurrentAccount extends Account //CurrentAccount class extends Account class
{
    public CurrentAccount(String name, double balance) //constructor to initialize the name and balance
    {
        super(name, balance); //super keyword is used to call the constructor of the superclass to set the name and balance of the account
    }

    public double getRate() //getRate() method is implemented to return the interest rate
    {
        return 2.0; //interest rate for current account is 2%
    }
}


public class RTPMDemo2 { //RTPMDemo2 class to demonstrate the runtime polymorphism
    public static void main(String[] args) { //main method
        System.out.println("Creating some accounts objects"); //displaying the message
        SavingsAccount sa = new SavingsAccount("John", 1000); //creating an object of SavingsAccount class
        FixedDepositAccount fa = new FixedDepositAccount("Jane", 2000); //creating an object of FixedDepositAccount class
        CurrentAccount ca = new CurrentAccount("Jim", 3000); //creating an object of CurrentAccount class
        System.out.println("Displaying the account details"); //displaying the message
        sa.display(); //displaying the account details for savings account
        fa.display(); //displaying the account details for fixed deposit account
        ca.display(); //displaying the account details for current account
        System.out.println("Crediting interest to the accounts"); //displaying the message
        Account.creditInterest(sa); //crediting interest to the savings account
        Account.creditInterest(fa); //crediting interest to the fixed deposit account
        Account.creditInterest(ca); //crediting interest to the current account
        System.out.println("Displaying the account details after crediting interest"); //displaying the message
        sa.display(); //displaying the account details for savings account
        fa.display(); //displaying the account details for fixed deposit account
        ca.display(); //displaying the account details for current account
    }
}
