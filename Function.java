import java.util.*;

public class Function {
    public static int printSum(int n){

        int sum = 0;
      for (int i = 1; i<=n ;i++){
        if (i % 2 !=0){
            sum += i; 
        }
        }
          
        return sum;
      }
    

        
    public static void main(String[]arg){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    int sum = printSum(n);
    System.out.println("Sum of 1 to " + n + " = " + sum);

    

    

    

}
}