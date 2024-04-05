/* In the below code snippet, we are using FileInputStream 
class to read data from a file. The FileInputStream class 
throws a checked exception called FileNotFoundException. 
We are not handling this exception in the code. 
So, we have declared that the main method may throw an 
exception of type IOException using the throws keyword. */

import java.io.*; //importing all classes from java.io package for FileInputStream class

class CheckedDemo //Checked Exception
{
    public static void main(String[] args) throws IOException //throws keyword is used to declare that the method may throw an exception of type IOException
    {
        FileInputStream f = new FileInputStream("a.txt"); //FileNotFoundException is a checked exception
    }
}