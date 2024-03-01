import java.io.*; // Required for ObjectInputStream, FileInputStream

public class DeserializeDemo2 { // Main class
    public static void main(String[] args) { // Main method
        try{
            ObjectInputStream in = new ObjectInputStream(new FileInputStream("emp1.ser")); // Creating an object of ObjectInputStream to deserialize the Employee class objects
            System.out.println("Deserializing the following Employee2 class objects"); // Printing the message of deserializing the following Employee2 class objects
            Employee2 emp1 = (Employee2)in.readObject(); // Creating an object of Employee2 class and typecasting the object of ObjectInputStream to Employee2 class
            Employee2 emp2 = (Employee2)in.readObject(); // Creating an object of Employee2 class and typecasting the object of ObjectInputStream to Employee2 class
            emp1.show(); // Calling the show method to display the details of the Employee2 class objects
            emp2.show(); // Calling the show method to display the details of the Employee2 class objects
        }catch(Exception e){ // Catch block to handle the exceptions
            System.out.println(e); // Printing the exceptions
        }
    }
}
