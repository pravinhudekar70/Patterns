package Pattern;
/*
   Solid Rectangle      * * * * *
   row = 4              * * * * *
   column =5            * * * * *
                        * * * * *
 */
import java.util.*;
public class SolidRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the Number of Row");
        int row = sc.nextInt();
        System.out.println("Enter the number of column");
        int col = sc.nextInt();
        for(int i=0;i<row;i++){
            for(int j =0; j<col;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
