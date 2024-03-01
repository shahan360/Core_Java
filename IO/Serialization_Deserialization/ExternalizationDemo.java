import java.io.*; //for Externalizable, ObjectInput, ObjectOutput, IOException, ClassNotFoundException this package is required

class Emp implements Externalizable //Externalizable is a marker interface which is used to customize the serialization process
{
    int id; //instance variable
    String name; //instance variable
    int salary; //instance variable
    
    public Emp() //default constructor
    {
        System.out.println("Default Constructor invoked"); //default constructor is called when object is deserialized
    }

    public Emp(int id, String name, int salary) //parameterized constructor made to initialize the instance variables
    {
        this.id = id; //this keyword is used to refer to the current object
        this.name = name; //this keyword is used to refer to the current object
        this.salary = salary; //this keyword is used to refer to the current object
    }

    public void show() //method to display the details of the employee
    {
        System.out.println(id+" "+name+" "+salary); //displaying the details of the employee
    }

    //when object is serialized, writeExternal() method is called
    public void writeExternal(ObjectOutput out) throws IOException //IOException is a checked exception
    {
        out.writeInt(id); //writing the id to the file
        out.writeObject(name); //writing the name to the file
        System.out.println("writeExternal() method invoked"); //displaying the message
    }

    //when object is deserialized, readExternal() method is called
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException //IOException and ClassNotFoundException are checked exceptions
    {
        id = (int)in.readInt(); //reading the id from the file
        name = (String)in.readObject(); //reading the name from the file
        System.out.println("readExternal() method invoked"); //displaying the message
    }
}

public class ExternalizationDemo { //class to test the serialization and deserialization of the object
    public static void main(String[] args) { //main method
        try{ //try block to handle the exceptions
            Emp e = new Emp(101,"abc",10000); //creating the object of Emp class
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("emp1.ser")); //creating the object of ObjectOutputStream class
            out.writeObject(e); //writing the object to the file
            Thread.sleep(2000); //thread is put to sleep for 2000 milliseconds
            System.out.println("Serialization done successfully"); //displaying the message
            System.out.println("**********************"); //displaying the message
            ObjectInputStream in = new ObjectInputStream(new FileInputStream("emp1.ser")); //creating the object of ObjectInputStream class
            Emp p = (Emp)in.readObject(); //reading the object from the file
            p.show(); //displaying the details of the employee
        }catch(Exception e) //catch block to handle the exceptions
        {
            System.out.println(e); //displaying the exception
        }
    }
}
