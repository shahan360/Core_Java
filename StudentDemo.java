import java.util.Scanner;
class Student{
    //instance attributes
    private int rollNo;
    private String name;
    private String course;
    private int fees;

    //behaviors(methods)
    public void setData(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter student details");
        rollNo=sc.nextInt();
        name=sc.next();
        course=sc.next();
        fees=sc.nextInt();
    }
    public void getData(){
        System.out.println(rollNo+" "+name+" "+course+" "+fees);
    }
}    
class StudentDemo{
    public static void main(String[] args) {
        Student s1=new Student();
        s1.setData();
        s1.getData();
    }
}   