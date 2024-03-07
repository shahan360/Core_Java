import java.util.*; //importing this package to use List and ArrayList classes for this program

public class ListTest { //creating a class
    static Iterator itr; //creating a static object itr of Iterator class to get the elements of the list
    public static void main(String[] args) { //main method starts
        ArrayList list = new ArrayList<>(); //creating object list of ArrayList class
        list.add("A"); //adding elements to the list using add method of List interface
        list.add("B"); //adding elements to the list using add method of List interface
        list.add("C"); //adding elements to the list using add method of List interface
        list.add("D"); //adding elements to the list using add method of List interface
        itr = list.iterator(); //using iterator method of List interface to get the elements of the list
        System.out.println("Creating thread to traverse the elements of the list"); //printing a message
        Thread t = new Thread() //Anonymous inner class starts //creating a thread to traverse the elements of the list, this thread is special as it is created using anonymous inner class
        {
            public void run() //run method starts
            {
                while(itr.hasNext()) //using hasNext method of Iterator class to check if there are more elements in the list
                {
                    System.out.println(itr.next()); //using next method of Iterator class to get the next element of the list and printing it
                    try //using try block to handle exception
                    {
                        Thread.sleep(1000); //using sleep method of Thread class to make the thread sleep for 1000 milliseconds
                    }
                    catch(Exception e) //catch block starts
                    {
                        System.out.println(e); //printing the exception
                    }
                }
            }
        }; //Anonymous inner class ends
        System.out.println("Starting another thread to traverse the elements of the list"); //printing a message
        t.start(); //starting the thread
        try 
        {
            Thread.sleep(2000); //using sleep method of Thread class to make the main thread sleep for 2000 milliseconds
        }catch(Exception e) //catch block starts
        {
            System.out.println(e); //printing the exception
        }
        System.out.println("Removing element D and adding element E in the list"); //printing a message
        list.remove("D"); //using remove method of List interface to remove element D from the list
        list.add("E"); //using add method of List interface to add element E to the list    
    }
}

/* The above program demonstrates the use of List interface and ArrayList class.
In the above program, we have created a list and added elements A, B, C and D to it using add method of List interface. 
Then we set itr to the iterator of the list and created a thread to traverse the elements of the list. 
This thread is special as it is created using anonymous inner class. 
We have also created another thread to traverse the elements of the list.
In the main thread, we have used sleep method of Thread class to make the main thread sleep for 2000 milliseconds. 
Then we have removed element D and added element E to the list using remove and add methods of List interface respectively.*/