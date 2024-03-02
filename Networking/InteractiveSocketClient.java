import java.io.*; // Importing the input-output package for the BufferedReader and PrintWriter classes
import java.net.*; // Importing the networking package for the Socket class and the ServerSocket class

public class InteractiveSocketClient { // Class declaration
    public static void main(String arr[]) { // Main method declaration
        try{ // Try block to handle the exceptions
            System.out.println("Sending connection request..."); // Print statement to indicate the start of the client program
            Thread.sleep(5000); // Sleep for 5 seconds
            Socket s = new Socket("localhost", 2000); // Creating a socket object and connecting it to the server at port 2000
            Thread.sleep(2000); // Sleep for 2 seconds
            System.out.println("Request granted, sending message to the server..."); // Print statement to indicate that the connection has been established and the client is sending a message to the server

            PrintWriter out = new PrintWriter(s.getOutputStream()); // Creating a PrintWriter object to send the message to the server
            Thread.sleep(5000); // Sleep for 5 seconds
            out.println("Hello Server, I am the client."); // Sending the message to the server saying "Hello Server, I am the client."
            out.flush(); // Flush the output stream
            System.out.println("Message sent to the server. Waiting for the server's acknowledgement..."); // Print statement to indicate that the message has been sent and the client is waiting for the server's acknowledgement

            BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream())); // Creating a BufferedReader object to read the acknowledgement from the server
            String msg = br.readLine(); // Reading the acknowledgement from the server
            Thread.sleep(1000); // Sleep for 1 second
            System.out.println("Server sent the following acknowledgement: " + msg); // Print statement to display the acknowledgement received from the server

            Thread.sleep(5000); // Sleep for 5 seconds
            s.close(); // Close the connection
            System.out.println("Connection closed."); // Print statement to indicate that the connection has been closed
        }catch(Exception e){ // Catch block to handle the exceptions
            System.out.println(e); // Print the exception
        }
    }
}

/* The above program is a client program that connects 
to the server program (InteractiveServerSocket.java) and 
sends a message to the server. The client then waits for 
the server's acknowledgement and closes the connection. */