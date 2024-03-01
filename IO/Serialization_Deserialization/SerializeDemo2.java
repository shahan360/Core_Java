import java.io.*;

class Employee2 implements Serializable
{
    int id;
    static String name;
    transient int salary;
    // int tel;
    // private static final long serialVersionUID = 1L;

    public Employee2(int id, String name, int salary){
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public void show()
    {
        System.out.println("Id: "+id+" Name: "+name+" Salary: "+salary);
    }
}

public class SerializeDemo2 {
    public static void main(String[] args) {
        try{
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("emp1.ser"));
            System.out.println("Creating some Employee class objects");
            Employee2 emp1 = new Employee2(1, "John", 1000);
            Employee2 emp2 = new Employee2(2, "Martin", 2000);
            System.out.println("Details of Employee Objects to be serialized");
            emp1.show();
            emp2.show();
            out.writeObject(emp1);
            out.writeObject(emp2);
            Thread.sleep(2000);
            System.out.println("Employee objects serialized successfully");
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
