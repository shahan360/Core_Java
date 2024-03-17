/* In the below program, we have created a class AB with 
two instance variables a and b. We have also created a 
constructor with two parameters. We have used the this 
keyword to refer to the instance variables and set their 
values to the values of the parameters. We have also 
created a method show to display the values of the instance 
variables. In the main method, we have created an object of 
class AB and passed the values 10 and 20 to the constructor. 
We have then called the show method to display the values of 
the instance variables. */

public class AB {
    //Declaring instance variable members
    int a,b;
    //Declaring a constructor with two parameters
    public AB(int a, int b) { //Constructor
        this.a = a; //using this keyword to refer to the instance variable as this.a sets the value of the instance variable a to the value of the parameter a
        this.b = b; //using this keyword to refer to the instance variable as this.b sets the value of the instance variable b to the value of the parameter b
    }

    public void show() //Method to display the values of the instance variables
    {
        System.out.println("a = "+this.a); //using this keyword to refer to the instance variable as this.a gets the value of the instance variable a
        System.out.println("b = "+this.b); //using this keyword to refer to the instance variable as this.b gets the value of the instance variable b
    }

    public static void main(String[] args)
    {
        AB x = new AB(10,20); //Creating an object of class AB and passing the values 10 and 20 to the constructor
        x.show(); //Calling the show method to display the values of the instance variables
    }
}
