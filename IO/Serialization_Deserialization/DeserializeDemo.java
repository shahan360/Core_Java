import java.io.*; // Required for ObjectInputStream, FileInputStream

public class DeserializeDemo { // Main class
    public static void main(String[] args) { // Main method
        try{
            ObjectInputStream in = new ObjectInputStream(new FileInputStream("emp.ser")); // Creating an object of ObjectInputStream to deserialize the Employee class objects from file emp.ser
            System.out.println("Deserializing the following Employee class objects"); // Printing the message of deserializing the following Employee class objects
            Employee e1 = (Employee)in.readObject(); // Creating an object of Employee class and typecasting the object of ObjectInputStream to Employee class
            Employee e2 = (Employee)in.readObject(); // Creating an object of Employee class and typecasting the object of ObjectInputStream to Employee class
            e1.show(); // Calling the show method to display the details of the Employee class objects
            e2.show(); // Calling the show method to display the details of the Employee class objects
        }catch(Exception e){ // Catch block to handle the exceptions
            System.out.println(e); // Printing the exception
        }
    }
}
