import java.util.*;

public class Strings{
    public static void main(String []args){
     Scanner sc = new Scanner (System.in);

       String charAt = sc.next();
    StringBuilder sb = new StringBuilder(charAt);

    //delete the vowels (a,e,i,o,u)
    for (int i = 0; i<sb.length();i++){
        if (sb.charAt(i) == 'a' || sb.charAt(i) == 'e' || sb.charAt(i) == 'i' || sb.charAt(i) == 'o' || sb.charAt(i) == 'u'){
         sb.deleteCharAt(i);
         i--;
        }
            
    }
    System.out.println(sb);



    }
}
