import java.util.*;

public class Function {
    public static int printArmstrong(int n){
    
        int n= a^3+b^3+c^3;
        if (n == n){
            System.out.println("Armstrong");
        }else{
            System.out.println("Not Armstrong");
        }

    return n;
        
    }
    
     public static void main(String[]arg){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    int result= printArmstrong(n);

    System.out.println(" " + result);
    

    

    

    

    

}
}