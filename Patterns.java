import java.util.Scanner; 
 
public class Patterns {
    public static void main(String[]args) {
         Scanner sc = new Scanner (System.in);

         int n = 5;
         
         for (int i=1;i<=n;i++){

            //space
            for (int j=1;j<=n-i;j++){
                System.out.print("  ");
            }

            //stars
            for (int j=i;j>=1;j--){
                System.out.print(j + " ");
            }
             for (int k=2;k<=i;k++){
                System.out.print(k + " ");
            }
         System.out.println();  
        }
        
         }
    }
    

