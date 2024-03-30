// Inner class accessing private instance variable of outer class using method
// In the below program, we are demonstrating the use of non-static inner class.
// In this program, we have an outer class named Outer and an inner class named Inner.
// We have a private instance variable a in the outer class. We have a constructor in the outer class to initialize the instance variable a.
// We have a method show in the outer class to display the value of a. We have a method getA in the outer class to get the value of a.
// We have a constructor in the inner class to initialize the instance variable b. We have a method display in the inner class to display the values of a and b.


class Outer //outer class
{
    private int a; //private instance variable
    public Outer(int x) //constructor of outer class
    {
        a = x; //initializing instance variable a and setting it to x
    }

    public void show() //method to display value of a
    {
        System.out.println("a from Outer: " + a); //printing value of a
    }

    public int getA()//3 //method to get value of a. Note that we have marked it as 3 to show the order of execution
    {
        return a; //returning value of a 
    }

    //Inner class starts
    class Inner //inner class
    {
        int b; //instance variable of inner class
        Outer ref;//1 //reference of outer class. Note that we have marked it as 1 to show the order of execution
        public Inner(int b) //constructor of inner class
        {
            this.b = b; //initializing instance variable b
            ref = Outer.this;//2 //initializing reference of outer class. Note that we have marked it as 2 to show the order of execution
        }

        public void display() //method to display values of a and b
        {
            System.out.println("a from inner class: " + ref.getA()); //4 //getting value of a from outer class using getA method. Note that we have marked it as 4 to show the order of execution
            System.out.println("b: " + b); //printing value of b
        }
    }//Inner class ends
}

public class InnerDemo4 { //main class
    public static void main(String[] args) { //main method
        Outer x  = new Outer(10); //creating object of outer class
        x.show(); //calling show method of outer class
        Outer.Inner y = x.new Inner(20); //creating object of inner class using outer class
        y.display(); //calling display method of inner class
    }
}
