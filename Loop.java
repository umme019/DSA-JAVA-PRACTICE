import java.util.*; 
 
public class Loop {
    public static void main(String[]args){
     Scanner sc = new Scanner (System.in);
     System.out.println("Enter 2 numbers a and b");
     int a = sc.nextInt();
     int b = sc.nextInt();

     System.out.println("Enter the choice = 1,2,3,4,5");
     int choice = sc.nextInt();


     if (choice == 1){
      System.out.println("Addition =" + (a+b));
     }else if (choice == 2){
      System.out.println("Subtraction =" + (a-b));
     }else if (choice == 3){
      System.out.println("Multiplication =" + (a*b));
     }else if (choice == 4){

      if (b == 0){
        System.out.println("Invalid");
      }else
      System.out.println("Division =" + (a/b));
     }else if (choice == 5){
       System.out.println("Modulo =" + (a%b));
     }else{
      System.out.println("Invalid choice");
     }



      }
    }

        

    







        

    





