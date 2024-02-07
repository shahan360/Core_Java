class MyException extends Exception{
    String msg;
    public MyException(){
        msg="My Default Exception Constructor Invoked";
    }
    public MyException(String msg){
        this.msg=msg;
    }
    public String toString(){
        return msg;
    }
}

public class CustomDemo1 {
    public static void main(String[] args) {
        try{
            System.out.println("Throwing custom Exception");
            // throw(new MyException());
            throw(new MyException("MyException constructor with arguments invoked"));
        }catch(Exception e)
        {
            System.out.println(e.toString());
        }
    }
}
