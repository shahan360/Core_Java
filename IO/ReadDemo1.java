import java.io.*; // FileInputStream class is present in this package and BufferedReader class is present in this package

public class ReadDemo1 { // ReadDemo1 is a class which is public and present in the file ReadDemo1.java
    public static void main(String[] args) { // main method is the entry point of the program which is public and static
        try{ // try block is used to handle the exception that may occur during the execution of the code
            // BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(args[0]))); // Object br of BufferedReader class is created and initialized with the object of InputStreamReader class which is initialized with the object of FileInputStream class to get the data from the file as a stream of bytes and store it in the buffer as a stream of characters
            BufferedReader br = new BufferedReader(new FileReader(args[0])); // Object br of BufferedReader class is created and initialized with the object of FileReader class to get the data from the file as a stream of characters and store it in the buffer as a stream of characters
            String data; // data is a variable of String type which is used to store the data read from the file
            while(true) // infinite while loop is used to read the data from the file until the end of the file
            {
                data = br.readLine(); // readLine() method is used to read the data from the file and store it in the variable data
                if(data == null) // if the end of the file is reached then the value of data will be null and the loop will break
                    break; // break statement is used to terminate the loop
                System.out.println(data); // print the data on the console
            }
        }catch(Exception e) // catch block is used to handle the exception that may occur during the execution of the code
        {
            System.out.print(e); // print the exception on the console
        }

    }
}
