import java.net.*; // for ServerSocket and Socket class this package is required

public class ServerSocketDemo { //ServerScoketDemo class is created
    public static void main(String[] args) { // main method is created
        try{ // try block is used to handle the exception
            ServerSocket server = new ServerSocket(2001); // ServerSocket class is used to create server side socket and 2001 is the port number
            Socket t = server.accept(); //server.accept() method is used to accept the connection
            System.out.println("Request received and Connection accepted"); //print the message that request is received and connection is accepted for the client
            Thread.sleep(2000); //Thread.sleep() method is used to stop the execution of the program for 2000 milliseconds
            System.out.println("Connection is closed..."); //print the message that connection is closed
        }catch(Exception e){ //catch block is used to handle the exception
            System.out.println(e); //print the exception
        }
    }
}

/* The above program is a simple server program that accepts 
the connection request from the client. The server program is 
running on port number 2001. The server program is waiting for 
the connection request from the client. When the client sends 
the connection request, the server accepts the connection and 
prints the message that the connection is accepted. 
After that, the server closes the connection. */