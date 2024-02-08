class Course{
    String course;
    public Course(String course){
        this.course=course;
    }
}

class Student implements Cloneable{
    int rollno;
    String name;
    Course c; //has-a relationship
    public Student(int rollno, String name, Course c){
        this.rollno=rollno;
        this.name=name;
        this.c=c;
    }
    public void show(){
        System.out.println("Roll No: "+rollno+" Name: "+name+" Course: "+c.course);
    }
    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }
}

public class ShallowDemo {
    public static void main(String[] args) throws CloneNotSupportedException {
        System.out.println("Creating a Course class object");
        Course c=new Course("Hibernate");
        System.out.println("Creating a Student class object & assigning the course to it");
        Student s=new Student(101,"Raj",c);
        System.out.println("Details of Object to be cloned");
        s.show();
        Student temp=(Student)s.clone();
        System.out.println("Details of Cloned Object");
        temp.show();
        temp.c.course="Spring";
        System.out.println("*******************");
        s.show();
        temp.show();
    }
}
