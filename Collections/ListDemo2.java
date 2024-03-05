import java.util.*; //This is the package where List collection type is present and we are importing all the classes of this package

public class ListDemo2 { //This is the class where we are using List collection type
    public static void main(String[] args) { //This is the main method where we are creating a List and adding some elements to it
        // List list = new ArrayList<>(); //Here we are creating a List of type ArrayList but we are using List interface
        ArrayList list = new ArrayList<>(); //Here we are creating a List of type ArrayList but we are not using List interface
        list.add("Andy"); //Here we are adding some elements to the List
        list.add("Bob"); //Here we are adding some elements to the List
        list.add("Chris"); //Here we are adding some elements to the List
        list.add("Daisy"); //Here we are adding some elements to the List
        list.add("Emily"); //Here we are adding some elements to the List
        list.add(1,"Fiona"); //Here we are adding element "Fiona" at a specific index 1
        list.add("Shaun"); //Here we are adding some elements to the List
        Iterator itr=list.iterator(); //Here we are creating an Iterator object to iterate through the List
        while(itr.hasNext()){ //running a while loop to iterate using itr.hasNext() which returns true if there are more elements in the List to print list in forward order
            System.out.println(itr.next()); //using itr.next() to get the next element of the List and print it
        }
        ListIterator ltr=list.listIterator(list.size()); //Here we are creating a ListIterator object to iterate through the List and we are passing the size of the List as the parameter
        System.out.println("*********************************"); //giving a line break
        while(ltr.hasPrevious()){ //running a while loop to iterate using ltr.hasPrevious() which returns true if there are more elements in the List to print list in reverse order
            System.out.println(ltr.previous()); //using ltr.previous() to get the previous element of the List and print it
        }
    }

}

/* In the above program we are demonstrating the use of ListIterator to iterate through the List in forward and reverse order.
We have created a List of type ArrayList and added some elements to it. We have used Iterator to iterate through the List in 
forward order and ListIterator to iterate through the List in reverse order. */