import java.io.*; //package imported for BufferedReader and InputStreamReader classes
import java.net.*; //package imported for DatagramSocket, DatagramPacket and InetAddress classes

public class DatagramReceiver { //class declaration
    public static void main(String s[]) { //main method declaration
        try{ //try block to handle the exception
            DatagramSocket receiver = new DatagramSocket(4000); //creating the object of DatagramSocket class and passing the port number as an argument
            System.out.println("Datagram Receiver is ready, (press 'Ctrl + C' to terminate)"); //printing the message Datagram Receiver is ready, (press 'Ctrl + C' to terminate)
            while(true){ //while loop to execute the block of code until the condition is true
                System.out.println("Waiting for the message..."); //printing the message Waiting for the message...
                byte msg[] = new byte[100]; //creating the byte array of size 100
                DatagramPacket packet = new DatagramPacket(msg, 100); //creating the object of DatagramPacket class and passing the message and length of the message as an argument to receive the message from the sender
                receiver.receive(packet); //receiving the message from the sender using the receive() method
                String str = new String(packet.getData()); //creating the object of String class and passing the message as an argument to store the message in the variable str
                String st = new String(str.trim()); //creating the object of String class and passing the message as an argument to store the message in the variable st

                if(st.equals("end")){ //if statement to check if the message is end then terminate the receiver
                    System.out.println("Terminating the receiver. End packet is received."); //printing the message Terminating the receiver. End packet is received.
                    break; //terminating the receiver
                }
                System.out.println("Following packet message is received: " + st); //printing the message Following packet message is received: and the message
            }
        }catch(Exception e){ //catch block to handle the exception
            System.out.println(e); //printing the exception
        }
    }
}

/* The above program is a Java Datagram Receiver program that receives the message from the sender and prints the message.*/
