import java.util.*;

public class Strings{
    public static void main(String []args){
     Scanner sc = new Scanner (System.in);

        String str = sc.next();
        StringBuilder sb = new StringBuilder(str);
        StringBuilder reversed = new StringBuilder(str);
        reversed.reverse();
        
        if (sb.toString().equals(reversed.toString())){
            System.out.println(str + " is a palindrome");
        } else {
            System.out.println(str + " is not a palindrome");
        }

    }
}
