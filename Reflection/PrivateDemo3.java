import java.lang.reflect.*; //reflection package is imported for using reflection classes and methods

class Test
{
    private Test() // private constructor is created
    {
        System.out.println("Private constructor invoked."); // print the message
    }
}

public class PrivateDemo3 {
    public static void main(String[] args) {
        try{
            Constructor co = Test.class.getDeclaredConstructor(); // getDeclaredConstructor() method is used to get the constructor of the class
            co.setAccessible(true); // setAccessible() method is used to access the private constructor
            Object o = co.newInstance(); // newInstance() method is used to create the object of the class
        }catch(Exception e){
            System.out.println(e); // print the exception
        }
    }
}

/* The above program is an example of reflection where we are accessing the private constructor of the class using reflection.
    In the above program, we have created a class Test and a private constructor in it. We have created another class
    Private Demo3 in which we are using reflection to access the private constructor of the class Test. We are using the following
    methods of the Constructor class to access the private constructor:
    1. getDeclaredConstructor() method: It is used to get the constructor of the class.
    2. setAccessible() method: It is used to access the private constructor.
    3. newInstance() method: It is used to create the object of the class.
    The output of the above program is:
    Private constructor invoked.
    */