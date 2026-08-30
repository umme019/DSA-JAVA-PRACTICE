import java.util.*;

public class Arrays{
    public static void main (String args[]){
        Scanner sc = new Scanner (System.in);

        int size= sc.nextInt();
        int []number= new int [size];

        //input 
        for (int i = 0;i<size;i++){
            number[i]=sc.nextInt();
        }

        int max = number[0];
        int min = number[0];
        //output
        for (int i = 0;i <size ;i++){
            if (number[i]>max){
                max=number[i];       
            }
            if (number[i]< min){
                min = number[i];    
            }
           
        }
        System.out.println("Largest ="+ max);
           System.out.println("Smallest =" + min);
         


     
    }
}

        

    
