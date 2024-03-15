import java.util.*; // import all classes from java.util package so that we can use Scanner class

public class ArrayDemo1 {
    public static void main(String[] args) {
        int[] a = new int[5]; // declaration and instantiation of array
        int i; // declare iterator as i
        Scanner sc = new Scanner(System.in); // create an object of Scanner class
        for (i = 0; i < 5; i++) { // loop to take input in array
            System.out.println("Enter a number: "); // ask user to enter a number
            a[i] = sc.nextInt(); // take input in array
        }
        for (i = 0; i < 5; i++) { // loop to print array
            System.out.println(a[i]); // print array
        }
    }
}
