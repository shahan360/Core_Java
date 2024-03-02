import java.io.*; // Importing the input-output package for the BufferedReader and PrintWriter classes
import java.net.*; // Importing the networking package for the Socket class and the ServerSocket class

public class InteractiveServerSocket { // Class declaration
    public static void main(String s[]) { // Main method declaration
        try{ // Try block to handle the exceptions
            ServerSocket server = new ServerSocket(2000); // Creating a server socket object and binding it to port 2000
            System.out.println("Server is started and waiting for the client to send connect request..."); // Print statement to indicate that the server is running and waiting for the client to send a connection request
            Socket t=server.accept(); // Accepting the connection request from the client
            System.out.println("Client has sent the connection request. Server is now ready to accept the message from the client..."); // Print statement to indicate that the client has sent the connection request and the server is ready to accept the message from the client

            BufferedReader br = new BufferedReader(new InputStreamReader(t.getInputStream())); // Creating a BufferedReader object to read the message from the client
            String msg = br.readLine(); // Reading the message from the client
            Thread.sleep(3000); // Sleep for 3 seconds
            System.out.println("Client sent the following message: " + msg); // Print statement to display the message received from the client
            Thread.sleep(2000); // Sleep for 2 seconds

            System.out.println("Sending acknowledgement to the client..."); // Print statement to indicate that the server is sending an acknowledgement to the client

            PrintWriter out = new PrintWriter(t.getOutputStream()); // Creating a PrintWriter object to send the acknowledgement to the client
            Thread.sleep(5000); // Sleep for 5 seconds
            out.println("Hello Client, I am the server. Your message has been received."); // Sending the acknowledgement to the client
            out.flush(); // Flush the output stream
            System.out.println("Acknowledgement sent to the client. Waiting for the client to close the connection..."); // Print statement to indicate that the acknowledgement has been sent and the server is waiting for the client to close the connection

            Thread.sleep(2000); // Sleep for 2 seconds
            System.out.println("Connection closed."); // Print statement to indicate that the connection has been closed
        }catch(Exception e){ // Catch block to handle the exceptions
            System.out.println(e); // Print the exception
        }
    }
}

/* The above program is a server program that waits for the 
client to send a connection request. After the client sends 
the connection request, the server accepts the connection 
and waits for the client to send a message. The server then 
reads the message from the client, sends an acknowledgement 
to the client, and waits for the client to close the connection. */