import java.util.*;

public class Strings{
    public static void main(String []args){
     
    StringBuilder sb = new StringBuilder("apple,banana,cherry");

    //delete the ','
    for (int i = 0;i < sb.length();i++){
    if (sb.charAt(i) == ','){
    sb.deleteCharAt(i);
   i--;
    }
}
   //insert '|'
    sb.insert(5, '|');
    sb.insert(12, '|');
   
      System.out.println(sb);
   

            
    }




    }

