// package Multithreading; //For this to work, this file should be inside the folder "Multithreading"

class MyThread extends Thread //class MyThread extends Thread class to create a thread 
{
    public void run() //overriding the run method of Thread class to define the job of thread in our own MyThread class
    {
        System.out.println("Starting the Daemon Thread..."); //to print the message
        for(int i = 1; i <= 10; i++) //for loop to print the thread numbers from 1 to 10
        {
            System.out.println("Daemon Thread Started: " + i); //to print the message
            try //try block to handle the exception
            {
                Thread.sleep(1000); //to make the thread sleep for 1000 milliseconds
            }
            catch(Exception e) //catch block to handle the exception
            {
                System.out.println(e); //to print the exception if occurs
            }
        }
        System.out.println("Ending the Daemon Thread..."); //to print the message after the for loop
    }
}

public class DaemonThreadDemo1 { //main class
    public static void main(String[] args) { //main method 
        System.out.println("Starting main thread..."); //to print the message about the main thread starting
        MyThread t1 = new MyThread(); //creating the object t1 of MyThread class and passing the name of the thread
        t1.setDaemon(true); //to make t1 as daemon thread
        t1.start(); //to start the thread t1
        System.out.println("Ending main thread..."); //to print the message about the main thread ending
    }
}
