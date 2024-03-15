/* In this program we are demonstrating the concept of method overloading. 
We have created a class called Shape and defined three methods with the 
same name area() but with different parameters. This is called method overloading. 
The area() method is used to calculate the area of the circle, square, and triangle. 
The area() method with no arguments is used to calculate the area of the circle, 
the area() method with one argument is used to calculate the area of the square, 
and the area() method with two arguments is used to calculate the area of the triangle. */

import java.util.*; // Import the java.util package to use the Scanner class

class Shape // Create a class called Shape
{
    //Below are the three overloaded methods

    //1. area() - to calculate the area of the circle, this method takes no arguments
    public void area()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius of the circle: ");
        int r = sc.nextInt();
        double a = 3.14 * r * r;
        System.out.println("Area of the circle: " + a);
    }
    //2. area(int x) - to calculate the area of the square, this method takes one argument
    public void area(int x)
    {
        System.out.println("Area of the square: " +(x * x));
    }
    //3. area(int x, int y) - to calculate the area of the triangle, this method takes two arguments
    public void area(int x, int y)
    {
        System.out.println("Area of the triangle: " + (0.5 * x * y));
    }
}

public class OverloadDemo {
    public static void main(String[] args) {
        Shape s = new Shape(); // Create an object of the Shape class
        s.area(); // Call the area() method to calculate the area of the circle
        s.area(5); // Call the area(int x) method to calculate the area of the square
        s.area(5, 10); // Call the area(int x, int y) method to calculate the area of the triangle
    }
}
