import java.util.Scanner; 
 
public class Patterns {
    public static void main(String[]args) {
         Scanner sc = new Scanner(System.in); {
            int n = 5;
            

            for (int i=0; i<=n; i++){

                for (int j=1; j<=n-i ; j++){
                    System.out.print(" ");
                }
                if ( i == 0){
                    System.out.print("1");
                }else {
                int ncr =1;
                System.out.print(ncr + " ");
                for (int j=1 ;j<=i ;j++){
                      ncr = ncr * (i -j +1)/j ;
                      System.out.print(ncr + " ");
                }
                    
                }
                System.out.println();
    }
    } 
}
}