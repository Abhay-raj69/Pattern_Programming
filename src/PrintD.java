//        * *
//        *   *
//        *   *
//        *   *
//        * *
import java.util.Scanner;
public class PrintD {
    public static void main(String[] args){
        Scanner pk=new Scanner(System.in);
        System.out.print("Enter value of n : ");
        int n=pk.nextInt();
        for (int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                if (i==0 && j<(n-1)/2 || j==0 || i==(n-1) && j<(n-1)/2 ||
                j==(n-1)/2 && i>0 && i<(n-1)){
                    System.out.print("* ");
                }
                else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
