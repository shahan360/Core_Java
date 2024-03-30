/* In below programs we are going to see how to use default methods in interface in java 8.
 * In java 8, we can define default methods in interface which can be implemented in the implementing class.
 * We can also override the default method in the implementing class.
 * We can also use lambda expression to implement the default
 * method of interface. */

interface A // Interface A with default method show which is implemented in AImpl class
{
    void show(); // abstract method show in interface A which is implemented in AImpl class that is why it is not abstract
}

// class AImpl implements A // AImpl class implements interface A as it is mandatory to implement all the methods of interface A
// {
//     public void show() // show method is implemented in AImpl class as implementing class needs to implement all the methods of the implemented interface
//     {
//         System.out.println("show from AImpl invoked"); // show method implementation in AImpl class, note that it is not abstract.
//     }
// }

public class DefaultDemo { // Main class
    public static void main(String[] args) { // Main method
        // AImpl ref = new AImpl(); // Creating object of AImpl class as ref which is of type AImpl class
        // ref.show(); // Invoking show method using ref object of AImpl class
        A ref=() -> System.out.println("from show method of AImpl class"); // Creating object of A interface using lambda expression
        ref.show(); // Invoking show method using ref object of A interface
    }
}
