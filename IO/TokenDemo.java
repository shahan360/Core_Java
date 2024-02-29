import java.util.*; //importing util package

public class TokenDemo { //class TokenDemo
    public static void main(String[] args) { //main method
        // String s="hello how are you"; //string s is initialized with the value "hello how are you"
        String s="hello@how$are^you"; //new string s is initialized with the value "hello@how$are^you"
        // StringTokenizer st=new StringTokenizer(s); //StringTokenizer class is used to break the string into tokens
        // StringTokenizer st=new StringTokenizer(s, "@,$,^"); //new StringTokenizer object is created with the string s and delimiters @,$,^
        StringTokenizer st=new StringTokenizer(s, "@,$,^", true); //new StringTokenizer object is created with the string s and delimiters @,$,^ and the third parameter is set to true
        System.out.println("following tokens are extracted from the string"); //prints the message "following tokens are extracted from the string"
        while(st.hasMoreTokens()) //hasMoreTokens() returns true if there are more tokens in the string
        {
            System.out.println(st.nextToken()); //nextToken() returns the next token from the string
        }
    }
}
