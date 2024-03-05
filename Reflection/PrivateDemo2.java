import java.lang.reflect.*; //reflection package is imported for using reflection classes and methods

class Test // Test class is created
{
    private void display(int x) // private method display() is created
    {
        System.out.println("In display and it is invoked using reflection as: "+x); // print the message and value of x
    }
}

public class PrivateDemo2 { // implicitReflectionDemo class is loaded when we run the program
    public static void main(String[] args) { // main method is executed when we run the program
        try{ // try block is used to handle the exception
            Class c = Class.forName(args[0]); // forName() method is used to load the class dynamically
            Object o = c.getDeclaredConstructor().newInstance(); // newInstance() method is used to create the object of the class
            Method m = c.getDeclaredMethod("display", new Class[]{int.class}); // getDeclaredMethod() method is used to get the method of the class
            m.setAccessible(true); // setAccessible() method is used to access the private method
            m.invoke(o, 100); // invoke() method is used to invoke the method
        }catch(Exception e){ // catch block is used to catch the exception
            System.out.println(e); // print the exception
        }
    }
}

/* The above program is an example of reflection where we are accessing the private method of the class using reflection.
    In the above program, we have created a class Test and a private method display() in it. We have created another class
    PrivateDemo2 in which we are using reflection to access the private method of the class Test. We are using the following
    methods of the Method class to access the private method:
    1. getDeclaredMethod() method: It is used to get the method of the class.
    2. set Accessible() method: It is used to access the private method.
    */