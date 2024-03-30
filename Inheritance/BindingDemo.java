class B extends A1 //class B is the child class or sub class of class A1 which is defined in the file A1.java
{
    public void show() //defined show() method to display a message
    {
        System.out.println("from B"); //the message displays that the show method is called from class B
    }
}

public class BindingDemo { //main class
    public static void main(String[] args) { //main method
        A1 x = new A1(); //creating an object of class A1
        B y = new B(); //creating an object of class B
        A1.invoke(x); //calling the static method invoke() of class A1 by passing the object of class A1 as a reference
        A1.invoke(y); //calling the static method invoke() of class A1 by passing the object of class B as a reference
    }
}
