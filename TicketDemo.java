class Ticket{
    //non-static(instance member)
    int number;
    //static(class member)
    static int counter;
    static{
        counter=0;
    }
    //constructor
    public Ticket(){
        number=++counter;
    }
    public void showTicketNo(){
        System.out.println("Ticket No: "+number);
    }
    public static int getCounter(){
        return counter;
    }
}
class TicketDemo{
    public static void main(String[] args) {
        System.out.println("creating some ticket objects");
        Ticket t1=new Ticket();
        Ticket t2=new Ticket();
        Ticket t3=new Ticket();
        t1.showTicketNo();
        t2.showTicketNo();
        t3.showTicketNo();
        System.out.println("Total tickets sold: "+Ticket.getCounter());
        System.out.println("Total tickets number: "+Ticket.counter);
    }
}