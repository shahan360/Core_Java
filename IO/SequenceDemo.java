import java.io.*; // FileInputStream class is present in this package and SequenceInputStream class is present in this package

public class SequenceDemo { // SequenceDemo is a class which is public and present in the file SequenceDemo.java
    public static void main(String[] args) { // main method is public and static and it takes an array of strings as arguments
        try{
            FileInputStream f1 = new FileInputStream(args[0]); // FileInputStream is a class which is present in java.io package and f1 is an object of FileInputStream class that takes input from the file whose name is given in the command line
            FileInputStream f2 = new FileInputStream(args[1]); // FileInputStream is a class which is present in java.io package and f2 is an object of FileInputStream class that takes input from the file whose name is given in the command line
            SequenceInputStream sis = new SequenceInputStream(f1, f2); // SequenceInputStream is a class which is present in java.io package and sis is an object of SequenceInputStream class that takes input from the files f1 and f2
            int ch; // ch is an integer variable which is used to store the character read from the file
            while(true){ // infinite while loop is used to read the data from the file until the end of the file
                ch = sis.read(); // read the data from the file using read method of SequenceInputStream class and store it in the ch variable
                if(ch == -1){ // if the end of the file is reached then break the loop
                    break; // break the loop
                }
                System.out.print((char)ch); // print the character on the console
            }
        }catch(Exception e){ // catch block is used to catch the exception
            System.out.println(e); // print the exception on the console
        }
    }
}
