class AB{
    //instance member
    int a,b;
    public AB()
    {
        this(2,4);
        System.out.println("constructor with no arguments invoked");
        
    }
    public AB(int a)
    {
        this(a,6);
        System.out.println("constructor with one argument invoked");
    }
    public AB(int a,int b)
    {
        this.a=a;
        this.b=b;
        System.out.println("constructor with two arguments invoked");
    }
    public void show() //show is a method within the class AB
    {
        System.out.println("a="+this.a);
        System.out.println("b="+this.b);
    }
}

public class ThisDemo2 {
    public static void main(String[] args) {
        AB x=new AB();
        x.show();
        AB y=new AB(5);
        y.show();
        AB z=new AB(10,20);
        z.show();
    }
}
