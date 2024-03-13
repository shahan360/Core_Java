import java.sql.*; //importing package for connecting to mysql database
import java.util.*; //importing package for scanner class

public class InsertApp { //class name should be same as file name
    public static void main(String[] args) { //main method
        try{
            Class.forName("com.mysql.cj.jdbc.Driver"); //loading driver com.mysql.cj.jdbc.Driver for mysql database
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/JDBC_Demo","root","Mayank@1993"); //creating connection using DriverManager to connect to mysql database
            PreparedStatement pstmt=con.prepareStatement("insert into student(id, name, course, marks) values(?,?,?,?)"); //creating prepared statement to execute query
            Scanner sc=new Scanner(System.in); //creating scanner class object
            while(true) //infinite loop
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
                pstmt.executeUpdate(); //executing prepared statement
                System.out.println("Do you want to insert more records? yes/no"); //printing message to ask user if he wants to insert more records
                String choice=sc.next(); //reading choice
                if(choice.equals("no")) //if answer is no
                {
                    break; //break the loop
                }
            }
            con.close(); //closing connection
            sc.close(); //closing scanner class object
        }catch(Exception e) //catch block
        {
            System.out.println(e); //printing exception
        }
    }
}

/* In the above program we are doing insert operation in 
student table of JDBC_Demo database. We are using prepared 
statement to execute query. We are using scanner class to take 
input from user. We are using infinite loop to insert multiple 
records. We are closing connection and scanner class object after 
inserting records.
Below are the steps followed in the above program:
1. Loading driver: We are loading com.mysql.cj.jdbc.Driver driver
for mysql database using Class.forName() method.
2. Creating connection: We are creating connection using
DriverManager.getConnection() method to connect to mysql database.
3. Creating prepared statement: We are creating prepared statement
using prepareStatement() method to execute query.
4. Taking input from user: We are taking input from user using
scanner class object.
5. Inserting records: We are inserting records in student table
of JDBC_Demo database using prepared statement.
6. Closing connection: We are closing connection using close()
method.
7. Closing scanner class object: We are closing scanner class
object using close() method.
*/
