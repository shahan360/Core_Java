import java.util.*; // import all classes from java.util package so that we can use Scanner class
public class Adder3 {
    public static void main(String[] args) {
        int a, b, c; // declare a, b and c
        Scanner sc = new Scanner(System.in); // create an object of Scanner class
        a = sc.nextInt(); // take input in a
        b = sc.nextInt(); // take input in b
        c = a + b; // add a and b and store in c
        System.out.println("The sum of " + a + " and " + b + " is " + c); // print the sum of a and b
    }
}
