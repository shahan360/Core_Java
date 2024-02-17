public class MultithreadingDemo1 {
    public static void main(String[] args) {
        System.out.println("Obtain the reference of the current thread running the main method");
        Thread t = Thread.currentThread();
        System.out.println("Display the name of the current thread running the main method "+t.getName()+" thread and its priority "+t.getPriority());
        System.out.println("Set the name of the current thread running the main method to MyThread");
        t.setName("MyThread");
        t.setPriority(7);
        System.out.println("Sleep the main thread for 5 seconds");
        try
        {
            Thread.sleep(5000);
        }catch(Exception e)
        {
            System.out.println(e);
        }
        System.out.println(t.getName()+" thread is resumed after 5 seconds of sleep with priority "+t.getPriority());
    }
}
