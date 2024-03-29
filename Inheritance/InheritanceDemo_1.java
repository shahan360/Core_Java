class Shape{ 
    int length, breadth;
    public Shape(int length, int breadth){
        this.length = length;
        this.breadth = breadth;
    }
    public void showDimension(){
        System.out.println("Length: " + length + " Breadth: " + breadth);
    }
}
class Rectangle extends Shape{
    public Rectangle(int length, int breadth){
        super(length, breadth);
    }
    public int getArea(){
        return length*breadth;
    }
}
class Cuboid extends Shape{
    int length;
    public Cuboid(int length, int breadth, int height){
        super(length, breadth);
        this.length = height;
    }
    public void showDimension(){
        super.showDimension();
        System.out.println("Height: "+ length);
    }
    public int getVolume(){
        return super.length*breadth*length;
    }
}
public class InheritanceDemo_1 {
    public static void main(String[] args) {
        Rectangle r=new Rectangle(4,5);
        r.showDimension();
        System.out.println("Area of Rectangle: "+r.getArea());
        Cuboid c=new Cuboid(4,5,6);
        c.showDimension();
        System.out.println("Volume of Cuboid: "+c.getVolume());
    }
}