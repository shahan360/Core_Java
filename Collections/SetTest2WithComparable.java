import java.util.*; //importing this package to use Set and TreeSet classes for this program

class Student implements Comparable //implementing Comparable interface to compare the name of the current object with the name of the object ref
{
    String name,course; //declaring name and course as String type
    int fees; //declaring fees as int type
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

    public int compareTo(Object o) //overriding the compareTo method of Comparable interface to compare the name of the current object with the name of the object o
    {
        Student s = (Student)o; //downcasting the object o to Student class and storing it in s
        return name.compareTo(s.name); //comparing the name of the current object with the name of the object s
    }
}

public class SetTest2WithComparable {
    public static void main(String[] args) {
        Set<Student> set = new TreeSet<>(); //creating object set of HashSet class and using Student class as the type of the set
        set.add(new Student("A","Java",1000)); //adding elements to the set using add method of Set interface
        set.add(new Student("B","C++",2000)); //adding elements to the set using add method of Set interface
        set.add(new Student("C","Python",3000)); //adding elements to the set using add method of Set interface
        System.out.println("There are "+set.size()+" elements in the set"); //printing the number of elements in the set using size method of Set interface
        Iterator itr = set.iterator(); //creating object itr of Iterator class and setting it to the iterator of the set
        while(itr.hasNext()) //using hasNext method of Iterator class to check if there are more elements in the set
        {
            Student s = (Student)itr.next(); //downcasting the object returned by next method of Iterator class to Student class and storing it in s
            // System.out.println(s.hashCode()); //printing the hash code of the object s
            s.show(); //calling show method of Student class to display the details of the student
        }

        Student temp = new Student("B","C++",9000); //creating object temp of Student class and initializing it with the details of the student
        System.out.println("Details of the student temp"); //printing a message
        // System.out.println(temp.hashCode()); //printing the hash code of the object temp
        temp.show(); //calling show method of Student class to display the details of the student
        System.out.println("Is the student temp present in the set? "+set.contains(temp)); //checking if the set contains the student temp using contains method of Set interface
    }
}
