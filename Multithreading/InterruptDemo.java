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
            Thread.sleep(1000);
            System.out.println(name + " thread resumed");
            System.out.println(name + " thread terminated");
        }
        catch(InterruptedException e)
        {
            System.out.println(name + " thread interrupted");
        }
    }
}

public class InterruptDemo {
    public static void main(String[] args) {
        System.out.println("Starting main & lazy thread and interrupting lazy thread after 5 seconds");
        MyThread t = new MyThread("Lazy Thread");
        t.start();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            System.out.println(e);
        }
        if(t.isAlive()){
            System.out.println(t.getName() + " is still alive and taking too long time in interrupting it");
            t.interrupt();
        }
    }
}
