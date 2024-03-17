class Swapper
{
    int a,b; // Instance variable declared
    public Swapper(int a, int b) // Constructor with two arguments that assigns the values of local variables to instance variables
    {
        this.a = a; // Assigning value of local variable to instance variable
        this.b = b; // Assigning value of local variable to instance variable
        //return this; // This is not allowed as constructor cannot return any value
    }
    // Method to swap the values of a and b
    public Swapper swap() // Method to swap the values of a and b
    {
        int temp; // Local variable declared as temp which is used to swap the values
        temp = this.a; // Assigning value of a to temp
        this.a = this.b; // Assigning value of b to a
        this.b = temp; // Assigning value of temp to b
        return this; // Returning the object of Swapper class
    }
    // Method to display values
    public Swapper show() // Method to display values
    {
        System.out.println("Value of a: " + this.a); // Accessing instance variable a using this keyword
        System.out.println("Value of b: " + this.b); // Accessing instance variable b using this keyword
        return this; // Returning the object of Swapper class
    }
}

public class ThisDemo32 {
    public static void main(String[] args) {
        Swapper s = new Swapper(10,20); // Object s is created using constructor with two arguments and values are assigned to a and b
        //chaining approach in which we can call the methods in a single line
        System.out.println("We are now swapping the values using chaining approach");
        s.show().swap().show();
        //There is another approach in we can do constructor call and method chaining in a single line together.
        //This is called as method chaining with constructor call
        System.out.println("We are now swapping the values using chaining approach with constructor call");
        new Swapper(10,20).show().swap().show();
    }
}
