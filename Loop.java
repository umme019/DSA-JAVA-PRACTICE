import java.util.*; 
 
public class Loop {
    public static void main(String[]args){
     Scanner sc = new Scanner (System.in);
     System.out.println("Enter a number");
     int n = sc.nextInt();
     int original = n;
      
     int reversed = 0;
     while(n>0){
       reversed= reversed*10 +n%10;
       n= n/10;
     }
     
     if (original == reversed){
      System.out.println("Palindrome");
     }else{
      System.out.println("Not Palindrome");
     }
    
    


      }
    }

        

    







        

    





