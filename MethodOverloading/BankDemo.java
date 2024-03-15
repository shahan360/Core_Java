import java.util.*; // Import the java.util package to use the Scanner class

class Bank // Create a class called Bank
{
    private int accno; // Declare a private integer variable accno to store the account number
    private String name; // Declare a private string variable name to store the name of the account holder
    private int balance; // Declare a private integer variable balance to store the balance in the account
    Scanner sc = new Scanner(System.in); // Create an object of the Scanner class to take input(Account holder's details) from the user
    //Creating a setter method to set the account details
    public void readData() // Create a method called readData() to read the account holder's details
    {
        System.out.println("Enter the account number: "); // Prompt the user to enter the account number
        accno = sc.nextInt(); // Read the account number
        System.out.println("Enter the name of the account holder: "); // Prompt the user to enter the name of the account holder
        name = sc.next(); // Read the name of the account holder
        System.out.println("Enter the balance in the account: "); // Prompt the user to enter the balance in the account
        balance = sc.nextInt(); // Read the balance in the account
    }
    //Creating a getter method to display the account details
    public void showData() // Create a method called showData() to display the account holder's details
    {
        System.out.println("Account number: " + accno); // Display the account number
        System.out.println("Name of the account holder: " + name); // Display the name of the account holder
        System.out.println("Balance in the account: " + balance); // Display the balance in the account
    }
    //Creating a method to withdraw money from the account
    public void withdraw() // Create a method called withdraw() to withdraw money from the account
    {
        int amt; // Declare an integer variable amt to store the amount to be withdrawn
        System.out.println("Enter the amount to be withdrawn: "); // Prompt the user to enter the amount to be withdrawn
        amt = sc.nextInt(); // Read the amount to be withdrawn
        if(balance-amt >= 1000) // Check if the balance in the account is greater than or equal to the amount to be withdrawn
        {
            balance = balance - amt; // If the condition is true, deduct the amount from the balance
            System.out.println("Rs. " + amt + " has been successfully withdrawn from the account."); // Display a message indicating that the amount has been successfully withdrawn
        }
        else // If the balance in the account is less than the amount to be withdrawn
        {
            System.out.println("Insufficient balance in the account."); // Display a message indicating that there is insufficient balance in the account
        }
    }
    //Creating a method to deposit money into the account
    public void deposit() // Create a method called deposit() to deposit money into the account
    {
        int amt; // Declare an integer variable amt to store the amount to be deposited
        System.out.println("Enter the amount to be deposited: "); // Prompt the user to enter the amount to be deposited
        amt = sc.nextInt(); // Read the amount to be deposited
        balance = balance + amt; // Add the amount to the balance
        System.out.println("Rs. " + amt + " has been successfully deposited into the account."); // Display a message indicating that the amount has been successfully deposited
    }
    public int getacno() // Create a method called getacno() to return the account number
    {
        return accno; // Return the account number
    }
}

public class BankDemo {
    public static void main(String[] args) {
        Bank[] b = new Bank[5]; // Create an array of Bank objects
        Scanner sc = new Scanner(System.in); // Create an object of the Scanner class to take input from the user
        int i, n, f, choice; // Declare integer variables i, n, f, and choice
        do{
            System.out.println("1. Create account\n2. Display account\n3. Withdraw\n4. Deposit\n5. Exit"); // Display the menu
            System.out.println("Enter your choice: "); // Prompt the user to enter the choice
            choice = sc.nextInt(); // Read the choice
            switch(choice) // Use a switch statement to perform the required operation based on the choice
            {
                case 1: // If the choice is 1
                    for(i=0;i<b.length;i++) // Use a for loop to create accounts
                    {
                        b[i]=new Bank(); // Create an object of the Bank class
                        b[i].readData(); // Call the readData() method to read the account holder's details
                    }
                    break; // Break the switch statement
                case 2: // If the choice is 2
                    for(i=0;i<b.length;i++) // Use a for loop to display the account holder's details
                    {
                        b[i].showData(); // Call the showData() method to display the account holder's details
                    }
                    break; // Break the switch statement
                case 3: // If the choice is 3
                    f=0; // Initialize the variable f to 0
                    System.out.println("enter acno to withdraw"); // Prompt the user to enter the account number from which money is to be withdrawn
                    n=sc.nextInt(); // Read the account number
                    for(i=0;i<b.length;i++) // Use a for loop to withdraw money from the account
                    {
                        if(n==b[i].getacno()) // Check if the account number entered by the user matches the account number in the array
                        {
                            f=1; // If the condition is true, set the variable f to 1
                            b[i].withdraw(); // Call the withdraw() method to withdraw money from the account
                            break; // Break the for loop
                        }
                    }
                    if(f==0) // If the account number entered by the user does not match any account number in the array
                        System.out.println("acno not found"); // Display a message indicating that the account number is not found
                    break; // Break the switch statement
                case 4: // If the choice is 4
                    f=0; // Initialize the variable f to 0
                    System.out.println("enter acno to deposit"); // Prompt the user to enter the account number into which money is to be deposited
                    n=sc.nextInt(); // Read the account number
                    for(i=0;i<b.length;i++) // Use a for loop to deposit money into the account
                    {
                        if(n==b[i].getacno()) // Check if the account number entered by the user matches the account number in the array
                        {
                            f=1; // If the condition is true, set the variable f to 1
                            b[i].deposit(); // Call the deposit() method to deposit money into the account
                            break; // Break the for loop
                        }
                    }
                    if(f==0) // If the account number entered by the user does not match any account number in the array
                        System.out.println("acno not found"); // Display a message indicating that the account number is not found
                    break; // Break the switch statement
                }
        }while(choice!=5); // Continue the loop until the choice is 5            
    }
}
