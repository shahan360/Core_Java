/* In the below example, we are creating a class Student with the private fields rollNo, name, course, and fees. 
 * We are creating the setter and getter methods to set and get the values of the private fields. 
 * We are creating the main method in another class StudentDemo to create an object of the Student class and call the setter and getter methods.
 */

import java.util.*; // Import the java.util package to use the Scanner class

class Student{
    // Declare the instance variables or attributes or fields of the class
    private int rollNo; // Roll number of the student
    private String name; // Name of the student
    private String course; // Course of the student
    private int fees; // Fees of the student

    //create the behavior(or method) of the class that shows how our object will behave
    //creating the setter method to set the value of the private fields
    public void setData()
    {
        Scanner sc = new Scanner(System.in); // Create a Scanner object to take input from the user
        System.out.println("Enter the student's details: "); // Print the message to take the student's details
        rollNo = sc.nextInt(); // Take the roll number as input from the user
        name = sc.next(); // Take the name as input from the user
        course = sc.next(); // Take the course as input from the user
        fees = sc.nextInt(); // Take the fees as input from the user
    }
    //creating the getter method to get the value of the private fields
    public void getData()
    {
        System.out.println("The student's details are: "); // Print the message to show the student's details
        System.out.println("Roll No: "+rollNo); // Print the roll number of the student
        System.out.println("Name: "+name); // Print the name of the student
        System.out.println("Course: "+course); // Print the course of the student
        System.out.println("Fees: "+fees); // Print the fees of the student
    }
}

public class StudentDemo {
    public static void main(String[] args) {
        Student s = new Student(); // Create an object of the Student class
        s.setData(); // Call the setData() method to set the student's details
        s.getData(); // Call the getData() method to get the student's details
    }
}
