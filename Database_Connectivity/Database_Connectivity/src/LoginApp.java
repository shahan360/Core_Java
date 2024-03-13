import java.sql.*; //importing package for connecting to mysql database
import java.util.*; //importing package for scanner class

public class LoginApp {
    /**
     * @param args
     */
        public static void main(String[] args) {
            try{
                Class.forName("com.mysql.cj.jdbc.Driver"); //loading driver com.mysql.cj.jdbc.Driver for mysql database
                Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/JDBC_Demo","root","Mayank@1993"); //creating connection using DriverManager to connect to mysql database
                PreparedStatement pstmt=con.prepareStatement("select * from login where username=? and password=?"); //creating prepared statement to execute query for deleting records in student table of JDBC_Demo database
                Scanner sc=new Scanner(System.in); //creating scanner class object to take input from user
                System.out.println("Enter username: "); //printing message to enter id
                String username=sc.next(); //reading id
                System.out.println("Enter password: "); //printing message to enter id
                String password=sc.next(); //reading id
                pstmt.setString(1, username); //setting id to prepared statement
                pstmt.setString(2, password); //setting id to prepared statement
                ResultSet rs=pstmt.executeQuery(); //executing prepared statement
                if(rs.next()) //iterating result set
                {
                    System.out.println(rs.getString("1")+"Login successful");
                }
                else
                {
                    System.out.println("Login failed. Invalid username or password. Please try again.");
                }
                con.close(); //closing connection
                sc.close(); //closing scanner class object
            }catch(Exception e) //catch block
            {
                System.out.println(e); //printing exception
            }
        }
    } // <-- Added closing brace here

/* The above program is used to connect to mysql database 
and fetch records from login table of JDBC_Demo database. 
It takes username and password as input from user and 
checks if the username and password are valid or not. 
If the username and password are valid, then it prints 
"Login successful" otherwise it prints "Login failed. 
Invalid username or password. Please try again." */   