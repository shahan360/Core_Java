public class StringDemo3 {
    public static void main(String[] args) {
        int a=10;
        byte b=4;
        short c=34;
        long d=12l;
        char e='A';
        float f=12.45f;
        double g=2.4;
        boolean h=false;
        show(String.valueOf(a));
        show(String.valueOf(b));
        show(String.valueOf(c));
        show(String.valueOf(d));
        show(String.valueOf(e));
        show(String.valueOf(f));
        show(String.valueOf(g));
        show(String.valueOf(h));

    }
    public static void show(String s) {
        System.out.println(s);
    }
}
