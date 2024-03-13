import java.sql.*; //importing package for connecting to mysql database
import java.util.*; //importing package for scanner class for taking input from user

public class BatchProcessApp {
    public static void main(String[] args) {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver"); //loading driver com.mysql.cj.jdbc.Driver for mysql database
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/JDBC_Demo","root","Mayank@1993"); //creating connection using DriverManager to connect to mysql database
            PreparedStatement pstmt=con.prepareStatement("insert into student(id, name, course, marks) values(?,?,?,?)"); //creating prepared statement to execute query
            Scanner sc=new Scanner(System.in); //creating scanner class object to take input from user
            while(true)
            {
                System.out.println("Enter id: "); //printing message to enter id
                int id=sc.nextInt(); //reading id
                System.out.println("Enter name: "); //printing message to enter name
                String name=sc.next(); //reading name
                System.out.println("Enter course: "); //printing message to enter course
                String course=sc.next(); //reading course
                System.out.println("Enter marks: "); //printing message to enter marks
                float marks=sc.nextFloat(); //reading marks
                pstmt.setInt(1, id); //setting id to prepared statement
                pstmt.setString(2, name); //setting name to prepared statement
                pstmt.setString(3, course); //setting course to prepared statement
                pstmt.setFloat(4, marks); //setting marks to prepared statement
                pstmt.addBatch(); //adding query to batch so that it can be executed in a single go
                System.out.println("Record inserted successfully"); //printing message that record is inserted successfully
                System.out.println("Do you want to insert more records? yes/no"); //printing message to ask user if he wants to insert more records
                String choice=sc.next(); //reading choice
                if(choice.equals("no")) //if answer is no
                {
                    break; //break the loop
                }
            }
            pstmt.executeBatch(); //executing all inserted queries in batch
            con.close(); //closing connection
            sc.close(); //closing scanner class object
        }catch(Exception e) //catch block
        {
            System.out.println(e); //printing exception
        }
    }
}
