import java.util.*;

public class Function {
    public static int printArraySum(int a,int b,int c){
        

        int sum = a + b+ c;
        System.out.println(sum);
       return sum;

    
        
    }
    
           
        
    
     public static void main(String[]arg){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b =sc. nextInt();
    int c= sc.nextInt();
    int result= printArraySum(a, b, c);

    System.out.println("total : " + result);
    

    

    

    

    

}
}