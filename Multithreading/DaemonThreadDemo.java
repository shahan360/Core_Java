class MyThread extends Thread //class MyThread extends Thread class to create a thread
{
    public MyThread(String name) //constructor to give a name to a thread that takes argument as a string
    {
        super(name); //calling the constructor of Thread class and passing the name of the thread
    }

    public void run() //overriding the run method of Thread class to define the job of thread in our own MyThread class
    {
        Thread t = Thread.currentThread(); //returns a reference to the currently executing thread object by calling static method currentThread() of Thread class
        if(t.isDaemon()) //to check whether the thread is daemon or not
        {
            System.out.println(t.getName() + " is Daemon Thread"); //to print the name of the thread
        }
        else //if the thread is not daemon
        {
            System.out.println(t.getName() + " is Normal User Thread"); //to print the name of the thread
        }
    }
}

class DaemonThreadDemo //main class 
{
    public static void main(String[] args) { //main method
        MyThread t1 = new MyThread("A"); //creating the object t1 of MyThread class and passing the name of the thread
        MyThread t2 = new MyThread("B"); //creating the object t2 of MyThread class and passing the name of the thread
        MyThread t3 = new MyThread("C"); //creating the object t3 of MyThread class and passing the name of the thread
        t2.setDaemon(true); //to make t2 as daemon thread
        t1.start(); //to start the thread t1
        t2.start(); //to start the thread t2
        t3.start(); //to start the thread t3
    }
}