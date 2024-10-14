package Pattern;
/*
  Print Butterfly pattern for given number;
   *             *
   * *         * *
   * * *     * * *
   * * * * * * * *
   * * * * * * * *
   * * *     * * *
   * *         * *
   *             * 
 */
import java.util.*;
public class Butterfly {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number for row");
         int n = sc.nextInt();

         for(int i=1; i<=n;i++){
            for(int j=1;j<=n;j++){
                if(j<=i){
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            for(int j=1;j<=n;j++){
                if(j>=n-i+1){
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
         }
         for(int i=1; i<=n;i++){
            for(int j=1;j<=n;j++){
                if(j<=n-i+1){
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            for(int j=1;j<=n;j++){
                if(j>=i){
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
         }
    }
}
