import java.io.*; // File class is present in this package

public class DirNameChanger { // Class to change the name of a directory
    public static void main(String[] args) { // Main method
        try{
            File f = new File(args[0]); // Creating a file object
            if(!f.exists()){ // Checking if the file exists
                System.out.println("File does not exist"); // If file does not exist, print this message
            }
            else{ // If file exists
                if(f.renameTo(new File(args[1]))){ // Renaming the file
                    System.out.println("Directory name changed successfully"); // If file is renamed successfully, print this message
                }
                else{ // If file is not renamed successfully
                    System.out.println("Directory name change failed"); // Print this message
                }
            }
        }catch(Exception e){ // Catching the exception
            System.out.println(e); // Printing the exception
        }
    }
}
