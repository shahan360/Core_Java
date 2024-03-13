import java.io.*; //importing all classes from java.io package for FileOutputStream class
import java.util.*; //importing all classes from java.util package for Properties class

public class PropSaver { //class to save properties in a file
    public static void main(String[] args) { //main method
        try{ //try block to handle exceptions
            FileOutputStream f = new FileOutputStream("student.properties"); //creating object of FileOutputStream class to read data from file student.properties
            Properties p = new Properties(); //creating object of Properties class to store properties
            p.setProperty("Shashank", "Spring"); //setting properties
            p.setProperty("Saurabh", "Hibernate"); //setting properties
            p.put("Deepak", "java"); //using put method to set properties
            p.store(f, "Student Details"); //storing properties in file
            Thread.sleep(2000); //making the thread to sleep for 2 seconds
            System.out.println("Properties are saved successfully"); //printing message

        }catch(Exception e){ //catch block to handle exceptions
            System.out.println(e); //printing exception
        }
    }
}

/* In the above program, we are saving properties 
in a file using Properties class. We are using 
setProperty() method to set properties and put() method 
to set properties. We are using FileOutputStream class 
to read data from file student.properties. */
