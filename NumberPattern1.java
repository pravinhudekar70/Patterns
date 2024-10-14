package Pattern;
/*
 print the following patteern
   1
   2 9
   3 8 10
   4 7 11 14
   5 6 12 13 15
 */
public class NumberPattern1 {
    public static void main(String[] args) {
        int row =5;
        
        for(int i=0;i<row;i++){
            for(int j=0; j<=i;j++){
                int x=0;
                for(int k=0;k<j;k++)
                x=x+row-k;
                if(j%2==0){
                    System.out.print(x+i-j+1+" ");
                }else{
                    System.out.print(x+row-i+" ");
                }
            }
            System.out.println();
        }
    }
}
