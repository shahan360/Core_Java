import java.util.Scanner;
public class ArrayDemo5 {
    public static void main(String[] args) {
        int[][] a=new int[3][];
        int i,j;
        a[0]=new int[3];
        a[1]=new int[4];
        a[2]=new int[5];
        Scanner sc=new Scanner(System.in);
        for(i=0;i<3;i++){
            for(j=0;j<a[i].length;j++){
                System.out.println("Enter No:");
                a[i][j]=sc.nextInt();
            }
        }
        for(i=0;i<a.length;i++){
            for(j=0;j<a[i].length;j++){
                System.out.println(a[i][j]+" ");
            }
            System.out.println();
        }
    }
}
