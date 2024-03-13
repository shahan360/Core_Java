import java.util.*; //importing all classes from java.util package for Properties class
import java.io.*; //importing all classes from java.io package for FileInputStream class

public class PropReader {
    public static void main(String[] args) {
        try {
            Properties p = new Properties(); //creating object of Properties class to store properties
            FileInputStream f = new FileInputStream("student.properties"); //creating object of FileInputStream class to read data from file student.properties
            p.load(f); //loading properties from file
            Set s = p.entrySet(); //creating object of Set interface to store properties
            Iterator itr = s.iterator(); //creating object of Iterator interface to iterate properties
            while (itr.hasNext()) { //while loop to iterate properties
                Map.Entry m = (Map.Entry) itr.next(); //creating object of Map.Entry interface to store properties
                System.out.println(m.getKey() + " " + m.getValue()); //printing properties
            }
            System.out.println(p); //printing properties
        } catch (Exception e) { //catch block to handle exceptions
            System.out.println(e); //printing exception
        }
    }
}

// In the above program, we are reading properties from a file using Properties class. We are using FileInputStream class to read data from file student.properties. We are using load() method to load properties from file. We are using entrySet() method to store properties and iterator() method to iterate properties. We are using Map.Entry interface to store properties. We are using getKey() and getValue() methods to get properties. We are using System.out.println() method to print properties. We are using catch block to handle exceptions.