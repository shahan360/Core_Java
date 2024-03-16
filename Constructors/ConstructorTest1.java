/* This program demonstrates that in case of no constructor, the compiler provides a default constructor. 
 * In the below program, we are demonstrating the use of constructor and method with same name as class name. 
 * We have defined a class ConstructorTest1 which automatically creates a default constructor with the name same as class name as ConstructorTest1().
 * So in line 10, we are creating an object of class ConstructorTest1 and calling the default constructor to print the value of instance variable a.
 */

public class ConstructorTest1 { //Defining a class with name ConstructorTest
    int a = 10; //Instance variable a with value 10
    public static void main(String[] args) { //Main method starts
        System.out.println("a"); //Prints string a
        System.out.println(new ConstructorTest1().a); //Prints the value of instance variable a
    }
}
