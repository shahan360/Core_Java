import java.util.*; // import all classes from java.util package so that we can use Scanner class

public class ArrayDemo5 {
    public static void main(String[] args) {
        int[][] a = new int[3][]; // declaration of 2D array with only rows count specified
        int i, j; // declare iterators as i and j
        a[0] = new int[3]; // instantiation of 2D array for 0th row
        a[1] = new int[4]; // instantiation of 2D array for 1st row
        a[2] = new int[5]; // instantiation of 2D array for 2nd row
        Scanner sc = new Scanner(System.in); // create an object of Scanner class
        for (i = 0; i < 3; i++) { // loop to take input in 2D array for ith row
            for (j = 0; j < a[i].length; j++) { // loop to take input in 2D array for jth column
                System.out.println("Enter a number: "); // ask user to enter a number for ith row and jth column
                a[i][j] = sc.nextInt(); // take input in 2D array
            }
        }
        for (i = 0; i < 3; i++) { // loop to print 2D array for ith row
            for (j = 0; j < a[i].length; j++) { // loop to print 2D array for jth column
                System.out.print(a[i][j] + " "); // print 2D array for ith row and jth column
            }
            System.out.println(); // print new line to move to next row
        }
    }
}
