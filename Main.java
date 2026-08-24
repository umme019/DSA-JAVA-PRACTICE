import java.util.*;

public class Main {
	
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int radius = sc.nextInt();

        double area= Math.PI*radius*radius;
        double circumference = 2*Math.PI*radius;

        System.out.println("Area =" + Math.round(area));
        System.out.println("Circumference =" + Math.round(circumference));


    }
}