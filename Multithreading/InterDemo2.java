class Buffer
{
    int a;
    boolean produced=false;
    public synchronized void produce(int a)
    {
        if(produced)
        {
            System.out.println("Producer enter in monitoring state out of turn suspending");
            try
            {
                wait();
            }
            catch(InterruptedException e)
            {
                System.out.println(e);
            }
        }
        this.a = a;
        System.out.println("Produced: " + a);
        produced = true;
        notify();
    }

    public synchronized void consume()
    {
        if(!produced)
        {
            System.out.println("Consumer enter in monitoring state out of turn suspending");
            try
            {
                wait();
            }
            catch(InterruptedException e)
            {
                System.out.println(e);
            }
        }
        System.out.println("Consumed: " + a);
        produced = false;
        notify();
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

public class InterDemo2 {
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
