import java.sql.*; //importing package for connecting to mysql database

public class App { //class name should be same as file name

    public static void main(String[] args) { //main method
        
        try { //try block
            Class.forName("com.mysql.cj.jdbc.Driver"); //loading driver
            Connection con=
        DriverManager.getConnection("jdbc:mysql://localhost:3306/JDBC_Demo","root","Mayank@1993"); //creating connection using DriverManager to connect to mysql database
            Statement stmt=con.createStatement(); //creating statement to execute query
            ResultSet rs=stmt.executeQuery("Select * from JDBC_Demo.student LIMIT 10;"); //executing query
            System.out.println("following records are fetched"); //printing message that records are fetched successfully
            while(rs.next()) //iterating result set
            {
                System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getFloat(4)); //printing result set
            }
            con.close(); //closing connection
        }catch(Exception e) //catch block
        {
            System.out.println(e); //printing exception
        }
    }
}

/* In the above program, we have used following classes and methods to connect to mysql database and fetch records from student table of JDBC_Demo database:*/