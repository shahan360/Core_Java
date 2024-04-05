/* In the below program, we have created a class Emp 
with three instance variables id, name, and salary. 
We have created a constructor to initialize the instance 
variables. We have created a method show() to display the 
values of the instance variables. We have implemented the 
Cloneable interface in the Emp class. We have overridden the 
clone() method of the Object class in the Emp class. In the main 
class, we have created two objects of the Emp class. We have checked 
if the object is an instance of the Cloneable interface. 
We have cloned the objects e and f and stored them in p and q respectively. 
We have displayed the values of the cloned objects. */

class Emp implements Cloneable // Cloneable is a marker interface
{
    int id; // instance variables
    String name; // instance variables
    int salary; // instance variables
    public Emp(int id, String name, int salary) // constructor
    {
        this.id = id; // this keyword is used to refer to the current object
        this.name = name; // this keyword is used to refer to the current object
        this.salary = salary; // this keyword is used to refer to the current object
    }

    public void show() // method
    {
        System.out.println("Id: " + id + " Name: " + name + " Salary: " + salary); // printing the values of the instance variables
    }

    public Object clone() throws CloneNotSupportedException // method
    {
        Object o = super.clone(); // super keyword is used to refer to the immediate parent class object
        return o; // returning the object
    }
}

public class CloneDemo { // main class
    public static void main(String[] args) throws CloneNotSupportedException // main method that throws CloneNotSupportedException exception
    {
        System.out.println("Creating some employees objects"); // printing the message
        Emp e = new Emp(101,"John",50000); // creating an object of Emp class
        Emp f = new Emp(102,"Smith",60000); // creating an object of Emp class
        if(e instanceof Cloneable) // checking if the object is an instance of Cloneable interface
        {
            System.out.println("Cloning the employee object"); // printing the message
        }
        else
        {
            System.out.println("Clone not supported"); // printing the message
        }
        
        System.out.println("Details of the object to  be cloned"); // printing the message
        e.show(); // calling the show method on the object e
        f.show(); // calling the show method on the object f
        Emp p = (Emp)e.clone(); // cloning the object e and storing it in p
        Emp q = (Emp)f.clone(); // cloning the object f and storing it in q
        System.out.println("Details of the cloned object"); // printing the message
        p.show(); // calling the show method on the object p
        q.show(); // calling the show method on the object q
    }
}
