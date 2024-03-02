import java.io.*; //package imported for BufferedReader and InputStreamReader classes
import java.net.*; //package imported for DatagramSocket, DatagramPacket and InetAddress classes

public class DatagramSender { //class declaration for DatagramSender
    public static void main(String s[]) { //main method declaration
        try{ //try block to handle the exception
            DatagramSocket sender = new DatagramSocket(3000); //creating the object of DatagramSocket class and passing the port number as an argument
            System.out.println("Datagram Sender is ready."); //printing the message Datagram Sender is ready.

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); //creating the object of BufferedReader class and passing the object of InputStreamReader class as an argument to get the input from the user

            while(true){ //while loop to execute the block of code until the condition is true
                System.out.println("Enter the message, (end to terminate): "); //printing the message Enter the message, (end to terminate):
                String msg = br.readLine(); //reading the message from the user and storing it in the variable msg

                DatagramPacket packet = new DatagramPacket(msg.getBytes(), msg.length(), InetAddress.getLocalHost(), 4000); //creating the object of DatagramPacket class and passing the message, length of the message, IP address and port number as an argument to send the message to the receiver
                sender.send(packet); //sending the message to the receiver using the send() method

                if(msg.equals("end")){ //if statement to check if the message is end then terminate the sender
                    System.out.println("Terminating the sender."); //printing the message Terminating the sender.
                    break; //terminating the sender
                }

                System.out.println("Message sent successfully."); //printing the message Message sent successfully.
            }
            sender.close(); //closing the sender using the close() method
        }catch(Exception e){ //catch block to handle the exception
            System.out.println(e); //printing the exception
        }
    }
}

/* The above program is a Java Datagram Sender program that sends the message to the receiver 
using the DatagramSocket and DatagramPacket classes. The sender sends the message to the receiver 
using the send() method. The sender sends the message to the receiver using the IP address and port number. 
The sender sends the message to the receiver until the user enters the message as end. The sender terminates 
after the user enters the message as end. */
