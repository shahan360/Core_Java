public class StringDemo1 {
    public static void main(String[] args) {
        String s1=new String();
        String s2=new String("houston");
        char[] a={'A','B','C','D','E'};
        String s3=new String(a);
        String s4=new String(a,0,3);
        byte[] b={65,66,67,68,69};
        String s5=new String(b);
        String s6=new String(b,1,2);
        System.out.println("s1="+s1);
        System.out.println("s2="+s2);
        System.out.println("s3="+s3);
        System.out.println("s4="+s4);
        System.out.println("s5="+s5);
        System.out.println("s6="+s6);
    }
}
