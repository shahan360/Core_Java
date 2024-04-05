/* In the below program it is demonstrated how to use various methods of String class in Java.
 * String class is a built-in class in Java which is used to create and manipulate strings.
 * String class is immutable i.e. once a string object is created, it cannot be changed.
 * String class has various methods to perform operations on strings like length(), toLowerCase(), toUpperCase(), charAt(), toCharArray(), getBytes(), trim(), split(), indexOf(), lastIndexOf(), substring(), equals(), equalsIgnoreCase() etc.
 * In the below program, various methods of String class are demonstrated.
 */

public class StringDemo2 { // String class methods
    public static void main(String[] args) { //main method starts
        String s1 = new String("Houston"); //creating string by new keyword and constructor 
        System.out.println(s1.length()); //print length of string using length() method of string class
        System.out.println(s1.toLowerCase()); //print string in lower case using toLowerCase() method of string class
        System.out.println(s1.toUpperCase()); //print string in upper case using toUpperCase() method of string class
        System.out.println(s1.charAt(4)); //print character at index 4 using charAt() method of string class

        char[] ch = s1.toCharArray(); //convert string to character array using toCharArray() method of string class
        for(char c : ch) { //for each loop to print each character of character array
            System.out.println(c); //print each character of character array
        }

        byte[] b = s1.getBytes(); //convert string to byte array using getBytes() method of string class
        for(byte bt : b) { //for each loop to print each byte of byte array
            System.out.println((char)bt); //print each byte of byte array
        }

        String s2 = "     Hello     "; //creating string using string literal
        System.out.println(s2); //print string
        System.out.println(s2.trim()); //print string after removing leading and trailing spaces using trim() method of string class

        String s3 = "Hello how are you?"; //creating string using string literal
        String[] words = s3.split(" "); //split string into words using split() method of string class
        for(String w : words) { //for each loop to print each word of string array
            System.out.println(w); //print each word of string array
        }

        System.out.println(s3.indexOf('o')); //print index of character 'o' using indexOf() method of string class
        System.out.println(s3.lastIndexOf("are")); //print last index of word "are" using lastIndexOf() method of string class
        System.out.println(s3.lastIndexOf('o')); //print last index of character 'o' using lastIndexOf() method of string class
        System.out.println(s3.lastIndexOf("are")); //print last index of word "are" using lastIndexOf() method of string class
        System.out.println(s3.substring(6)); //print substring from index 6 using substring() method of string class
        System.out.println(s3.substring(6, 9)); //print substring from index 6 to 9 using substring() method of string class
        System.out.println(s1.equals("houston")); //compare string with another string using equals() method of string class
        System.out.println(s1.equalsIgnoreCase("houston")); //compare string with another string ignoring case using equalsIgnoreCase() method of string class

    }
}
