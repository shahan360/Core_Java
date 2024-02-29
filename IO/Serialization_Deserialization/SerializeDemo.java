import java.io.*;

class Employee implements Serializable
{
    int id;
    String name;
    int salary;
    int telno;
    public Employee(int id,String name,int salary)
    {
        this.id=id;
        this.name=name;
        this.salary=salary;
    }

    public void show()
    {
        System.out.println("Id: "+id+" Name: "+name+" Salary: "+salary);
    }
}
public class SerializeDemo {
    public static void main(String[] args) {
        try{
            ObjectOutputStream out=new ObjectOutputStream(new FileOutputStream("emp.ser"));
            System.out.println("Creating some employees objects");
            Employee e1=new Employee(101,"abc",10000);
            Employee e2=new Employee(102,"xyz",20000);
            System.out.println("Details of employees object to be serialized");
            e1.show();
            e2.show();
            out.writeObject(e1);
            out.writeObject(e2);
            Thread.sleep(2000);
            System.out.println("Serialization done successfully");
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
