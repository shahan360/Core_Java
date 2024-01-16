class Shape{
    int l,b;
    public Shape(int l, int b){
        this.l = l;
        this.b = b;
    }
    public void showDimension(){
        System.out.println("Length: "+l+" Breadth: "+b);
    }
}

class Rectangle extends Shape{
    public Rectangle(int l, int b){
        super(l,b);
    }
    public int area(){
        return l*b;
    }
}
class Cuboid extends Shape{
    int h;
    public Cuboid(int l,int b,int h){
        super(l,b);
        this.h=h;
    }
    public void showDimension(){
        super.showDimension();
        System.out.println("height="+h);
    }
    public int volume(){
        return l*b*h;
    }
}

class InheritanceDemo{
    public static void main(String[] args) {
        Rectangle r=new Rectangle(4,5);
        r.showDimension();
        System.out.println("Area of rectangle="+r.area());
        Cuboid c=new Cuboid(4,5,6);
        c.showDimension();
        System.out.println("Volume of Cuboid="+c.volume());
    }
}