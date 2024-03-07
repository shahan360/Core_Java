import java.util.*; // Arrays, List collection classes are present in this package

public class ArraytoList { // List is an interface and Arrays is its class
    public static void main(String[] args) { //main method starts
        //Sample Array
        String[] array = {"mohit", "shashank", "akash", "deepak"}; //creating an array of strings

        //Converting Array to List using Arrays.asList() method
        List<String> listFromArray = Arrays.asList(array); //creating a list from the array using Arrays.asList() method

        //Printing the List resulted from Array
        System.out.println("List from Array: " + listFromArray); //printing the list resulted from the array
    }
}

/* In the above program, we have created an array of strings. Then we have created a list from the array using Arrays.asList() method. 
Then we have printed the list resulted from the array. The Arrays.asList() method is used to convert an array to a list. */