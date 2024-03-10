import java.util.*; //importing this package to use Set and HashSet classes for this program

class Student
{
    String name,course;
    int fees;
    public Student(String name, String course, int fees) //parameterized constructor
    {
        this.name = name; //initializing name
        this.course = course; //initializing course
        this.fees = fees; //initializing fees
    }

    public void show() //method to display the details of the student
    {
        System.out.println(name+" "+course+" "+fees); //printing the details of the student
    }

    public boolean equals(Object o) //overriding the equals method of Object class to compare the name, course and fees of the current object with the name, course and fees of the object ref
    {
        System.out.println("*************************");
        Student ref = (Student)o; //downcasting the object o to Student class and storing it in ref
        return name.equals(ref.name) && course.equals(ref.course) && fees == ref.fees; //comparing the name, course and fees of the current object with the name, course and fees of the object ref
    }

    public int hashCode() //overriding the hashCode method of Object class to return the hash code of the object
    {
        return name.hashCode()+course.hashCode()+fees; //returning the hash code of the object
    }
}

public class SetTest1Sol {
    public static void main(String[] args) {
        Set<Student> set = new HashSet<>(); //creating object set of HashSet class and using Student class as the type of the set
        set.add(new Student("A","Java",1000)); //adding elements to the set using add method of Set interface
        set.add(new Student("B","C++",2000)); //adding elements to the set using add method of Set interface
        set.add(new Student("C","Python",3000)); //adding elements to the set using add method of Set interface
        System.out.println("There are "+set.size()+" elements in the set"); //printing the number of elements in the set using size method of Set interface
        Iterator itr = set.iterator(); //creating object itr of Iterator class and setting it to the iterator of the set
        while(itr.hasNext()) //using hasNext method of Iterator class to check if there are more elements in the set
        {
            Student s = (Student)itr.next(); //downcasting the object returned by next method of Iterator class to Student class and storing it in s
            System.out.println(s.hashCode()); //printing the hash code of the object s
            s.show(); //calling show method of Student class to display the details of the student
        }

        Student temp = new Student("B","C++",9000); //creating object temp of Student class and initializing it with the details of the student
        System.out.println("Details of the student temp"); //printing a message
        System.out.println(temp.hashCode()); //printing the hash code of the object temp
        temp.show(); //calling show method of Student class to display the details of the student
        System.out.println("Is the student temp present in the set? "+set.contains(temp)); //checking if the set contains the student temp using contains method of Set interface
    }
}

/* The above program demonstrates the use of Set interface and HashSet class.
In the above program we are folllowing the below steps:
1. We have created a set and added elements A, B and C to it using add method of Set interface.
2. Then we have used size method of Set interface to get the number of elements in the set.
3. Also to note that in Student class we have overriden the equals method to compare the name, course and fees of the current object with the name, course and fees of the object ref.
3. In the Student class we have also overriden the hashCode method to return the hash code of the object.
4. Then we have set itr to the iterator of the set and used hasNext and next methods of Iterator class to get the elements of the set and display their details.
5. Then we have created an object temp of Student class and initialized it with the details of the student.
6. We have printed the hash code of the object temp and called the show method of Student class to display the details of the student.
7. We have checked if the set contains the student temp using contains method of Set interface.*/
