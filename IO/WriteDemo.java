import java.io.*; // FileInputStream class is present in this package and BufferedReader class is present in this package

public class WriteDemo { // WriteDemo is a class which is public and present in the file WriteDemo.java
    public static void main(String[] args) { // main method is called when the program is run
        try{ // try block is used to handle exceptions
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // BufferedReader is a class which is used to read the data from the keyboard from InputStreamReader class using System.in object
            PrintWriter out = new PrintWriter(new FileOutputStream("a.txt")); // PrintWriter is a class which is used to write the data to the file a.txt using FileOutputStream class
            while(true) // infinite while loop is used to take the input from the user until the user enters end
            {
                System.out.println("Enter data, press end to terminate"); // print the message on the console
                String data = br.readLine(); // read the data from the keyboard using readLine method of BufferedReader class of br object and store it in the data variable
                if (data.equals("end")) // if the data is equal to end then break the loop
                {
                    break; // break the loop
                }
                out.println(data); // write the data to the file using println method of PrintWriter class of out object
            }
            out.close(); // close the file
        }catch(Exception e) // catch block is used to catch the exception
        {
            System.out.print(e); // print the exception on the console
        }
    }
}
