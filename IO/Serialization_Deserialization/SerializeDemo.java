import java.io.*; // for Serializable interface

class Employee implements Serializable // Serializable is a marker interface
{
    int id; // instance variables are serialized
    String name; // instance variables are serialized
    int salary; // instance variables are serialized
    int telno; // instance variables are not serialized
    public Employee(int id,String name,int salary) // constructor is not serialized
    {
        this.id=id; // instance variables are serialized
        this.name=name; // instance variables are serialized
        this.salary=salary; // instance variables are serialized
    }

    public void show() // method is not serialized
    {
        System.out.println("Id: "+id+" Name: "+name+" Salary: "+salary); // instance variables are serialized
    }
}
public class SerializeDemo { // main class
    public static void main(String[] args) { // main method
        try{
            ObjectOutputStream out=new ObjectOutputStream(new FileOutputStream("emp.ser")); // creating object of ObjectOutputStream class so that we can write objects to file emp.ser
            System.out.println("Creating some employees objects"); // printing message on console to show that we are creating some employees objects before serializing them
            Employee e1=new Employee(101,"abc",10000); // creating object of Employee class and initializing its instance variable e1
            Employee e2=new Employee(102,"xyz",20000); // creating object of Employee class and initializing its instance variable e2
            System.out.println("Details of employees object to be serialized"); // printing message on console to show that we are going to serialize the details of employees objects
            e1.show(); // calling show method of e1 object
            e2.show(); // calling show method of e2 object
            out.writeObject(e1); // writing e1 object to file emp.ser
            out.writeObject(e2); // writing e2 object to file emp.ser
            Thread.sleep(2000); // making the current thread to sleep for 2000 milliseconds so that we can see the message on console
            System.out.println("Serialization done successfully"); // printing message on console to show that serialization is done successfully
        }
        catch(Exception e) // catching the exception if any
        {
            System.out.println(e); // printing the exception on console
        }
    }
}
