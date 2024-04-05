/* In the below program, we are converting the primitive data types to string using String.valueOf() method.
 * The String.valueOf() method converts the given data type to string.
 * The String.valueOf() method is a static method of String class.
 * The String.valueOf() method is used to convert the given data type to string.
 * The String.valueOf() method is overloaded for all the primitive data types
 * The String.valueOf() method is used to convert the given data type to string.
 */

public class StringDemo3 { // 8 primitive data types
    public static void main(String[] args) { //main method
        int a = 10; //int data type
        byte b = 20; //byte data type
        short c = 30; //short data type
        long d = 40; //long data type
        char e = 'A'; //char data type
        float f = 50.0f; //float data type
        double g = 60.0; //double data type
        boolean h = true; //boolean data type
        show(String.valueOf(a)); //show method to print the value of a using String.valueOf() method
        show(String.valueOf(b)); //show method to print the value of b using String.valueOf() method
        show(String.valueOf(c)); //show method to print the value of c using String.valueOf() method
        show(String.valueOf(d)); //show method to print the value of d using String.valueOf() method
        show(String.valueOf(e)); //show method to print the value of e using String.valueOf() method
        show(String.valueOf(f)); //show method to print the value of f using String.valueOf() method
        show(String.valueOf(g)); //show method to print the value of g using String.valueOf() method
        show(String.valueOf(h)); //show method to print the value of h using String.valueOf() method
    }
    public static void show(String s) { //show method to print the value of s
        System.out.println(s); //print the value of s
    }
}
