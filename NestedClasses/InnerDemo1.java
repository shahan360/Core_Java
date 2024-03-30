/* In the below program we have a static inner class (nested class) that can access private members of the outer class. 
 * We have a private static member and a private static method in the outer class. 
 * The inner class has a non-static member and a method that can access the private static member of the outer class. 
 * We have created an object of the inner class using the outer class and accessed the method of the inner class using the object of the inner class.
 */

class Outer // Outer class
{
    private static int a = 10; // Private static member of Outer class
    public static void show() // Private static method of Outer class
    {
        System.out.println("a from Outer: " + a); // Accessing private static member of Outer class
    }

    // Static Inner Class (Nested Class) that can access private members of Outer class
    static class Inner // Static Inner Class
    {
        int b; // Non-static member of Inner class
        public Inner(int b) // Constructor of Inner class
        {
            this.b = b; // Assigning value of b to this.b
        }
        
        public void display() // Method of Inner class
        {
            System.out.println("a from Inner: " + a); // Accessing private static member of Outer class
            System.out.println("b from Inner: " + b); // Accessing non-static member of Inner class
        }
    }
}

public class InnerDemo1 {
    public static void main(String[] args) {
        Outer.show(); // Accessing private static method of Outer class
        Outer.Inner obj = new Outer.Inner(20); // Creating object of Inner class using Outer class
        obj.display(); // Accessing method of Inner class using object of Inner class
    }
}
