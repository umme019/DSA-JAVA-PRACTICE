import java.util.*;

public class Function {
    public static int printArmstrong(int n){

        int original = n;
        int sum = 0;

        while(n>0){
            int digit = n % 10;
            sum += digit*digit*digit;
            n /=10;
        }
        if (sum == original){
            System.out.println("Armstrong");
        }else{
            System.out.println("Not Armstrong");
        }

    return sum;
        
    }
    
     public static void main(String[]arg){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    printArmstrong(n);

    
    

    

    

    

    

}
}