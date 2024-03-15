public class ArrayDemo6 {
    public static void main(String[] args) {
        show(new String[]{"A", "B", "C"}); // call show method with array as argument
    }
    public static void show(String[] s) { // method to print array
        //1. normal for loop
        for (int i = 0; i < s.length; i++) { // loop to print array
            System.out.println(s[i]); // print array
        }
        //2. enhanced for loop
        for (String x : s) { // loop to print array
            System.out.println(x); // print array
        }
    }
}
