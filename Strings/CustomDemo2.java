/* This program demonstrates the concept of immutability in Java. 
An immutable class is a class whose objects cannot be modified 
once they are created. In this program, we have created an immutable 
class named Age. The Age class has three instance variables: day, month, and year. 
The Age class has getter and setter methods for each instance variable. 
The Student class has three instance variables: rollNo, name, and age. 
The Student class has a constructor to initialize the values of the instance variables. 
The Student class has getter methods for each instance variable. In the main class, 
we have created an object of the Age class and set the values of the instance variables. 
We have created an object of the Student class and passed the Age object to the constructor. 
We have printed the age of the student before and after modifying the value of the year. 
We have observed that the age of the student remains the same even after modifying the value of the year. 
This is because the Age class is an immutable class. */

class Age //immutable class
{
    int day, month, year; //instance variables
    public void setDay(int day) //setter method for day
    {
        this.day = day; //this keyword is used to refer to the current object
    }

    public int getDay() //getter method for day
    {
        return day; //return the value of day
    }

    public void setMonth(int month) //setter method for month
    {
        this.month = month; //this keyword is used to refer to the current object
    }

    public int getMonth() //getter method for month
    {
        return month; //return the value of month
    }

    public void setYear(int year) //setter method for year
    {
        this.year = year; //this keyword is used to refer to the current object
    }

    public int getYear() //getter method for year
    {
        return year; //return the value of year
    }
}

final class Student //immutable class
{
    final int rollNo; //instance variables
    final String name; //instance variables
    final Age age; //has-a relationship
    public Student(int rollNo, String name, Age age) //constructor to initialize the values of the instance variables
    {
        this.rollNo = rollNo; //this keyword is used to refer to the current object
        this.name = name; //this keyword is used to refer to the current object
        this.age = age; //this keyword is used to refer to the current object
    }

    public int getRollNo() //getter method for rollNo
    {
        return rollNo; //return the value of rollNo
    }

    public String getName() //getter method for name
    {
        return name; //return the value of name
    }

    public Age getAge() //getter method for age
    {
        return age; //return the value of age
    }
}

public class CustomDemo2 { //main class
    public static void main(String[] args) { //main method
        System.out.println("Creating an age object"); //print the message
        Age age = new Age(); //creating an object of the Age class
        age.setDay(1); //setting the value of day
        age.setMonth(1); //setting the value of month
        age.setYear(1990); //setting the value of year
        System.out.println("Creating a student object and passing the age object"); //print the message
        Student student = new Student(1, "John", age); //creating an object of the Student class and passing the age object
        System.out.println("Student age before modification: " + student.getAge().getDay() + "/" + student.getAge().getMonth() + "/" + student.getAge().getYear()); //print the message
        age.setYear(1991); //modifying the value of year
        System.out.println("Student age after modification: " + student.getAge().getDay() + "/" + student.getAge().getMonth() + "/" + student.getAge().getYear()); //print the message
    }
}
