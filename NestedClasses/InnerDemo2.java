/* In the below program, we are demonstrating the use of static inner class. 
In this program, we have an outer class named Outer and an inner class named Inner. 
The inner class is static. We have a private static variable a in the outer class. 
We have a static method show in the outer class to display the value of a. 
We have a static method getA in the outer class to get the value of a. 
We have a constructor in the inner class to initialize the instance variable b. 
We have a method display in the inner class to display the values of a and b. 
In the main class, we are calling the static method show of the outer class. 
We are creating an object of the inner class using the outer class and calling 
the display method of the inner class. */

class Outer //outer class
{
    private static int a = 10; //private static variable
    public static void show() //static method
    {
        System.out.println("a from Outer: " + a); //printing value of a
    }

    public static int getA() //static method to get value of a
    {
        return a; //returning value of a
    }

    //inner class starts
    static class Inner //inner class
    {
        int b; //instance variable of inner class
        public Inner(int b) //constructor of inner class
        {
            this.b = b; //initializing instance variable b
        }

        public void display() //method to display values of a and b
        {
            System.out.println("a from inner class: " + Outer.getA()); //getting value of a from outer class using getA method
            System.out.println("b: " + b); //printing value of b
        }
    }//inner class ends
}

public class InnerDemo2 { //main class
    public static void main(String[] args) { //main method
        Outer.show(); //calling static method show of outer class
        Outer.Inner obj = new Outer.Inner(20); //creating object of inner class using outer class
        obj.display(); //calling display method of inner class
    }
}
