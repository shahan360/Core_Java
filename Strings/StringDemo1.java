/* Description: Program to demonstrate the creation of string objects using different constructors. */

public class StringDemo1 { // Class declaration
    public static void main(String[] args) { // Main method
        String s1 = new String(); // empty string object s1 created
        String s2 = new String("Hello"); // string object s2 created with value "Hello"
        char [] ch = {'H', 'e', 'l', 'l', 'o'}; // character array ch created
        String s3 = new String(ch); // string object s3 created with values taken from character array ch
        String s4 = new String(ch, 1, 3); // string object s4 created with values taken from character array ch starting from index 1 and taking 3 characters
        byte[] b = {65, 66, 67, 68, 69, 70}; // byte array b created
        String s5 = new String(b); // string object s5 created with values taken from byte array b
        String s6 = new String(b, 2, 3); // string object s6 created with values taken from byte array b starting from index 2 and taking 3 characters
        System.out.println("s1 = " + s1); // printing string s1
        System.out.println("s2 = " + s2); // printing string s2
        System.out.println("s3 = " + s3); // printing string s3
        System.out.println("s4 = " + s4); // printing string s4
        System.out.println("s5 = " + s5); // printing string s5
        System.out.println("s6 = " + s6); // printing string s6
    }
}
