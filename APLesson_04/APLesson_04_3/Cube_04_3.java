package APLesson_04_3;
import java.util.Scanner;
public class Cube_04_3
{
   public static void main(String[]args)
   {
       Scanner kb = new Scanner(System.in);
       
       System.out.println("Enter the length of the side: ");
       double side = kb.nextDouble();
       
       print(side, calcSurf(side));
   }
   
   public static double calcSurf(double side)
   {
       return (side * side) * 6;
   }
   
   public static void print(double side, double sa)
   {
       System.out.printf("The surface area of a cube with side length " + side + " is %.5f", sa);
   }
}
