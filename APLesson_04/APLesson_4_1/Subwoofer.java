package APLesson_4_1;

import java.util.Scanner;
public class Subwoofer
{
   public static void main(String[]args)
   {
       Scanner kb = new Scanner(System.in);
       Subwoofer sub = new Subwoofer();
       
       System.out.println("Enter the height: ");
       double h = kb.nextDouble();
       System.out.println("Enter the length: ");
       double l = kb.nextDouble();
       System.out.println("Enter the width: ");
       double w = kb.nextDouble();
      
       System.out.printf("The volume of your subwoofer box is %.5f cubic feet", sub.calcVol(h, w, l));
   }
   
   public double calcVol(double h, double w, double l)
   {
       return (l*w*h)/1728;
   }
}
