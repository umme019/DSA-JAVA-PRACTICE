import java.util.*;

public class Function {
    public static int printValue(int x,int n){

         int result = 1;
         for(int i =1; i<=n;i ++){
            result *= x;
         }
         return result;
    }
    
    

        
    public static void main(String[]arg){
    Scanner sc = new Scanner(System.in);
    int x = sc.nextInt();
    int n = sc.nextInt();

    System.out.println(printValue(x, n));

    

    

    

    

}
}