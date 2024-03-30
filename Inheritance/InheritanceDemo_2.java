/* In the below program, we have a super class Shape with two instance variables length and breadth 
and a constructor to initialize the instance variables. We have a method showDimension() to display 
the length and breadth. We have a sub class Rectangle which extends the super class Shape and inherits 
the instance variables and methods of the super class. The sub class Rectangle has a constructor with 
two parameters length and breadth. We have a method area() to calculate the area of the rectangle. 
We have another sub class Cuboid which extends the super class Shape and inherits the instance variables 
and methods of the super class. The sub class Cuboid has an instance variable height and a constructor
with three parameters length, breadth and height. We have a method showDimension() to display the length, 
breadth and height. We have a method volume() to calculate the volume of the cuboid. In the main method, 
we have created an object r of class Rectangle and called the showDimension() method to display the 
length and breadth and called the area() method to calculate the area of the rectangle. We have created an 
object c of class Cuboid and called the showDimension() method to display the length, breadth and height 
and called the volume() method to calculate the volume of the cuboid. */

class Shape //We declared a super class Shape
{
    int length, breadth; //We declared two instance variables length and breadth
    public Shape(int length, int breadth) //We declared a constructor with two parameters length and breadth
    {
        this.length = length; //We initialized the instance variable length with the parameter length
        this.breadth = breadth; //We initialized the instance variable breadth with the parameter breadth
    }
    
    public void showDimension() //We declared a method showDimension() to display the length and breadth
    {
        System.out.println("Length: " + length + " Breadth: " + breadth); //We displayed the length and breadth
    }
}

class Rectangle extends Shape //We declared a sub class Rectangle which extends the super class Shape and inherits the instance variables and methods of the super class
{
    public Rectangle(int length, int breadth) //We declared a constructor with two parameters length and breadth
    {
        super(length, breadth); //We called the constructor of the super class Shape to initialize the instance variables length and breadth
    }

    public int area() //We declared a method area() to calculate the area of the rectangle
    {
        return length * breadth; //We returned the area of the rectangle
    }
}

class Cuboid extends Shape //We declared a sub class Cuboid which extends the super class Shape and inherits the instance variables and methods of the super class
{
    int height; //We declared an instance variable height
    public Cuboid(int length, int breadth, int height) //We declared a constructor with three parameters length, breadth and height
    {
        super(length, breadth); //We called the constructor of the super class Shape to initialize the instance variables length and breadth
        this.height = height; //We initialized the instance variable height with the parameter height
    }

    public void showDimension() //We declared a method showDimension() to display the length, breadth and height
    {
        super.showDimension(); //We called the showDimension() method of the super class Shape to display the length and breadth
        System.out.println("Height: " + height); //We displayed the height
    }

    public int volume() //We declared a method volume() to calculate the volume of the cuboid
    {
        return super.length * breadth * height; //We returned the volume of the cuboid
    }
}

public class InheritanceDemo_2 { //We declared a class InheritanceDemo_2
    public static void main(String[] args) { //We declared the main method
        Rectangle r = new Rectangle(10, 20); //We created an object r of class Rectangle
        r.showDimension(); //We called the showDimension() method of class Rectangle to display the length and breadth
        System.out.println("Area: " + r.area()); //We called the area() method of class Rectangle to calculate the area of the rectangle

        Cuboid c = new Cuboid(10, 20, 30); //We created an object c of class Cuboid
        c.showDimension(); //We called the showDimension() method of class Cuboid to display the length, breadth and height
        System.out.println("Volume: " + c.volume()); //We called the volume() method of class Cuboid to calculate the volume of the cuboid
    }
}
