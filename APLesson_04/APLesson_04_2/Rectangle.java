import java.util.Scanner;
public class Rectangle
{
   static double l;
   static double w;
   static double perimeter;
   
   public static void main(String[]args)
   {
       Scanner kb = new Scanner(System.in);
       
       System.out.println("Enter the length: ");
       l = kb.nextDouble();
       System.out.println("Enter the width: ");
       w = kb.nextDouble(); 
       //variables
       //int width = 10;
       //int height = 15;
       
       //method call(parameters)
       //calcPerim(width, height);
       calcPerim();
       print();
       
       //print statement
       //System.out.println("Your perimeter is " + calcPerim() + " ft.");
   }
   
   //public static void calcPerim(int w, int h)
   public static void calcPerim()
   {
       perimeter = 2 * (l + w);
       //return 2*(w + h);
   }
   
   public static void print()
   {
       System.out.printf("Your rectangle is %.5f ft around", perimeter);
   }
}
