import java.io.*; // File class is present in this package

public class DirCheckerDemo { // Class to check if a file is a directory or not
    public static void main(String[] args) { // Main method
        try{ // Try block to catch any exceptions
            File f=new File(args[0]); // Creating a file object with the name of the directory to be checked
            if(f.isFile()){ // Checking if the file is a directory or not
                System.out.println("It is a file, not a directory"); // If the file is not a directory, print this message
            }
            else{ // If the file is a directory
                String[] data=f.list(); // Getting the list of files and directories in the directory
                for(String t: data){ // Looping through the list of files and directories
                    System.out.println(t); // Printing the name of each file and directory
                }
            }
        }catch(Exception e){ // Catching any exception that may occur
            System.out.println(e); // Printing the exception
        }
    }
}
