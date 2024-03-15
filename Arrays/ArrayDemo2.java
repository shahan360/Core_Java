import java.util.*; // import all classes from java.util package so that we can use Scanner class

public class ArrayDemo2 {
    public static void main(String[] args) {
        int i; // declare iterator as i
        Scanner sc = new Scanner(System.in); // create an object of Scanner class
        System.out.println("Enter the size of array: "); // ask user to enter size of array
        int size = sc.nextInt(); // take input in size of array by using nextInt() method on sc object
        int[] a = new int[size]; // declaration and instantiation of array using size as length of array
        for (i = 0; i < size; i++) { // loop to take input in array
            System.out.println("Enter a number: "); // ask user to enter a number
            a[i] = sc.nextInt(); // take input in array
        }
        for (i = 0; i < size; i++) { // loop to print array
            System.out.println(a[i]); // print array
        }
    }
}
