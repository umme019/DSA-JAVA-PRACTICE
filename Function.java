import java.util.*;

public class Function {
    public static String isEligible(int age){

    if (age > 18){
      return "Eligible to vote" ;
 } else{
    return "Not Eligible to vote";
 }
    }
    

      
    public static void main(String[]arg){
    Scanner sc = new Scanner(System.in);
    int age = sc.nextInt();

     String result = isEligible(age);

    System.out.println(result);
    

    

    

    

}
}