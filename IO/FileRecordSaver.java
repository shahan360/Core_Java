import java.io.*; // for BufferedReader, InputStreamReader, PrintWriter, FileOutputStream classes this package is required

public class FileRecordSaver { // this class is used to save the student records in a file
    public static void main(String[] args) { // main method
        try{ // try block to handle the exception
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // to read the data from the console
            PrintWriter out = new PrintWriter(new FileOutputStream("stud.csv", true)); // to write the data in the file
            while(true) // infinite loop to take the input from the user until the user enters end
            {
                System.out.println("Enter the student name, course, fees separated by comma, press end to terminate"); // asking the user to enter the student details
                String data = br.readLine(); // reading the student details
                if(data.equals("end")) // if the user enters end then the loop will end
                    break; // break
                out.println(data);  // writing the student details in the file  
            }
            out.close(); // closing the file after writing the data
        }catch(Exception e){ // catch block to handle the exception
            System.out.println(e); // printing the exception
        }
    }
}
