/* In this example, we are calling the main method from another class using the static block. 
 * The static block is executed before the main method. 
 * So, it will call the main method and pass the string "World" as an argument.
 */
public class MainInvoke { // Save as MainInvoke.java
    static{ // Static block to call main method and this will be executed before the main method
        main(new String[]{"World"}); // Call main method and pass the string "World" as an argument
    }
    public static void main(String[] args) { // Main method with String array as argument
        System.out.println("Hello "+args[0]); // Print the string "Hello" and the first argument
    }
}
