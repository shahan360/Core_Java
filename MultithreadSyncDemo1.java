class Printer{
    public void print(char ch)
    {
        //half line printed by one thread and half line printed by another thread
        for(int i=1;i<=30;i++)
        {
            System.out.print(ch);
        }
        //Sleep it for 2 seconds so that other thread can get the lock on p object
        try
        {
            Thread.sleep(2000);
        }catch(Exception e)
        {
            System.out.println(e);
        }
        // remaining half line now printed by the other thread
        for(int i=1;i<=30;i++)
        {
            System.out.print(ch);
        }
        //new line printed
        System.out.println();
    }
}

class StarPrinter extends Thread {
    Printer p;
    StarPrinter(Printer p) {
        this.p = p;
    }
    public void run() {
        synchronized(p) {
            System.out.println("StarPrinter started");
            p.print('*');
            System.out.println("StarPrinter completed");
        }
    }
}

class HashPrinter extends Thread {
    Printer p;
    HashPrinter(Printer p) {
        this.p = p;
    }
    public void run() {

        synchronized(p) {
            System.out.println("HashPrinter started");
            p.print('#');
            System.out.println("HashPrinter completed");
        }
    }
}

public class MultithreadSyncDemo1 {
    public static void main(String[] args) {
        System.out.println("Creating the object p of Printer class");
        Printer p = new Printer();
        System.out.println("Creating the object st of StarPrinter class and object hs of HashPrinter class and assigning the object p to them");
        StarPrinter st = new StarPrinter(p);
        HashPrinter hs = new HashPrinter(p);
        //Main thread stops here and waits for st and hs threads to complete, while st and hs threads are waiting for each other to release the lock on p object(st and hs threads are starting here and waiting for each other to release the lock on p object)
        st.start();
        hs.start();
    }
}
