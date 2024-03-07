import java.util.*; // HashMap, Map, Set, Iterator collection classes are present in this package

public class MapDemo1 { // Map is an interface and HashMap is its class
    public static void main(String[] args) { //main method starts
        HashMap hm = new HashMap<>(); //creating object hm of HashMap class
        hm.put("mohit","developer"); //adding normal key value pair to the hashmap
        hm.put("shashank","analyst"); //adding normal key value pair to the hashmap
        hm.put("akash","manager"); //adding normal key value pair to the hashmap
        hm.put("akash", "DBA"); //adding value "DBA" to the key "akash" which is already present in the hashmap
        hm.put("zbc",null); //adding value null to the key "zbc"
        hm.put("abc",null); //adding value null to the key "abc"
        hm.put(null,"amit"); //adding value "amit" to the key null
        hm.put(null,null); //adding value null to the key null
        System.out.println("There are " + hm.size() + " elements in the map"); //printing the size of the hashmap
        System.out.println(hm); //printing the elements in the hashmap
    }
}

/* In the above program, we have created a HashMap object hm and added some elements to it. 
Then we have printed the size and elements of the hashmap. The important details to note are:
that the key "akash" is present twice in the hashmap and the value "DBA" is the latest value added to the key "akash".
also the key "null" having value "null" is printed in the start of the hashmap and the key "null" having value "amit" is printed at the end of the hashmap.
The keys can have null as their values and the values can have null as their keys. */