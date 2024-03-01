import java.io.*; // File class is present in this package

public class DirMaker { // Class to create a directory
    public static void main(String[] args) { // Main method
        try{
            File f=new File(args[0]); // Creating a file object with the name of the directory to be created
            if(f.exists()){ // Checking if the directory already exists
                System.out.println("Directory already exists"); // If the directory already exists, print this message
            }else // If the directory does not exist
            {
                if(f.mkdir()){ // Creating the directory using the mkdir() method
                    System.out.println("Directory created successfully"); // If the directory is created successfully, print this message
                }
                else{ // If the directory is not created successfully
                    System.out.println("Failed to create directory"); // Print this message
                }
            }
        }catch(Exception e){ // Catching any exception that may occur
            System.out.println(e); // Printing the exception
        }
    }
}
