/* In the below program it is demonstrated that how to use this keyword to access the instance variables. 
   In the below program, we have a class Swapper with two instance variables a and b. 
   We have a constructor with two arguments that assigns the values of local variables to instance variables. 
   We have a method swap that swaps the values of a and b. 
   We have a method show that displays the values of a and b. 
   In the main method, we are creating an object s using constructor with two arguments and then calling the show method to display the values of a and b. 
   Then we are calling the swap method to swap the values of a and b and then calling the show method to display the values of a and b. 
*/

class Swapper
{
    int a,b; // Instance variable declared
    public Swapper(int a, int b) // Constructor with two arguments that assigns the values of local variables to instance variables
    {
        this.a = a; // Assigning value of local variable to instance variable
        this.b = b; // Assigning value of local variable to instance variable
    }
    // Method to swap the values of a and b
    public void swap() // Method to swap the values of a and b
    {
        int temp; // Local variable declared as temp which is used to swap the values
        temp = this.a; // Assigning value of a to temp
        this.a = this.b; // Assigning value of b to a
        this.b = temp; // Assigning value of temp to b
    }

    public void show() // Method to display values
    {
        System.out.println("Value of a: " + this.a); // Accessing instance variable a using this keyword
        System.out.println("Value of b: " + this.b); // Accessing instance variable b using this keyword
    }
}

public class ThisDemo3 {
    public static void main(String[] args) {
        Swapper s = new Swapper(10, 20); // Object s is created using constructor with two arguments and values are assigned to a and b
        //conventional approach
        s.show(); // Value of a: 10
                  // Value of b: 20
        System.out.println("After swapping values");          
        s.swap(); // Values of a and b are swapped
        s.show(); // Value of a: 20
                  // Value of b: 10          
    }
}
