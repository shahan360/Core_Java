import java.util.*; // HashMap, Map, Set, Iterator collection classes are present in this package

public class MapDemo { // Map is an interface and HashMap is its class
    public static void main(String[] args) { //main method starts
        HashMap hm = new HashMap<>(); //creating object hm of HashMap class
        hm.put("mohit","developer"); //adding elements to the hashmap
        hm.put("shashank","analyst"); //adding elements to the hashmap
        hm.put("akash","manager"); //adding elements to the hashmap
        System.out.println("There are " + hm.size() + " elements in the map"); //printing the size of the hashmap
        System.out.println(hm); //printing the elements in the hashmap
        Set set = hm.entrySet(); //creating object set of Set class using hm.entrySet() method
        Iterator itr = set.iterator(); //creating object itr of Iterator class using set.iterator() method
        System.out.println("Elements printed using HashMap: "); //printing the line break
        while(itr.hasNext()) { //iterating through the hashmap using while loop and itr.hasNext() method is used to check if there is any element present in the hashmap
            Map.Entry me = (Map.Entry)itr.next(); //creating object me of Map.Entry class using itr.next() method
            System.out.println(me.getKey() + " : " + me.getValue()); //printing the elements of the hashmap using me.getKey() and me.getValue() methods
        }
    }
}

/* In the above program, we have created a HashMap object hm and added some elements to it. 
Then we have printed the size and elements of the hashmap. Then we have created an object set. 
Then we have created an object itr of Iterator class and iterated through the hashmap using while loop and itr.hasNext() method.*/