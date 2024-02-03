public class Divide2 {
    public static void main(String[] args) {
        try{
            int a=Integer.parseInt(args[0]);
            int b=Integer.parseInt(args[1]);
            int c=a/b;
            System.out.println("The result of division is: "+c);
        }
        catch(ArithmeticException | ArrayIndexOutOfBoundsException | NumberFormatException e){
            System.out.println(e.toString());
        }
    }
}
