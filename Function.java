import java.util.*;

public class Function {
    public static void printTable(int n){

           for (int j =1;j<=10; j++){
            System.out.println(n + " * " + j + " = " + (n*j));
           }
          return;
        }
        
    public static void main(String[]arg){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    printTable(n);

}
}