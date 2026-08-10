import java.util.Scanner; 
 
public class Loop {
    public static void main(String[]args) {
         Scanner sc = new Scanner(System.in); {
        System.out.println("enter a number");
        int n = sc.nextInt();

        if ( n == 1){
            System.out.println("neither prime nor composite");

        }else if ( n == 0){
          System.out.println("not a prime number");
        }else {
          int i = 2;
        while (i < n) {

            if (n % i == 0){
                System.out.println("not a prime number");
                break;
            }
            i++;
        }
          if (i == n){
            System.out.println("prime number");
          }

        }

    }
}
}

