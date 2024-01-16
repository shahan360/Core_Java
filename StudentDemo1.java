import java.util.Scanner;
class Student{
    //instance attributes
    private int rollno;
    private String name;
    private String course;
    private int fees;

    //behaviours(methods)
    public void setData(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter student details");
        rollno=sc.nextInt();
        name=sc.next();
        course=sc.next();
        fees=sc.nextInt();
    }
    public void getData(){
        System.out.println(rollno+" "+name+" "+course+" "+fees);
    }
}
class StudentDemo1{
    public static void main(String[] args) {
        Student[] s=new Student[3]; //array of Student type ref_variable
        int i;
        for(i=0;i<s.length;i++){
            s[i]=new Student(); //creating object
            s[i].setData();
        }
        for(i=0;i<s.length;i++){
            s[i].getData();
        }
    }
}