import java.util.Scanner;
class Shape{
    public void area(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Radius");
        int r=sc.nextInt();
        double area=3.14*r*r;
        System.out.println("Area of circle="+area);
    }

    public void area(int x){
        System.out.println("Area of Square="+(x*x));
    }

    public void area(int x,int y){
        System.out.println("Area of triangle="+(0.5*x*y));
    }
}
public class OverloadDemo {
    public static void main(String[] args) {
        Shape s=new Shape();
        s.area();
        s.area(4);
        s.area(10,20);
    }
}
