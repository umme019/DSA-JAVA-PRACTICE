import java.util.*;

public class Function {
    public static void printgcd(int a,int b){

    for(int i= Math.min(a,b);i>=1;i--){
        if (a % i == 0 && b % i == 0){
            System.out.println(i);
            return;
        }
    }
    return;
          
    
        
    }

     public static void main(String[]arg){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();

    printgcd(a, b);

    

    

    

    

}
}