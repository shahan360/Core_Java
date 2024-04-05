/* In this program, we have created a final class Test with 
two final variables a and b, a constructor to initialize the 
final variables, and two final methods getA() and getB() to 
access the final variables. We have created two objects 
t1 and t2 of the final class Test and printed the values of 
the final variables using the final methods getA() and getB(). 
We have also tried to change the value of the final variable a 
of the object t1, which will give a compile-time error. 
We have also printed the hashcode of the objects t1 and t2. */

final classs Test // final class cannot be inherited
{
    final int a; // final variable cannot be changed
    final int b; // final variable cannot be changed
    public Test(int a, int b) // final class constructor
    {
        this.a = a; // final variable can be initialized only once
        this.b = b; // final variable can be initialized only once
    }

    public int getA() // final method cannot be overridden
    {
        return a; // final variable can be accessed
    }

    public int getB() // final method cannot be overridden
    {
        return b; // final variable can be accessed
    }
}

public class CustomDemo1 { // final class cannot be inherited
    public static void main(String[] args) { //main method
        Test t1 = new Test(10, 20); // final class object
        Test t2 = new Test(10, 20); // final class object
        System.out.println(t1.getA() + " " + t1.getB()); // print the values of final variables t1 object using final method getA() and getB()
        t1.a = 100; //Now, it will give compile time error because final variable cannot be changed
        System.out.println(t1.hashCode()+" "+t2.hashCode()); // print the hashcode of t1 and t2 objects
    }
}
