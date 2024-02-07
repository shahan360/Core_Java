class MyException extends Exception{
    String msg;
    public MyException(){
        super();
    }
    public MyException(String msg){
        super(msg);
    }
}

public class CustomDemo2 {
    public static void main(String[] args) {
        try{
            System.out.println("Throwing custom Exception");
            // throw(new MyException());
            throw(new MyException("This is my constructor with arguments invoked"));
        }catch(Exception e){
            System.out.println(e.toString());
        }
    }
}
