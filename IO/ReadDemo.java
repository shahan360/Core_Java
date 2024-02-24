import java.io.*;
class ReadDemo
{
    public static void main(String[] args) {
        try{
            FileInputStream f=new FileInputStream(args[0]);
            int ch;
            while(true)
            {
                ch=f.read();
                if(ch==-1)
                    break;
                System.out.print((char)ch);    
            }
        }catch(Exception e)
        {
            System.out.println(e);
        }
    }
}