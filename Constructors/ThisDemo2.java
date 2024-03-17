/* In the below program, we are demonstrating the use of this keyword to invoke one constructor from another constructor. 
   In the below program, we have three constructors. 
   1. No argument constructor
   2. Constructor with one argument
   3. Constructor with two arguments
   We are using this keyword to invoke one constructor from another constructor. 
   In the no argument constructor, we are invoking the constructor with two arguments. 
   In the constructor with one argument, we are invoking the constructor with two arguments. 
   In the constructor with two arguments, we are assigning the values of local variables to instance variables.
   In the main method the process is followed as below:
    1. Object x is created using no argument constructor.
    2. Object y is created using constructor with one argument.
    3. Object z is created using constructor with two arguments.
    4. show method is called for each object to display the values of instance variables.
*/


class AB
{
    // Instance variable declared
    int a,b;

    // No argument constructor
    public AB()
    {
        this(2,4); // Invoking parameterized constructor
        System.out.println("No argument constructor invoked");
    }

    //Constructor with one argument
    public AB(int a)
    {
        this(a,6); // Invoking parameterized constructor where one argument is constant and other is variable
        System.out.println("One argument constructor invoked");
    }
    
    //Constructor with two arguments
    public AB(int a, int b)
    {
        this.a = a; // Assigning value of local variable to instance variable
        this.b = b; // Assigning value of local variable to instance variable
        System.out.println("Two argument constructor invoked");
    }

    //Method to display values
    public void show() // Method to display values
    {
        System.out.println("Value of a: " + this.a); // Accessing instance variable using this keyword
        System.out.println("Value of b: " + this.b); // Accessing instance variable using this keyword
    }
}

public class ThisDemo2 {
    public static void main(String[] args) {
        AB x = new AB(); // No argument constructor invoked
        x.show(); // Value of a: 2
                  // Value of b: 4
        AB y = new AB(5); // One argument constructor invoked
        y.show(); // Value of a: 5
                  // Value of b: 6
        AB z = new AB(7,8); // Two argument constructor invoked
        z.show(); // Value of a: 7
                  // Value of b: 8                    
    }
}
