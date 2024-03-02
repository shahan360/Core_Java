import java.net.*; //package imported for creating InetAddress class objects

class IP_Finder //class to find the IP address of the local machine
{
	public static void main(String[] args) { //main method starts
		try{ //try block starts
			InetAddress add=InetAddress.getLocalHost(); //creating the object of InetAddress class to get the IP address of the local machine
			System.out.println("machine name="+add.getHostName()); //displaying the name of the local machine
			System.out.println("its ip="+add.getHostAddress()); //displaying the IP address of the local machine
		}catch(Exception e) //catch block starts
		{
			System.out.println(e); //displaying the exception
		}		
	}	
}

/* This program demonstrates the use of InetAddress class to find the IP address of the local machine. The InetAddress class
   is used to create the object of InetAddress class to get the IP address of the local machine. The getLocalHost() method of
   InetAddress class is used to get the IP address of the local machine. The getHostName() method of InetAddress class is used
   to get the name of the local machine. The getHostAddress() method of InetAddress class is used to get the IP address of the
   local machine. The main method of the IP_Finder class calls the getLocalHost() method of InetAddress class to get the IP
   address of the local machine and displays it. */