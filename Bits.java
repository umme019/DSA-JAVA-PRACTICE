import java.util.*;

public class Bits {

    public static void main(String[]args){
     Scanner sc = new Scanner(System.in);

     int n = sc.nextInt();

     
     if ( n >0 && (n & (n -1))== 0){
        
    System.out.println( "Number is a power of 2." );
 }else {
         System.out.println("Number is not a power of 2.");
     }


    }
}
