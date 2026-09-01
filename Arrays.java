import java.util.*;

public class Arrays{
    public static void main (String args[]){
        Scanner sc = new Scanner (System.in);

     int size = sc.nextInt();
     int number []= new int [size];

     //input
     for (int i=0;i<size ;i++){
     number [i]=sc.nextInt();
     }
     //output
     int evenCount=0;
     int oddCount=0;
     for (int i=0;i<size;i++){
     if (number[i]%2==0){
        evenCount=evenCount+1;

    }else {
        oddCount= oddCount+1;
    }
    
}
System.out.println("even numbers are= "+evenCount);
System.out.println("odd numbers are= "+oddCount);
}
}
        

    
