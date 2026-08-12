import java.util.*;

public class Function {
    public static void checkNumber (int n){


            if (n % 2 == 0){
                System.out.println("Even Number");
            }else {
                System.out.println("Odd Number");
            }
            return;
        }
        
    public static void main(String[]arg){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    checkNumber(n);

}
}