/* In the below program, we are showing constructor chaining. 
In constructor chaining, a constructor of a class can call 
another constructor of the same class or the super class. 
In the below program, we have a super class A with a constructor 
to display a message. We have a sub class B which extends the super class A. 
We have a sub class C which extends the sub class B. We have a constructor 
for class C to display a message. In the main method, we have created an 
object x of class A, an object y of class B and an object z of class C. 
When we create an object of class C, the constructor of class C will be called 
which will call the constructor of class B and in turn the constructor of class A. */

class A //class A is the parent class or super class
{
    public A() //defining a constructor for class A
    {
        System.out.println("from A"); //displaying a message
    }
}

class B extends A //class B is the child class or sub class of class A. Note that class B don't have a constructor but still it will call the constructor of class A that will help class C to call the constructor of class B and in turn the constructor of class A
{

}

class C extends B //class C is the child class or sub class of class B. Class C have its own constructor but still it can call the constructor of class B and in turn the constructor of class A
{
    public C() //defining a constructor for class C
    {
        System.out.println("from C"); //displaying a message
    }
}

public class ChainingDemo { //main class
    public static void main(String[] args) { //main method
        A x = new A(); //creating an object of class A
        B y = new B(); //creating an object of class B
        C z = new C(); //creating an object of class C
    }
}
