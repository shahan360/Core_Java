import java.io.*; // Required for Serializable, ObjectOutputStream, FileOutputStream

class Employee2 implements Serializable // Serializable is a marker interface
{
    int id; // Non-static variable is serialized
    static String name; // Static variable is not serialized
    transient int salary; // transient variable is not serialized
    // int tel; // If we add this variable after serialization, then it will throw an error
    private static final long serialVersionUID = 1L; // To avoid InvalidClassException during deserialization process

    public Employee2(int id, String name, int salary){ // Parameterized Constructor to initialize the values
        this.id = id; // this keyword is used to refer to the current object
        this.name = name; // this keyword is used to refer to the current object and to differentiate between instance variable and parameter 
        this.salary = salary; // this keyword is used to refer to the current object
    }

    public void show() // Method to display the details of the Employee class objects
    {
        System.out.println("Id: "+id+" Name: "+name+" Salary: "+salary); // Printing the details of the Employee class objects
    }
}

public class SerializeDemo2 { // Main class
    public static void main(String[] args) { // Main method
        try{
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("emp1.ser")); // Creating an object of ObjectOutputStream to serialize the Employee class objects
            System.out.println("Creating some Employee class objects"); // Printing the message of creating Employee class objects
            Employee2 emp1 = new Employee2(1, "John", 1000); // Creating an object of Employee2 class
            Employee2 emp2 = new Employee2(2, "Martin", 2000); // Creating an object of Employee2 class
            System.out.println("Details of Employee Objects to be serialized"); // Printing the message of details of Employee Objects to be serialized
            emp1.show(); // Calling the show method to display the details of the Employee2 class objects
            emp2.show(); // Calling the show method to display the details of the Employee2 class objects
            out.writeObject(emp1); // Writing the object of Employee2 class to the file
            out.writeObject(emp2); // Writing the object of Employee2 class to the file
            Thread.sleep(2000); // Sleeping the thread for 2 seconds
            System.out.println("Employee objects serialized successfully"); // Printing the message of Employee objects serialized successfully
        }catch(Exception e){ // Catch block to handle the exceptions
            System.out.println(e); // Printing the exception
        }
    }
}
