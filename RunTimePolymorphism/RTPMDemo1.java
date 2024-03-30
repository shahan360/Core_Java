/* In the below program we are demonstrating that using runtime polymorphism we can override the toString() method of the Object class in the user-defined classes. 
 * We have created three classes A, B, and C. We have overridden the toString() method of the Object class in all the three classes. 
 * We have created objects of all the three classes and printed them. 
 * The toString() method of the Object class is called implicitly when we print an object. 
 * So, the overridden toString() method of the respective class is called and the message is printed. 
 * This is an example of runtime polymorphism. */

class A 
{
    public String  toString() //overriding the toString() method of the Object class
    {
        return "from A"; //returning a message
    }
}

class B
{
    public String toString() //overriding the toString() method of the Object class
    {
        return "from B"; //returning a message
    }
}

class C 
{
    public String toString() //overriding the toString() method of the Object class
    {
        return "from C"; //returning a message
    }
}

public class RTPMDemo1 {
    public static void main(String[] args) {
        A x = new A(); //creating an object of class A
        B y = new B(); //creating an object of class B
        C z = new C(); //creating an object of class C
        System.out.println(x); //printing the object of class A
        System.out.println(y); //printing the object of class B
        System.out.println(z); //printing the object of class C
    }
}
