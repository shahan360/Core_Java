/* In this program, we are going to learn about the StringBuffer class in Java.
The StringBuffer class is used to create mutable (modifiable) string objects.
The StringBuffer class is a peer class of String. It provides more functionality than the String class.
The StringBuffer class is used to create mutable strings. It means we can modify the string after creating it.
The StringBuffer class is a thread-safe class. It means multiple threads cannot access the StringBuffer class simultaneously.
The StringBuffer class is faster than the String class because the StringBuffer class is mutable.
The StringBuffer class is used to create mutable strings. It means we can modify the string after creating it.
The StringBuffer class is a thread-safe class. It means multiple threads cannot access the StringBuffer class simultaneously.
We have done the following operations in the above program.
1. Created a StringBuffer object s1 with the value "Hello".
2. Printed the length of the string using the length() method.
3. Printed the capacity of the string using the capacity() method.
4. Appended the string "Java" to the string using the append() method.
5. Printed the string using the println() method.
6. Printed the reverse of the string using the reverse() method.
7. Inserted the character 'Q' at the index 1 using the insert() method.
8. Printed the string using the println() method.
9. Converted the StringBuffer object to a String object using the toString() method.
10. Printed the string using the println() method.
11. Created a StringBuffer object s3 with the capacity 10.
12. Appended the string "Hello" to the string using the append() method.
13. Printed the length and capacity of the string using the println() method. */


public class BufferDemo {
    public static void main(String[] args) {
        StringBuffer s1 = new StringBuffer("Hello"); // StringBuffer object
        System.out.println(s1.length()); // print the length of the string
        System.out.println(s1.capacity()); // print the capacity of the string
        s1.append("Java"); // append the string
        System.out.println(s1); // print the string
        System.out.println(s1.reverse()); // print the reverse of the string
        s1.reverse().insert(1,'Q'); // insert the character at the specified index
        System.out.println(s1); // print the string
        String s = s1.toString(); // convert the StringBuffer to String
        System.out.println(s); // print the string
        StringBuffer s3 = new StringBuffer(10); // create a StringBuffer object with capacity 10
        s3.append("Hello"); // append the string
        System.out.println(s3.length()+" "+s3.capacity()); // print the length and capacity of the string
    }
}
