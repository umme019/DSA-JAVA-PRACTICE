import java.util.*;

public class Function {
    public static int findMax(int[] array){
        

        int max = array[0];
        for (int i= 1;i<array.length;i++){
         if (array[i] > max){
            max = array[i];
         }
        }

    return max;
        
    }
    
     public static void main(String[]arg){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b =sc. nextInt();
    int c= sc.nextInt();
    int []arr ={a,b,c};
    int result= findMax(arr);

    System.out.println("Max : " + result);
    

    

    

    

    

}
}