/* In the below program, we have created a class Course that
contains an inner class Student. The Course class has an instance
variable course and a constructor to initialize the instance variable.
The Student class has three instance variables rollno, name, and course.
The Student class has a constructor to initialize the instance variables.
The Student class has a method show() to display the values of the instance
variables. The Student class implements the Cloneable interface. The Student
class has a clone() method that throws a CloneNotSupportedException exception.
In the main class, we have created an object of the Course class. We have
created an object of the Student class and passed the course object to it. We
have displayed the values of the object to be cloned. We have cloned the object
and stored it in a temporary object. We have displayed the values of the cloned
object. We have modified the course object of the cloned object. We have displayed
the values of the original object and the cloned object. */

class Course implements Cloneable // Cloneable is a marker interface that is used to indicate that the objects of the class can be cloned using the clone() method
{
    String course; // instance variable
    public Course(String course) // constructor
    {
        this.course = course; // this keyword is used to refer to the current object
    }

    public Object clone() throws CloneNotSupportedException // method
    {
        return super.clone(); // returning the object of the super class using clone method
    }
}

class Student implements Cloneable // Cloneable is a marker interface that is used to indicate that the objects of the class can be cloned using the clone() method
{
    int rollno; // instance variable
    String name; // instance variable
    Course course; // instance variable
    public Student(int rollno, String name, Course course) // constructor
    {
        this.rollno = rollno; // this keyword is used to refer to the current object
        this.name = name; // this keyword is used to refer to the current object
        this.course = course; // this keyword is used to refer to the current object
    }

    public void show() // method
    {
        System.out.println(rollno + " " + name + " " + course.course); // printing the values of the instance variables
    }
    // Overriding the clone() method of the Object class in the Student class to deep clone the object
    public Object clone() throws CloneNotSupportedException // method that throws CloneNotSupportedException exception
    {
        Student s = (Student)super.clone(); // super keyword is used to refer to the immediate parent class object
        s.course = (Course)course.clone(); // cloning the course object and storing it in the course object of the cloned object
        return s; // returning the object
    }
}

public class DeepCloningDemo { // main class
    public static void main(String[] args) throws CloneNotSupportedException // main method that throws CloneNotSupportedException exception
    {
        System.out.println("Creating course object"); // printing the message
        Course c = new Course("Java"); // creating an object of Course class
        System.out.println("Creating student object and assigning course object to it"); // printing the message
        Student s = new Student(101,"John",c); // creating an object of Student class and passing the course object to it
        System.out.println("Details of the object to be cloned"); // printing the message
        s.show(); // calling the show method on the object s
        Student temp = (Student)s.clone(); // cloning the object s and storing it in temp
        System.out.println("Details of the cloned object"); // printing the message
        temp.show(); // calling the show method on the object temp
        temp.course.course = "Python"; // modifying the course object of the temp object
        System.out.println("**********After modification**********"); // printing the message
        s.show(); // calling the show method on the object s
        temp.show(); // calling the show method on the object temp
    }
}
