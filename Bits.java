import java.util.*;

public class Bits {

    public static void main(String[]args){
     Scanner sc = new Scanner(System.in);

     int n = sc.nextInt();
     int pos = 1;
     int bitMask = 1 << pos;

     int Number = bitMask | n;
     System.out.println( Number);

    


    }
}
