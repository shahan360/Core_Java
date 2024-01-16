class Swapper
{
    int a,b;
    public Swapper(int a,int b)
    {
        this.a=a;
        this.b=b;
        // return this;
    }
    public Swapper swap()
    {
        int temp;
        temp=a;
        a=b;
        b=temp;
        return this; //to facilitate method chaining
    }
    public Swapper show()
    {
        System.out.println(a+" "+b);
        return this; //to facilitate method chaining
    }
}
public class ThisDemo3_2 {
    public static void main(String[] args) {
        // Swapper s=new Swapper(10,20);
        //changing our approach to chaining approach
        // s.show().swap().show();
        //constructor call & method chaining approach together
        new Swapper(10,20).show().swap().show();

    }
}
