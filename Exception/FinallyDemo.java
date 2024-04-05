/* In the below program, it is demonstrated how to handle an exception using the try-catch-finally block.
In the below program, we are taking two command-line arguments and dividing the first argument by the second argument.
If an exception occurs, the catch block will handle the exception and print the exception message.*/

public class FinallyDemo { //Unchecked Exception
    public static void main(String[] args) { //throws keyword is not used here
        try{ //try block is used to enclose the code that may throw an exception
            int a = Integer.parseInt(args[0]); //NumberFormatException is an unchecked exception
            int b = Integer.parseInt(args[1]); //NumberFormatException is an unchecked exception
            int c = a/b; //ArithmeticException is an unchecked exception
            System.out.println("Result: " + c); //This statement will not be executed if an exception occurs
        }catch(Exception e) //catch block is used to handle the exception
        {
            System.out.println("Exception: " + e); //This statement will be executed if an exception occurs
        }
        finally //finally block is always executed whether an exception occurs or not
        {
            System.out.println("Finally block is always executed"); //This statement will always be executed
        }
    }
}
