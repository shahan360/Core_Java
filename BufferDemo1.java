public class BufferDemo1 {
    public static void main(String[] args) {
        StringBuffer sb1=new StringBuffer(); //stored in heap as empty object
        StringBuffer sb2=new StringBuffer("Houston"); //stored in heap as "Houston"
        StringBuffer sb3=new StringBuffer(10); //stored in heap as empty object with capacity 10
        System.out.println(sb1.capacity()); //By default capacity is 16
        System.out.println(sb2.capacity()); //Capacity is 16+7=23 as "Houston" has 7 characters with 16 default capacity
        System.out.println(sb3.capacity()); //Capacity is 10 as specified by user
    }
}
