import java.util.Scanner;
class Shape{
    public void show(Object o){
        System.out.println("Hello");
    }
    public void show(String s){
        System.out.println("Ok");
    }
}
public class OverloadDemo1 {
    public static void main(String[] args) {
        Shape s=new Shape();
        s.show(null);
    }
}
