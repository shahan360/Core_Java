import java.io.*; // FileInputStream class is present in this package
class ReadDemo // ReadDemo is a class which is public and present in the file ReadDemo.java
{
    public static void main(String[] args) {
        try{ // try block is used to handle the exception that may occur during the execution of the code
            FileInputStream f=new FileInputStream(args[0]); // FileInputStream is a class which is used to read the data from the file and store as a stream of bytes
            int ch; // ch is a variable of int type which is used to store the data read from the file
            while(true) // infinite while loop is used to read the data from the file until the end of the file
            {
                ch=f.read(); // read() method is used to read the data from the file and store it in the variable ch
                if(ch==-1) // if the end of the file is reached then the value of ch will be -1 and the loop will break
                    break; // break statement is used to terminate the loop
                System.out.print((char)ch); // (char) is used to convert the integer value to character and print it on the console   
            }
        }catch(Exception e) // catch block is used to handle the exception that may occur during the execution of the code
        {
            System.out.println(e); // print the exception message on the console
        }
    }
}