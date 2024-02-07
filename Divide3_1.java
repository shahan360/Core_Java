public class Divide3_1 {
    public static int divide(int x, int y){
        try {
            return x/y;
        } catch (ArithmeticException e) {
            // TODO: handle arithmetic exception
            System.out.println("Exception caught in the divide function block and is rethrown by it to main function block");
            throw(e); // rethrowing the exception
            //return 0;
        }
    }

    public static void main(String[] args){
        try{
            int a=Integer.parseInt(args[0]);
            int b=Integer.parseInt(args[1]);
            int c=divide(a,b);
            System.out.println("The result of division is: "+c);
        }catch(Exception e){
            System.out.println("The thrown exception from divide block is now cought in main block");
            System.out.println(e);
        }
    }
}
