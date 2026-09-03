import java.util.*; 
 
public class Loop {
    public static void main(String[]args){
     Scanner sc = new Scanner (System.in);
     System.out.println("Enter two number");
     int a = sc.nextInt();
     int b = sc.nextInt();
     int choice = sc.nextInt();
     
      switch (choice){
        case 1: System.out.println("Addition = " + (a+b));
        break;
        case 2: System.out.println("Subtraction = " + (a-b));
        break;
        case 3: System.out.println("Multiplication = " + (a*b));
        break;
        case 4: if (b==0){
          System.out.println("Invalid");
        }else{
        System.out.println("Division = " + (a/b));
        }
        break;
        case 5: System.out.println("Modulus = " + (a%b));
        break;
        default: System.out.println("Invalid");
      }
    
    
      }
    }

        

    







        

    





