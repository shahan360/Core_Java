import java.util.*; //This is the package where List collection type is present and we are importing all the classes of this package

public class ListDemo1 { //This is the class where we are using List collection type
    public static void main(String[] args) { //This is the main method where we are creating a List and adding some elements to it
        // List list = new ArrayList<>(); //Here we are creating a List of type ArrayList
        ArrayList list = new ArrayList<>();
        list.add("Andy"); //Here we are adding some elements to the List
        list.add("Bob"); //Here we are adding some elements to the List
        list.add("Chris"); //Here we are adding some elements to the List
        list.add("Daisy"); //Here we are adding some elements to the List
        list.add("Emily"); //Here we are adding some elements to the List
        list.add(1,"Fiona"); //Here we are adding element "Fiona" at a specific index 1
        list.add("Shaun"); //Here we are adding some elements to the List
        System.out.println(list); //Here we are printing the complete List
        System.out.println("*********************************"); //giving a line break
        Iterator itr=list.iterator(); //Here we are creating an Iterator object to iterate through the List
        while(itr.hasNext()){ //running a while loop to iterate through the List
            System.out.println(itr.next()); //using itr.next() to get the next element of the List
        }
        System.out.println("*********************************"); //giving a line break after the while loop
        for(Object s:list){ //running a for loop to iterate through the List
            System.out.println(s.toString()); //using s.toString() to get the next element of the List
        System.out.println("*********************************"); //giving a line break after the for loop
        list.forEach(ele->System.out.println(ele)); //lambda expression to iterate through the List   
        }
    }
}

/* In the above program, we have created a List of type ArrayList 
and added some elements to it. We have used Iterator, for loop and 
lambda expression to iterate through the List and print the elements. */ 
