import java.util.*;

public class Function {
    public static int printCircumference(int n){

      
      int i =(int) ( 2 * Math.PI *  n ) ;
      return i;
    }
    

        
    public static void main(String[]arg){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

     int Circumference = printCircumference(n);

    System.out.println(Circumference);
    

    

    

    

}
}