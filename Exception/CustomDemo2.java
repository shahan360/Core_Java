/* In the below program, we have created a custom exception class named MyException that extends the Exception class. 
 * We have created two constructors in the MyException class. 
 * The first constructor is a default constructor that initializes the instance variable msg with a default message. 
 * The second constructor is a parameterized constructor that initializes the instance variable msg with the message passed as an argument. 
 * We have overridden the toString() method to return the message stored in the instance variable msg. 
 * In the main() method, we have thrown a custom exception using the throw keyword. 
 * We have thrown the custom exception using both the default constructor and the parameterized constructor. 
 * We have used the try-catch block to handle the exception. 
 * If an exception occurs, the catch block will catch the exception and print the message using the toString() method. 
 * If an exception does not occur, the statements inside the try block will be executed.
 */

class MyException extends Exception //Checked Exception
{
    String msg; //Instance variable
    public MyException() //Default Constructor
    {
        super(); //Calling the super class constructor
    }
    public MyException(String m) //Parameterized Constructor
    {
        super(m); //Calling the super class constructor
    }
}

public class CustomDemo2 { //Checked Exception
    public static void main(String[] args) { //throws keyword is not used here
        try{
            System.out.println("Throwing custom exception"); //This statement will be executed
            //throw(new MyException()); //Throwing custom exception using default constructor
			throw(new MyException("my arg const invoked")); //Throwing custom exception using parameterized constructor
        }catch(Exception e) //catch block is used to handle the exception
        {
            System.out.println(e.toString()); //This statement will be executed if an exception occurs
        }
    }
}
