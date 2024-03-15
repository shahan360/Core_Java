import java.util.*; // import all classes from java.util package so that we can use Scanner class

public class ArrayDemo4 {
    public static void main(String[] args) {
        int[][] a = new int[3][3]; // declaration and instantiation of 2D array
        int i, j; // declare iterators as i and j
        Scanner sc = new Scanner(System.in); // create an object of Scanner class
        for (i = 0; i < 3; i++) { // loop to take input in 2D array for ith row
            for (j = 0; j < 3; j++) { // loop to take input in 2D array for jth column
                System.out.println("Enter a number: "); // ask user to enter a number for ith row and jth column
                a[i][j] = sc.nextInt(); // take input in 2D array
            }
        }
        for (i = 0; i < 3; i++) { // loop to print 2D array for ith row
            for (j = 0; j < 3; j++) { // loop to print 2D array for jth column
                System.out.print(a[i][j] + " "); // print 2D array for ith row and jth column
            }
            System.out.println(); // print new line to move to next row
        }
    }
}
