class Buffer
{
    int a;
    public synchronized void produce(int a)
    {
        this.a = a;
        System.out.println("Produced: " + a);
    }
    public synchronized int consume()
    {
        System.out.println("Consumed: " + a);
        return a;
    }
}

class Producer extends Thread
{
    Buffer b;
    public Producer(Buffer b)
    {
        this.b = b;
    }
    public void run()
    {
        for(int i = 0; i <=10; i++)
        {
            b.produce(i);
        }
    }
}

class Consumer extends Thread
{
    Buffer b;
    public Consumer(Buffer b)
    {
        this.b = b;
    }
    public void run()
    {
        for(int i = 0; i <=10; i++)
        {
            b.consume();
        }
    }
}

public class InterDemo1 {
    public static void main(String[] args) {
        System.out.println("Creating Buffer");
        Buffer b = new Buffer();
        System.out.println("Creating producer & consumer threads and assigning buffer b to them");
        Producer p = new Producer(b);
        Consumer c = new Consumer(b);
        p.start();
        c.start();
    }
}
