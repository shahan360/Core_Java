import java.util.*; //This is the package where List collection type is present and we are importing all the classes of this package

public class ListDemo3 { //This is the class where we are using List collection type
    public static void main(String[] args) { //This is the main method where we are creating a List and adding some elements to it
        ArrayList list = new ArrayList<>(); //Here we are creating a List of type ArrayList but we are not using List interface
        list.add("Andy"); //Here we are adding some elements to the List
        list.add("Bob"); //Here we are adding some elements to the List
        list.add("Chris"); //Here we are adding some elements to the List
        list.add("Daisy"); //Here we are adding some elements to the List
        list.add("Emily"); //Here we are adding some elements to the List
        list.add(1,"Fiona"); //Here we are adding element "Fiona" at a specific index 1
        list.add("Shaun"); //Here we are adding some elements to the List
        System.out.println("There are " + list.size() + " elements in the list"); //Here we are printing the size of the List using list.size() method
        System.out.println(list); //Here we are printing the complete List
        System.out.println("Searching of Daisy in the list: " + list.contains("Daisy")); //Here we are searching for an element in the List using list.contains() method
        System.out.println("Removing Daisy from the list"); //Here we are removing an element from the List using list.remove() method
        list.remove("Daisy"); //Here we are removing an element from the List using list.remove() method
        System.out.println("After removing Daisy search result: " + list.contains("Daisy")); //Here we are searching for an element in the List using list.contains() method
        System.out.println(list); //Here we are printing the complete List
    }
}

/* The above program demonstrates the use of ArrayList class to create a List 
and add some elements to it. We have used various methods of ArrayList class like 
size(), contains(), remove() to perform some operations on the List. */