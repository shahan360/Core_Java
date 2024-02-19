class Buffer
{
    int a;
    public synchronized void produce(int a)
    {
        this.a=a;
        System.out.println("Producer produced: "+a);
    }

    public synchronized void consume()
    {
        System.out.println("Consumer consumed: "+a);
    }    
}

class Producer extends Thread
{
    Buffer b;
    public Producer(Buffer b)
    {
        this.b=b;
    }

    public void run()
    {
        for(int i=1;i<=10;i++)
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
        this.b=b;
    }
    public void run()
    {
        for(int i=1;i<=10;i++)
        {
            b.consume();
        }
    }
}

public class InterThreadSync {
    public static void main(String[] args) {
        System.out.println("Creating a Buffer");
        Buffer b = new Buffer();
        System.out.println("Creating Producer class object p and Consumer class object c and passing the buffer object b to them");
        Producer p=new Producer(b);
        Consumer c=new Consumer(b);
        // From here main thread stops and p and c threads start executing parallely and main thread is waiting for p and c threads to complete their execution and then main thread will terminate
        p.start();
        c.start();
    }
}
