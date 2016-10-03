package APLesson_04_3;
import java.util.Scanner;
public class Rectangle_04_3
{
   public static void main(String[]args)
   {
       Scanner kb = new Scanner(System.in);
       
       System.out.println("Enter the length: ");
       double l = kb.nextDouble();
       System.out.println("Enter the width: ");
       double w = kb.nextDouble();
       
       print(calcPerim(l,w));
   }
   
   public static double calcPerim(double l, double w)
   {
       return 2 * (l + w);
   }
   
   public static void print(double perimeter)
   {
       System.out.printf("The perimeter of your rectangle is %.5f ft", perimeter);
   }
}
