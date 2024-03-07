import java.util.*; //importing this package to use Vector and Enumeration classes for this program

public class VectorTest { //creating a class
    static Enumeration e; //creating a static object e of Enumeration class to get the elements of the vector
    public static void main(String[] args) { //main method starts
        Vector v  = new Vector<>(); //creating object v of Vector class
        v.addElement("A"); //adding elements to the vector using addElement method of Vector class
        v.addElement("B"); //adding elements to the vector using addElement method of Vector class
        v.addElement("C"); //adding elements to the vector using addElement method of Vector class
        v.addElement("D"); //adding elements to the vector using addElement method of Vector class
        e = v.elements(); //using elements method of Vector class to get the elements of the vector v
        System.out.println("Creating thread to traverse the elements of the vector"); //printing a message
        Thread t = new Thread() //Anonymous inner class starts //creating a thread to traverse the elements of the vector, this thread is special as it is created using anonymous inner class
        {
            public void run() //run method starts
            {
                while(e.hasMoreElements()) //using hasMoreElements method of Enumeration class to check if there are more elements in the vector
                {
                    System.out.println(e.nextElement()); //using nextElement method of Enumeration class to get the next element of the vector and printing it
                    try //using try block to handle exception
                    {
                        Thread.sleep(1000); //using sleep method of Thread class to make the thread sleep for 1000 milliseconds
                    }
                    catch(InterruptedException e) //catch block starts
                    {
                        System.out.println(e); //printing the exception
                    }
                }
            }
        }; //Anonymous inner class ends
        System.out.println("Starting another thread to traverse the elements of the vector"); //printing a message
        t.start(); //starting the thread
        try 
        {
            Thread.sleep(2000); //using sleep method of Thread class to make the main thread sleep for 2000 milliseconds
        }catch(Exception e) //catch block starts
        {
            System.out.println(e); //printing the exception
        }
        System.out.println("Removing element D and adding element E in the vector"); //printing a message
        v.removeElement("D"); //using removeElement method of Vector class to remove element D from the vector
        v.addElement("E"); //using addElement method of Vector class to add element E to the vector
    }
}

/* The above program demonstrates the use of Vector class and Enumeration interface.
In the above program, we have created a vector v and added elements A, B, C and D to it using addElement method of Vector class.*/