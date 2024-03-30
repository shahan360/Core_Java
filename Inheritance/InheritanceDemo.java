

class Shape{ // This is the parent shape class with length and breadth as its attributes and showDimension() as its method
    int l,b; // Attributes of the Shape class
    public Shape(int l, int b){ // Constructor of the Shape class with length and breadth as its parameters
        this.l=l; // Initializing the length
        this.b=b; // Initializing the breadth
    }
    public void showDimension(){ // Method to show the dimensions of the shape
        System.out.println("Length: "+l+" Breadth: "+b); // Printing the dimensions of the shape
    }
}

class Rectangle extends Shape{ // This is the child class of Shape class with area() as its method
    public Rectangle(int l, int b){ // Constructor of Rectangle class with length and breadth as its parameters
        super(l,b); // Calling the constructor of the parent class to initialize the length and breadth
    }
    public int area(){ // Method to calculate the area of the rectangle which is specific to the Rectangle class
        return l*b; // Returning the area of the rectangle
    }
}
class Cuboid extends Shape{ // This is the child class of Shape class with volume() as its method
    int h; // Only attribute of the Cuboid class as length and breadth are inherited from the Shape class
    public Cuboid(int l,int b,int h){ //Cuboid method taking length, breadth and height as intake
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

class InheritanceDemo{ //
    public static void main(String[] args) {
        Rectangle r=new Rectangle(4,5);
        r.showDimension();
        System.out.println("Area of rectangle="+r.area());
        Cuboid c=new Cuboid(4,5,6);
        c.showDimension();
        System.out.println("Volume of Cuboid="+c.volume());
    }
}