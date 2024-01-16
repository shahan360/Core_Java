/**
 * ArrayDemo6
 */
public class ArrayDemo6 {

    public static void main(String[] args) {
        show(new String[]{"A","B","C"});
    }
    public static void show(String[] a){
        // for(int i=0;i<a.length;i++){
        //     System.out.println(a[i]);
        // }
        //enhanced for loop
        for(String s:a){
            System.out.println(s);
        }
    }
}