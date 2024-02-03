public class Divide3 {
    public static void main(String[] args) {
        try{
            if(args.length<2){
                throw(new ArrayIndexOutOfBoundsException());
            }
            int a=Integer.parseInt(args[0]);
            int b=Integer.parseInt(args[1]);
            if(b==0){
                // throw(new ArithmeticException());
                throw(new ArithmeticException("Don't pass the second number as zero"));
            }
            int c=a/b;
            System.out.println("The result of division is: "+c);
        }
        catch(Exception e)
        {
            System.out.println(e.toString());
        }
    }
}
