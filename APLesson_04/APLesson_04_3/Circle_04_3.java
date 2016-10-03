package APLesson_04_3;
import java.util.Scanner;
public class Circle_04_3
{
   public static void main(String[]args)
   {
       Scanner kb = new Scanner (System.in);
       
       System.out.println("Enter the length of the radius: ");
       double r = kb.nextDouble();
       
       print(r, calcArea(r));
   }
   
   public static double calcArea(double r)
   {
       return 3.14 * r * r;
   }
   
   public static void print(double r, double area)
   {
       System.out.printf("The area of a circle with a radius of " + r + " is %.5f", area);
   }
}
