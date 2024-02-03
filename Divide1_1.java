package Exception_Handling;
public class Divide1_1 {
    public static void main(String[] args) {
        try{
            int a =Integer.parseInt(args[0]);
            int b =Integer.parseInt(args[1]);
            int c = a/b;
            System.out.println("result="+c);
        }
        catch(Exception e)
        {
            System.out.println(e.toString());
        }
        catch(ArithmeticException e)
        {
            System.out.println("Secodn number should not be zero");
        }
        catch(NumberFormatException e)
        {
            System.out.println("Provide only numbers as input");
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Provide two numbers as input");
        }
        
    }
}    
