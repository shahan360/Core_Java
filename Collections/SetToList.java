import java.util.*; //importing java.util package for List, ArrayList, Set, HashSet

public class SetToList { //class declaration
    public static void main(String[] args) { //main method starts
        //Creating a set
        Set<String> mySet = new HashSet<>(); //creating an instance 'mySet' of HashSet using Set interface
        mySet.add("mohit"); //adding elements to the set
        mySet.add("shashank"); //adding elements to the set
        mySet.add("akash"); //adding elements to the set
        mySet.add("mohit"); //Adding duplicate element to the set

        //Displaying the original set
        System.out.println("Original Set: " + mySet); //printing the original set

        //Converting Set to List using ArrayList constructor
        List<String> myList = new ArrayList<>(mySet); //creating an instance 'myList' of ArrayList using List interface and passing 'mySet' as an argument to the constructor

        //Displaying the List
        System.out.println("Converted List: " + myList); //printing the list
    }
}

/* The above code demonstrates the conversion of a Set to a List using the ArrayList constructor.
In this code snippet, we have created a set of strings and added some elements to it. 
Then, we have created a list using the ArrayList constructor and passed the set as an argument. The we printed the list.*/
