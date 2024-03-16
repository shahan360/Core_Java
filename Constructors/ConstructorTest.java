/* In the below program, we are demonstrating the use of constructor and method with same name as class name. 
 * We have defined a class ConstructorTest with two constructors and a method with same name as class name. 
 * We have created two objects of class Constructor and called the constructors and method using the objects.
 * This displays the concept of constructor and method with same name as class name.
 */

public class ConstructorTest { //Defining a class with name ConstructorTest
    //constructor
    public ConstructorTest() //Defining a constructor with no argument having same name as class
    {
        System.out.println("Constructor with no argument invoked"); //Prints the message that constructor with no argument invoked
    }

    public ConstructorTest(int x) //Defining a constructor with int argument having same name as class
    {
        System.out.println("Constructor with int argument invoked"); //Prints the message that constructor with int argument invoked
    }

    public void ConstructorTest() //Defining a method with same name as class but we can also define a method with a name different from class name
    {
        System.out.println("Method invoked"); //Prints the message that method invoked
    }

    public static void main(String[] args) { //Main method starts
        ConstructorTest t2 = new ConstructorTest(10); //Creating an object t2 of class ConstructorTest with call to constructor with int argument
        ConstructorTest t1 = new ConstructorTest(); //Creating an object t1 of class Constructor with call to constructor with no argument
        t1.ConstructorTest(); //Calling the method ConstructorTest using object t1 of constructor with no argument
        t2.ConstructorTest(); //Calling the method ConstructorTest using object t2 of constructor with int argument
    }
}
