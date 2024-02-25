class MyThread extends Thread 
{
    MyThread(ThreadGroup g, String name) {
        super(g, name);
    }
    public void run() 
    {
        String name = Thread.currentThread().getName();
        System.out.println(name + " thread started");
        System.out.println(name + " thread suspended");
        try 
        {
            Thread.sleep(10000);
        } catch (InterruptedException e) 
        {
            System.out.println(name + " thread interrupted");
        }
    }
}

public class GroupDemo {
    public static void main(String[] args) {
        System.out.println("Starting main & lazy thread and interrupting lazy thread after 5 seconds");
        ThreadGroup g = new ThreadGroup("group"); // creating a thread group to group the threads t1 and t2 together
        MyThread t1 = new MyThread(g, "Rahul");
        MyThread t2 = new MyThread(g, "Rohit");
        t1.start();
        t2.start();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            System.out.println(e);
        }
        if(g.activeCount() > 0){
            System.out.println("both thread are still alive and taking too long time in interrupting it");
            g.interrupt();
        }
    }
}
