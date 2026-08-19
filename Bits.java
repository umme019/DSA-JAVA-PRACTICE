import java.util.*;

public class Bits {

    public static void main(String[]args){
     Scanner sc = new Scanner(System.in);

     int n = sc.nextInt();
     String binary = Integer.toBinaryString(n);

        int count = 0;
     for (int i =0;i<binary.length();i ++){
     if(binary.charAt(i) == '1'){
        count++;
        
     }
    }
    System.out.println(count);

     

    


    }
}
