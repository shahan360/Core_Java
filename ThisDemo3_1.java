class Swapper
{
    int a,b;
    public Swapper(int a,int b)
    {
        this.a=a;
        this.b=b;
    }
    public void swap()
    {
        int temp;
        temp=a;
        a=b;
        b=temp;
    }
    public void show()
    {
        System.out.println(a+" "+b);
    }
}
public class ThisDemo3_1 {
    public static void main(String[] args) {
        Swapper s=new Swapper(10,20);
        //changing our approach
        s.show().swap().show();
    }
}
