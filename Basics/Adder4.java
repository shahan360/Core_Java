import java.util.*; // import all classes from java.util package so that we can use Scanner class

public class Adder4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // create an object of Scanner class
        System.out.println("Enter your name: "); // ask user to enter name
        String name = sc.next(); // take input in name
        System.out.println("Hello " + name); // print Hello and name
    }
}
