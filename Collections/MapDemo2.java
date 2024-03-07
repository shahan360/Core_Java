import java.util.*; // HashMap, Map, Set, Iterator collection classes are present in this package

public class MapDemo2 { // Map is an interface and HashMap is its class
    public static void main(String[] args) { //main method starts
        HashMap hm = new HashMap<>(); //creating object hm of HashMap class using HashMap class
        hm.put("mohit","developer"); //adding elements to the hashmap
        hm.put("shashank","analyst"); //adding elements to the hashmap
        hm.put("akash","manager"); //adding elements to the hashmap
        Scanner sc = new Scanner(System.in); //creating object sc of Scanner class
        while(true) //infinite while loop runs until the user enters "end"
        {
            System.out.println("Enter the name to find the designation, end to terminate"); //printing the message
            String key = sc.next(); //reading the input from the user using sc.next() method 
            if(key.equals("end")) //checking if the user has entered "end"
            {
                break; //if the user has entered "end" then the loop breaks
            }
            System.out.println("The designation of " + key + " is " + hm.get(key)); //printing the designation of the key using hm.get(key) method
        }
    }
}

/* In the above program, we have created a HashMap object hm and added some elements to it. 
Then we have created an object sc of Scanner class. Then we have created an infinite while loop which runs until the user enters "end".
Inside the while loop, we are asking the user to enter the name to find the designation and then we are reading the input from the user using sc.next() method.
Then we are checking if the user has entered "end" and if yes then the loop breaks. If the user has not entered "end" then we are printing the designation of the key using hm.get(key) method. */