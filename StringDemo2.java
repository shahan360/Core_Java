public class StringDemo2 {
    public static void main(String[] args) {
        String s1=new String("Houston");
        System.out.println(s1.length());
        System.out.println(s1.toLowerCase());
        System.out.println(s1.toUpperCase());
        System.out.println(s1.charAt(4));
        char[] c=s1.toCharArray();
        for(char ch:c){
            System.out.println(ch);
        }
        byte[] b=s1.getBytes();
        for(byte by:b){
            System.out.println((char)by);
        }
        String s2="         Houston         ";
        System.out.println(s2);
        System.out.println(s2.trim());
        String s3="hello how are you";
        String[] data=s3.split(" ");
        for(String d:data){
            System.out.println(d);
        }
        System.out.println(s3.indexOf('o'));
        System.out.println(s3.indexOf("are"));
        System.out.println(s3.lastIndexOf('o'));
        System.out.println(s3.lastIndexOf("are"));
        System.out.println(s3.substring(6));
        System.out.println(s3.substring(6,13));
        System.out.println(s1.equals("houston"));
        System.out.println(s1.equalsIgnoreCase("houston"));

    }
}
