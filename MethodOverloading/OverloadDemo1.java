/* The below program demonstrates one more aspect of method overloading.
In this program, we have created two methods with the same name show() but with different parameters.
The show() method is used to display the message "Object version" when called with an object as an argument and
the show() method is used to display the message "String version" when called with a string as an argument.
When we call the show() method with a null argument, the compiler will not be able to decide which method to call since both methods are equally applicable.
So, first we comment one of the show() methods and then call the show() method with a null argument. 
1. If we comment the show(String s) method and call the show() method with a null argument, the show(Object o) method will be called and the message "Object version" will be displayed.
2. If we comment the show(Object o) method and call the show() method with a null argument, the show(String s) method will be called and the message "String version" will be displayed. 
*/

import java.util.*; // Import the java.util package to use the Scanner class

class Shape //Created a class called Shape
{
    public void show(Object o) //Created a method called show() which takes an object as an argument
    {
        System.out.println("Object version"); //Prints the message "Object version" to the console
    }

    // public void show(String s) //Created a method called show() which takes a string as an argument
    // {
    //     System.out.println("String version"); //Prints the message "String version" to the console
    // }
}

public class OverloadDemo1 { //Created a class called OverloadDemo1
    public static void main(String[] args) { //The main() method starts the execution of the program
        Shape s = new Shape(); //Created an object of the Shape class
        s.show(null); //Calls the show() method with a null argument which is an object
    }
}
