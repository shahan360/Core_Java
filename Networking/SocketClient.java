import java.net.*; // for Socket class this package is required

public class SocketClient { //SocketClient class is created
    public static void main(String arr[]) { // main method is created
        try{ // try block is used to handle the exception
            System.out.println("Sending the connection request to the server..."); //print the message that connection request is sent to the server
            Thread.sleep(5000); //Thread.sleep() method is used to stop the execution of the program for 5000 milliseconds
            Socket s = new Socket("localhost", 2001); //Socket class is used to create client side socket and localhost is the IP address of the server and 2000 is the port number
            Thread.sleep(2000); //Thread.sleep() method is used to stop the execution of the program for 2000 milliseconds
            System.out.println("Request granted, sending message to the server..."); //print the message that request is granted and sending the message to the server
            Thread.sleep(5000); //Thread.sleep() method is used to stop the execution of the program for 5000 milliseconds
            s.close(); //close() method is used to close the connection
            System.out.println("Connection is closed..."); //print the message that connection is closed
        }catch(Exception e){ //catch block is used to handle the exception
            System.out.println(e); //print the exception
        }
    }
}

/* The above program is a simple client program that acts as a socket client. 
this socket client program sends the connection request to the server. 
The client program is running on port number 2001
(Note: if we change the port numer to any other number then our connection 
request is going to be refused so make sure that we need to keep the port number 
at our ServerSocket and SocketClient same.). 
The client program sends the connection request to the server and waits for the 
response from the server. When the server accepts the connection request, 
the client sends the message to the server and closes the connection. */