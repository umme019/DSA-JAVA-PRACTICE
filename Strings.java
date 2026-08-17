import java.util.*;

public class Strings{
    public static void isPalindrome(String str){
        
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
