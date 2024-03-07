import java.util.*; // HashSet, TreeSet, Iterator collection classes are present in this package

class SetDemo // Set is an interface and HashSet, TreeSet are its classes
{
    public static void main(String[] args) { //main method starts
        HashSet hs = new HashSet(); //creating object hs of HashSet class
        hs.add("Shashank"); //adding elements to the hashset
        hs.add("Mohit"); //adding elements to the hashset
        hs.add("Akash"); //adding elements to the hashset
        hs.add("Deepak"); //adding elements to the hashset
        hs.add("Mohit"); //adding "Mohit" again to the hashset
        System.out.println("There are " + hs.size() + " elements in the set"); //printing the size of the hashset
        System.out.println(hs); //printing the elements in the hashset
        Iterator itr = hs.iterator(); //creating object itr of Iterator class
        System.out.println("Elements printed using HashSet: ");
        while(itr.hasNext()) //iterating through the hashset using while loop and itr.hasNext() method is used to check if there is any element present in the hashset
        {
            System.out.println(itr.next()); //printing the elements of the hashset using itr.next() method
        }
        System.out.println("*****************"); //printing the line break
        TreeSet ts = new TreeSet(); //creating object ts of TreeSet class
        ts.addAll(hs); //adding all the elements of hashset to the treeset using addAll() method of TreeSet class
        itr = ts.iterator(); //creating object itr of Iterator class using ts.iterator() method
        System.out.println("Elements printed using TreeSet: ");
        while(itr.hasNext()) //iterating through the treeset using while loop and itr.hasNext() method is used to check if there is any element present in the treeset
        {
            System.out.println(itr.next()); //printing the elements of the treeset using itr.next() method
        }
    }
}

/* The above program demonstrates the use of HashSet and TreeSet classes. 
HashSet is a class which implements Set interface and it does not allow 
duplicate elements. TreeSet is a class which implements Set interface and 
it does not allow duplicate elements and it also sorts the elements in 
ascending order. In the above program, we have created a HashSet object 
hs and added some elements to it. Then we have printed the size and 
elements of the hashset. Then we have created an object itr of Iterator 
class and iterated through the hashset using while loop and itr.hasNext() method. 
Then we have created a TreeSet object ts and added all the elements of hashset to 
it using addAll() method of TreeSet class. Then we have created an object itr of 
Iterator class using ts.iterator() method and iterated through the treeset 
using while loop and itr.hasNext() method. */
