public class Divide1 { // Divide two numbers
    public static void main(String[] args) { // Main method
        try {
            int a = Integer.parseInt(args[0]); // Convert string to integer
            int b = Integer.parseInt(args[1]); // Convert string to integer
            int c = a / b; // Divide two numbers
            System.out.println("Result: " + c); // Print result
        } catch (NumberFormatException e) { // Catch number format exception
            System.out.println("Only numbers are allowed"); // Print message
        } catch (ArrayIndexOutOfBoundsException e) { // Catch array index out of bounds exception
            System.out.println("Two numbers are required"); // Print message
        } catch (ArithmeticException e) { // Catch arithmetic exception
            System.out.println("Division by zero is not allowed"); // Print message
        } catch (Exception e) { // Catch all other exceptions
            System.out.println(e.toString()); // Print exception
        }
    }
}
