public class AB {
    //instance member
    int a,b;
    public AB(int a,int b)
    {
        this.a=a;
        this.b=b;
    }
    public void show() //show is a method within the class AB
    {
        System.out.println("a="+this.a);
        System.out.println("b="+this.b);
    }
    public static void main(String[] args) {
        AB x=new AB(10,20);
        x.show();
    }
}