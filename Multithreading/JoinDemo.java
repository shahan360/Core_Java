class MyThread extends Thread{
    public void run(){
        System.out.println("Child thread started");
        for(int i = 0; i < 10; i++){
            System.out.println("Child thread: " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
        System.out.println("Child thread terminated");
    }
}

public class JoinDemo {
    public static void main(String[] args) {
        System.out.println("Main thread started");
        MyThread t = new MyThread();
        t.start();
        try {
            t.join(); // applying join on t, so main thread will wait for t to terminate this means main thread will terminate after t and both will be executed sequentially
        } catch (InterruptedException e) {
            System.out.println(e);
        }
        System.out.println("Main thread terminated");
    }
}
