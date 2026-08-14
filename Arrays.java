import java.util.*;

public class Arrays{
    public static void main (String args[]){
        Scanner sc = new Scanner (System.in);

        int size = sc.nextInt();
        int number []= new int[size];

        //input
        for (int i =0;i<size;i++){
            number[i] = sc.nextInt();

        }

        //output
        int i;
        for ( i =0;i< size- 1; i ++){
            if (number[i] > number [i + 1]){
                break;
        }
    }

    if (i == size -1){
                System.out.println("Ascending Order");
            }else{
                System.out.println("Not in Ascending Order");
            }
}
}
