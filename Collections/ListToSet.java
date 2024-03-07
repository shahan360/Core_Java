import java.util.*; //importing java.util package for List, ArrayList, Set, HashSet

public class ListToSet { //class declaration
    public static void main(String[] args) { //main method starts
        //Creating a list
        List<String> myList = new ArrayList<>(); //creating an instance 'myList' of ArrayList using List interface
        myList.add("mohit"); //adding elements to the list
        myList.add("shashank"); //adding elements to the list
        myList.add("akash"); //adding elements to the list
        myList.add("mohit"); //Adding duplicate element to the list

        //Displaying the original list
        System.out.println("Original List: " + myList); //printing the original list

        //Converting List to Set using Set constructor
        Set<String> mySet = new HashSet<>(myList); //creating an instance 'mySet' of HashSet using Set interface and passing 'myList' as an argument to the constructor

        //Displaying the Set
        System.out.println("Converted Set: " + mySet); //printing the set
    }
}

/* The above code demonstrates the conversion of a List to a Set using the HashSet constructor.
In this code snippet, we have created a list of strings and added some elements to it. 
Then, we have created a set using the HashSet constructor and passed the list as an 
argument to the constructor. The HashSet constructor automatically removes duplicate 
elements from the list and creates a set with unique elements.*/