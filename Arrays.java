import java.util.*;

public class Arrays{
    public static void main (String args[]){
        Scanner sc = new Scanner (System.in);

     int n = sc.nextInt();
     int m = sc.nextInt();
     int [][]matrix= new int [n][m];

     //input
     //n
     for (int i=0;i<n ;i++){
     //m
     for (int j=0;j<m;j++){
        matrix [i][j]=sc.nextInt();
     }
     }
     //output
     for (int j=0;j<m;j++){
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
        

    
