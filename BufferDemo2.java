public class BufferDemo2 {
    public static void main(String[] args) //because main method is static and void with String array as argument
    {
        StringBuffer sb1=new StringBuffer("Houston"); //stored in heap as empty object with capacity 16+7=23 as "Houston" has 7 characters with 16 default capacity
        System.out.println(sb1.length()); //7 //because "Houston" has 7 characters
        System.out.println(sb1.capacity()); //23 //because "Houston" has 7 characters with 16 default capacity
        sb1.append(" Rockets"); //stored in heap as "Houston Rockets" with capacity 23+8=31 as "Houston Rockets" has 15 characters with 23 default capacity
        System.out.println(sb1); //Houston Rockets //because "Houston Rockets" is stored in heap
        System.out.println(sb1.reverse()); //skcoR nosuoH //because "Houston Rockets" is reversed and stored in heap
        sb1.reverse().insert(1,'Q'); //stored in heap as "QskcoR nosuoH" with capacity 31
        System.out.println(sb1); //QskcoR nosuoH //because "QskcoR nosuoH" is stored in heap
        String sb=sb1.toString(); //stored in heap as "QskcoR nosuoH" with capacity 31
        System.out.println(sb); //QskcoR nosuoH //because "QskcoR nosuoH" is stored in heap
        StringBuffer sb2=new StringBuffer(10); //stored in heap as empty object with capacity 10
        // sb2.append("aaaaaaaaa"); //stored in heap as "aaaaaaaaa" with capacity 10+9=19 as "aaaaaaaaa" has 9 characters with 10 default capacity
        // System.out.println(sb2.length()+" "+sb2.capacity()); //9 19 //because "aaaaaaaaa" has 9 characters with 10 default capacity
        // sb2.append("aaaaaaaaarr"); //stored in heap as "aaaaaaaaarr" with capacity 10+11=21 as "aaaaaaaaarr" has 11 characters with 10 default capacity
        // System.out.println(sb2.length()+" "+sb2.capacity()); //11 21 //because "aaaaaaaaarr" has 11 characters with 10 default capacity
        // sb2.append("aaaaaaaaarreeeeeeeeee"); //stored in heap as "aaaaaaaaarreeeeeeeeee" with capacity 10+18=28 as "aaaaaaaaarreeeeeeeeee" has 18 characters with 10 default capacity
        // System.out.println(sb2.length()+" "+sb2.capacity()); //18 28 //because "aaaaaaaaarreeeeeeeeee" has 18 characters with 10 default capacity
        sb2.append("aaaaaaaaarreeeeeeeeeewq"); //stored in heap as "aaaaaaaaarreeeeeeeeeewq" with capacity 10*2+2=22 as "aaaaaaaaarreeeeeeeeeewq" has 22 characters with 10 default capacity
        System.out.println(sb2.length()+" "+sb2.capacity()); //22 22 //because "aaaaaaaaarreeeeeeeeeewq" has 22 characters with 10 default capacity
    }
}
