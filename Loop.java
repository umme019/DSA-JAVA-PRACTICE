import java.util.*; 
 
public class Loop {
    public static void main(String[]args){
     Scanner sc = new Scanner(System.in);

        int pos = 0,neg = 0,zero = 0;
        String choice;

        do{
          System.out.println("Enter a Number");
          int num = sc.nextInt();

          if (num > 0)pos++;
          else if (num < 0) neg++;
          else zero ++;

          System.out.println("Do you want to continue? (yes / no)");
           choice = sc.next();
        }while (choice . equals("no"));

        System.out.println("Positive : " + pos);
        System.out.println("Negative :" + neg);
        System.out.println("Zeros :" + zero);
      }
    }

        

    







        

    





