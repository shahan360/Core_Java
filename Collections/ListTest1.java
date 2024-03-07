import java.util.*; //importing this package to use List and ArrayList classes for this program

class Student //creating a class Student
{
    String name,course; //creating instance variables name and course of String type
    int fees; //creating instance variable fees of int type
    public Student(String name, String course, int fees) //parameterized constructor of Student class
    {
        this.name = name; //initializing the instance variable name with the value of parameter name
        this.course = course; //initializing the instance variable course with the value of parameter course
        this.fees = fees; //initializing the instance variable fees with the value of parameter fees
    }

    public void show() //creating a method show to display the details of the student
    {
        System.out.println(name + " " + course + " " + fees); //printing the details of the student
    }
}


public class ListTest1 { //creating a class ListTest1
    public static void main(String[] args) { //main method starts
        List<Student> list = new ArrayList<Student>(); //creating object list of List interface and ArrayList class and keeping Student as the failsafe type
        list.add(new Student("A", "Java", 1000)); //adding elements to the list using add method of List interface
        list.add(new Student("B", "Python", 2000)); //adding elements to the list using add method of List interface
        list.add(new Student("C", "C++", 3000)); //adding elements to the list using add method of List interface
        System.out.println("There are " + list.size() + " elements in the list"); //printing the number of elements in the list
        Iterator<Student> itr = list.iterator(); //creating object itr of Iterator class to get the elements of the list
        while(itr.hasNext()) //using hasNext method of Iterator class to check if there are more elements in the list
        {
            Student s = (Student)itr.next(); //using next method of Iterator class to get the next element of the list and storing it in s
            s.show(); //calling the show method of Student class to display the details of the student
        }
        Student temp = new Student("D", "C", 4000); //creating object temp of Student class to store the details of student D
        System.out.println("Details of student D as temp are added to the list"); //printing a message
        temp.show(); //calling the show method of Student class to display the details of the student
        System.out.println("Searching of temp in the list: " + list.contains(temp)); //printing the result of searching temp in the list using list.contains method
    }
}

/* The above program demonstrates the use of List interface and ArrayList class.
In the above program, we have created a list and added elements A, B and C to it using add method of List interface. 
Then we have used iterator method of List interface to get the elements of the list and displayed the details of the students using the show method of Student class.
Then we have created an object temp of Student class to store the details of student D and added it to the list using add method of List interface.
Then we have displayed the details of student D using the show method of Student class and searched for temp in the list using list.contains method.*/