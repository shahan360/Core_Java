/* In the below program, we have created a Ticket class with 
two variables no and counter. The variable no is an instance 
variable and the variable counter is a static variable. The 
class has a constructor to initialize the instance variable no. 
The class has a method showTicketNo() to display the ticket number. 
The class has a static method getCounter() to return the value of the 
static variable counter. In the main class TicketDemo, we have created 
three objects of the Ticket class and displayed the ticket number using 
the showTicketNo() method. We have also displayed the total number of 
tickets using the getCounter() method and the counter variable. */

class Ticket
{
    //non-static(Instance member) variable
    int no;
    //static variable (class member)
    static int counter;
    static{
        counter = 0;
    }
    //Constructor to initialize the instance variable no
    public Ticket()
    {
        no = ++counter;
    }
    //Method to display the ticket number
    public void showTicketNo()
    {
        System.out.println("Ticket no: " + no);
    }
    //Method to display the counter value
    public static int getCounter()
    {
        return counter;
    }

}

public class TicketDemo { // Main class
    public static void main(String[] args) { // Main method
        System.out.println("Creating some tickets objects"); // Print statement to show the message about creating ticket objects
        Ticket t1 = new Ticket(); // Creating t1 object of Ticket class
        Ticket t2 = new Ticket(); // Creating t2 object of Ticket class
        Ticket t3 = new Ticket(); // Creating t3 object of Ticket class
        t1.showTicketNo(); // Calling showTicketNo method using t1 object
        t2.showTicketNo(); // Calling showTicketNo method using t2 object
        t3.showTicketNo(); // Calling showTicketNo method using t3 object
        System.out.println("Total tickets: " + Ticket.getCounter()); // Print statement to show the total tickets using getCounter method of Ticket class
        System.out.println("Total tickets: " + Ticket.counter); // Print statement to show the total tickets using counter variable of Ticket class
    }
}
