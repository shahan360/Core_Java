class MyThread implements Runnable // This is the child thread which is executed by the JVM and implements the Runnable interface to provide the implementation of the run method from the Runnable interface
{
    public MyThread() // This is the constructor of the MyThread class which is executed by the JVM
    {
        Thread t=new Thread(this); // Create an object of the Thread class and assign its reference to the reference variable t of the Thread class and pass the reference of the current object of the MyThread class to the constructor of the Thread class
        t.start(); // Start the child thread
    }

    public void run() // This method is executed by the child thread and this run method is called by the JVM when the child thread is started
    {
        System.out.println("Start of the child thread"); // This statement is executed by the child thread and is displayed on the console
        for(int i=1;i<=10;i++)  // This loop is executed by the child thread and the main thread is executed concurrently with the child thread
        {
            System.out.println("Child thread: "+i); // This statement is executed by the child thread and is displayed on the console
            try // This block is executed by the child thread
            {
                Thread.sleep(2000); // Sleep the child thread for 2 seconds until the main thread is executed
            }catch(Exception e) // This block is executed by the child thread in case of an exception
            {
                System.out.println(e); // This statement is executed by the child thread and is displayed on the console in case of an exception
            }
        }
        System.out.println("End of the child thread"); // This statement is executed by the child thread and is displayed on the console when the child thread is terminated
    }
}

public class MultithreadingDemo_Indirect // Indirectly run this file
{ 
    public static void main(String[] args) 
    { // This is the main thread which is executed by the JVM
        System.out.println("Start of the main thread"); // This is the first statement of the main thread which is executed by the JVM
        MyThread t = new MyThread(); // Create an object of the MyThread class and assign its reference to the reference variable t of the Thread class
        for(int i=10;i>=1;i--) // This loop is executed by the main thread and the child thread is executed concurrently with the main thread
        {
            System.out.println("Main thread: "+i); // This statement is executed by the main thread and is displayed on the console
            try // This block is executed by the main thread
            {
                Thread.sleep(2000); // Sleep the main thread for 2 seconds until the child thread is executed
            }catch(Exception e) // This block is executed by the main thread in case of an exception
            {
                System.out.println(e); // This statement is executed by the main thread and is displayed on the console in case of an exception
            }
        }
        System.out.println("End of the main thread"); // This statement is executed by the main thread and is displayed on the console when the main thread is terminated
    }
}
