class Age //class named as Age starts here
{
    int day,month,year; //instance variables of integer type named as day, month and year
    public void setDay(int day) //method to set the day of the age object
    {
        this.day=day; //this keyword is used to refer to the current object
    }
    public int getDay() //method to get the day of the age object
    {
        return day; //returning the value of day
    }
    public void setMonth(int month) //method to set the month of the age object
    {
        this.month=month; //this keyword is used to refer to the current object
    }
    public int getMonth() //method to get the month of the age object
    {
        return month; //returning the value of month
    }
    public void setYear(int year) //method to set the year of the age object
    {
        this.year=year; //this keyword is used to refer to the current object
    }
    public int getYear() //method to get the year of the age object
    {
        return year; //returning the value of year
    }
}

final class Student //final class named as Student starts here and it is made final so that it cannot be inherited
{
    final int rollNo; //instance variable of integer type named as rollNo and it is made final so that it cannot be modified
    final String name; //instance variable of string type named as name and it is made final so that it cannot be modified
    final Age age; //instance variable of Age class named as age and it is made final so that it cannot be modified
    public Student(int rollNo, String name, Age age) //constructor of Student class with three arguments rollNo, name and age
    {
        this.rollNo=rollNo; //this keyword is used to refer to the current object
        this.name=name; //this keyword is used to refer to the current object
        this.age=age; //this keyword is used to refer to the current object
    }
    public int getrollNo() //method to get the rollNo of the student
    {
        return rollNo; //returning the value of rollNo
    }
    public String getName() //method to get the name of the student
    {
        return name; //returning the value of name
    }
    public Age getAge() //method to get the age of the student
    {
        return age; //returning the value of age
    }   
}

public class ImmutableClassDemo2 {
    public static void main(String[] args) //main method starts here with void return type and argument as string array
    {
        System.out.println("Creating an object of Age class"); //print statement to print the message of creating an object of Age class
        Age age=new Age(); //creating an object of Age class with reference variable named as age
        age.setDay(15); //setting the day of age object to 15
        age.setMonth(2); //setting the month of age object to 2
        age.setYear(2024); //setting the year of age object to 2024
        System.out.println("Creating an object of Immutable Student class and assigning age to it"); //print statement to print the message of creating an object of Immutable Student class and assigning age to it
        Student student=new Student(101,"Alex",age); //creating an object of Immutable Student class with reference variable named as student and passing the values of rollNo, name and age to it
        System.out.println("Student's age year before modification = "+student.getAge().getYear()); //print statement to print the message of student's age year before modification
        age.setYear(2023); //setting the year of age object to 2023
        System.out.println("Student's age year after modification = "+student.getAge().getYear()); //print statement to print the message of student's age year after modification
    }
}
