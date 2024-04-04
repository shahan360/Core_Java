/*let's break down how the code works for rethrowing exceptions:

In the divide() method:

The method divides two integers x and y.
It's wrapped inside a try-catch block to catch any potential ArithmeticException, which might occur if y is equal to zero (resulting in division by zero).
If an ArithmeticException occurs, the catch block is executed.
Within the catch block:
It prints a message indicating that an exception is caught in the divide method.
Then, it rethrows the caught exception using throw(e). This means that the caught exception is thrown up the call stack, which effectively means that it's passed back to the calling method (main() method in this case).
In the main() method:

The main() method is the entry point of the program.
It's also wrapped inside a try-catch block to catch any exceptions that occur during execution.
It parses two command-line arguments into integers a and b.
It calls the divide() method with a and b.
If an exception occurs during the division in the divide() method, it's caught here.
The caught exception object is stored in variable e.
It prints a message indicating that an exception is caught in the main method.
It prints the exception object e, which typically prints out the exception's type and message.
So, in summary, if an ArithmeticException occurs during the division operation in the divide() method, it's caught, and then rethrown. This rethrown exception propagates up to the main() method, where it's caught again and handled. This approach allows for centralized handling of exceptions in the main() method while allowing more specific handling in methods where exceptions occur. */

public class Divide3 { // Divide two numbers
    public static int divide(int x, int y) // Divide two numbers
    {
        try{ // Try block
            return x/y; // Divide two numbers
        }catch(ArithmeticException e) // catch ArithmeticException
        {
            System.out.println("exception caught in divide method to rethrow it"); // print message
            throw(e); // rethrowing the exception
            // return 0; // this will not be executed
        }
    }

    public static void main(String[] args) { // Main method
        try{ // Try block
            int a = Integer.parseInt(args[0]); // Convert string to integer
            int b = Integer.parseInt(args[1]); // Convert string to integer
            int c = divide(a, b); // Divide two numbers
            System.out.println("Result: " + c); // Print result
        }catch(Exception e) // catch any exception
        {
            System.out.println("Exception caught in main method"); // print message
            System.out.println(e); // Print exception
        }
    }
}
