public class StringDemo4 {
    public static void main(String[] args) {
        String s1 = new String("Spring");
        s1.concat("winter");
        String s2 = new String("autumn");
        s2 = s2.concat("rainy");
        System.out.println(s1);
        System.out.println(s2);
    }
}
