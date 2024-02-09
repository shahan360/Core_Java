class Course implements Cloneable
{
    String course;
    public Course(String course)
    {
        this.course=course;
    }
    public Object clone() throws CloneNotSupportedException
    {
        return super.clone();
    }
}

class Student implements Cloneable
{
    int rollno;
    String name;
    Course c; //has-a relationship
    public Student(int rollno, String name, Course c)
    {
        this.rollno=rollno;
        this.name=name;
        this.c=c;
    }

    public void show()
    {
        System.out.println(rollno+" "+name+" "+c.course);
    }

    public Object clone() throws CloneNotSupportedException
    {
        //Deep Cloning
        Student r=(Student)super.clone();
        r.c=(Course)r.c.clone();
        return r;
    }

}

public class DeepCloningDemo{
    public static void main(String[] args) throws CloneNotSupportedException
    {
        System.out.println("Creating a Course Class Object");
        Course c=new Course("Hibernate");
        System.out.println("Creating a Student Class Object and assigning the c course of Course class to it");
        Student s=new Student(101,"abc",c);
        System.out.println("Details of the Object which is to be cloned");
        s.show();
        Student temp=(Student)s.clone();
        System.out.println("Details of the Cloned Object");
        temp.show();
        temp.c.course="Spring";
        System.out.println("***********************");
        s.show();
        temp.show();
    }
}