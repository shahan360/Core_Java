class MyThread extends Thread
{
    public MyThread(String name)
    {
        super(name);
    }

    public void run()
    {
        String name = Thread.currentThread().getName();
        System.out.println(name + " thread started");
        System.out.println(name + " thread suspended");
        try
        {
            Thread.sleep(10000);
            System.out.println(name + " thread resumed");
            System.out.println(name + " thread terminated");
        }
        catch(InterruptedException e)
        {
            System.out.println(name + " thread interrupted");
        }
    }
}

public class InterruptDemo1 {
    public static void main(String[] args) {
        System.out.println("Starting main & lazy thread and interrupting lazy thread after 5 seconds");
        MyThread t1 = new MyThread("Rahul");
        MyThread t2 = new MyThread("Rohit");
        t1.start();
        t2.start();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            System.out.println(e);
        }
        if(t1.isAlive()){
            System.out.println("both thread are still alive and taking too long time in interrupting it");
            t1.interrupt();
            t2.interrupt();
        }
    }
}
