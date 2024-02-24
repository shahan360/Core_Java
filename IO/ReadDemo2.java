import java.io.*; // FileInputStream class is present in this package and BufferedReader class is present in this package

public class ReadDemo2 { // ReadDemo2 is a class which is public and present in the file ReadDemo2.java
    public static void main(String[] args) { // main method is the entry point of the program which is public and static
        try{ // try block is used to handle the exception that may occur during the execution of the code
            FileInputStream f = new FileInputStream(args[0]); // Object f of FileInputStream class is created and initialized with the object of FileInputStream class to get the data from the file as a stream of bytes
            int size = f.available(); // available() method is used to get the number of bytes available in the file and it is stored in the variable size
            byte b[] = new byte[size]; // b is an array of byte type which is used to store the data read from the file as a stream of bytes
            f.read(b); // read() method is used to read the data from the file and store it in the array b as a stream of bytes
            System.out.println(new String(b)); // print the data on the console
        }catch(Exception e) // catch block is used to handle the exception that may occur during the execution of the code
        {
            System.out.print(e); // print the exception on the console
        }
    }
}
