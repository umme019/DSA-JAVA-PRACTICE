import java.util.*;

public class Function {
    public static int printGreater(int a,int b){

      if (a>b){
        return a;
      }else {
        return b;
      }
    }
    

        
    public static void main(String[]arg){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();

     int Greater = printGreater(a,b);

    System.out.println(Greater);
    

    

    

    

}
}