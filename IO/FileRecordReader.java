import java.io.*; // for BufferedReader, InputStreamReader, FileInputStream classes this package is required
import java.util.*; // for StringTokenizer class this package is required

public class FileRecordReader { // this class is used to read the student records from a file
    public static void main(String[] args) { // main method
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("stud.csv"))); // to read the data from the file
            String data; // to store the data read from the file
            while(true) // infinite loop to read the data from the file until the end of the file
            {
                data = br.readLine(); // reading the data from the file
                if(data == null) // if the end of the file is reached then the loop will end
                    break; // break
                show(data); // calling the show method to display the student details  
            }
        }catch(Exception e){ // catch block to handle the exception
            System.out.println(e); // printing the exception
        }
    }

    public static void show(String s) // this method is used to display the student details
    {
        StringTokenizer st = new StringTokenizer(s, ","); // to split the student details
        while(st.hasMoreTokens()) // loop to display the student details
        {
            System.out.println(st.nextToken()+" "+st.nextToken()+" "+st.nextToken()); // displaying the student details
        }
    }
}
