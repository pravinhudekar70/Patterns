package Pattern;
/*
  Print Solid Rhonbus pattern for given number;
          * * * * *
        *       *
      *       *
    *       *
  * * * * * 

 */
public class HollowRhombus {
    
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=n;i++){
            for(int j=1;j<n-i+1;j++){
                System.out.print("  ");
            }
            for(int j=1;j<=n;j++){
                if(i==1|| i==n || j==1 || j==n )
                System.out.print("* ");
                else 
                System.out.print("  ");
            }
            System.out.println();
        }
    }
}
