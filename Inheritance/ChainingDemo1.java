/* The below program demonstrates constructor chaining. 
In constructor chaining, a constructor of a class can call 
another constructor of the same class or the super class. 
In the below program, we have a super class A with a constructor 
to display a message. We have a sub class B which extends the 
super class A. We have a sub class C which extends the sub class B. 
We have a constructor for class C to display a message. In the main method, 
we have created an object x of class A, an object y of class B and an object z of class C. 
When we create an object of class C, the constructor of class C will be called which will 
call the constructor of class B and in turn the constructor of class A. */

class A extends Object //class A is the parent class or super class whose parent class is Object. Object class is the root class in Java which is the super class of all the classes in Java
{
    public A() //defining a constructor for class A
    {
        super(); //calling the constructor of the super class Object
        System.out.println("from A"); //displaying a message that it is now called from class A
    }
}

class B extends A //class B is the child class or sub class of class A. So it can inherite the properties of class A as well as Object class
{
    public B() //defining a constructor for class B
    {
        super(); //calling the constructor of the super class A as well as Object
    }
}

class C extends B //class C is the child class or sub class of class B. So it can inherite the properties of class B, A as well as Object class
{
    public C() //defining a constructor for class C
    {
        super(); //calling the constructor of the super class B, A as well as Object
        System.out.println("from C"); //displaying a message that it is now called from class C
    }
}

public class ChainingDemo1 { //main class
    public static void main(String[] args) { //main method
        A x = new A(); //creating an object of class A
        B y = new B(); //creating an object of class B
        C z = new C(); //creating an object of class C

    }
}
