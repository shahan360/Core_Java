public class Divide2 { // Divide two numbers
    public static void main(String[] args) { // Main method
        try{ // Try block
            int a = Integer.parseInt(args[0]); // Convert string to integer
            int b = Integer.parseInt(args[1]); // Convert string to integer
            int c = a / b; // Divide two numbers
            System.out.println("Result: " + c); // Print result
        }
        catch(ArithmeticException | ArrayIndexOutOfBoundsException | NumberFormatException e) // catch multiple exceptions
        {
            System.out.println(e.toString()); // Print exception
        }
    }
}
