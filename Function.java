import java.util.*;

public class Function {
    public static int printAverage(int a,int b, int c){

      int average = (a+b+c)/3;
      return average;
    }

        
    public static void main(String[]arg){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt(); 
    int b = sc.nextInt();
    int c = sc.nextInt();

    int average= printAverage(a,b,c);

    System.out.println("Average of given number = " + average);

}
}