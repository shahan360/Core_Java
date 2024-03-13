import java.sql.*; //importing package for connecting to mysql database
import java.util.*; //importing package for scanner class

public class UpdateApp {
    public static void main(String[] args) {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver"); //loading driver com.mysql.cj.jdbc.Driver for mysql database
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/JDBC_Demo","root","Mayank@1993"); //creating connection using DriverManager to connect to mysql database
            PreparedStatement pstmt=con.prepareStatement("update student set name=?, course=?, marks=? where id=?"); //creating prepared statement to execute query for updating records in student table of JDBC_Demo database
            Scanner sc=new Scanner(System.in); //creating scanner class object to take input from user
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
                pstmt.setString(1, name); //setting name to prepared statement
                pstmt.setString(2, course); //setting course to prepared statement
                pstmt.setFloat(3, marks); //setting marks to prepared statement
                pstmt.setInt(4, id); //setting id to prepared statement
                pstmt.executeUpdate(); //executing prepared statement
                System.out.println("Do you want to update more records? yes/no"); //printing message to ask user if he wants to update more records
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
