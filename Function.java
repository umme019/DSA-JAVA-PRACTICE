import java.util.*;

public class Function {
    public static void checkNumber (int n){


            if (n == 1){
                System.out.println("Not prime nor composite");
            }else if (n == 0){
            System.out.println("Not a prime number");
    
            }else {
                for (int i= 2; i<n ;i++){
                   if (n % i == 0){
                     System.out.println("Not a prime number");
                     return;
                
                   }
                }
                System.out.println("Prime number");
            }
            return;
        }
        
    public static void main(String[]arg){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    checkNumber(n);

}
}