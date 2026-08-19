import java.util.*;

public class Bits {

    public static void main(String[]args){
     Scanner sc = new Scanner(System.in);

     System.out.println("Enter type");
     String type = sc.next();
      
     if (type.equals("decimal")){
        System.out.println("Enter number");
        int n = sc.nextInt();
        System.out.println("Decimal to Binary = " +Integer.toBinaryString(n));

     }else if(type.equals("binary")){
        System.out.println("Enter number");
         String binary = sc.next();
        System.out.println("Binary to Decimal = " + Integer.parseInt(binary,2));
     }


     

    


    }
}
