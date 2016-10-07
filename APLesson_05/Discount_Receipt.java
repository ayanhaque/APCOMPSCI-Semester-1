import java.util.Scanner;
public class Discount_Receipt
{
   public static void main(String[]args)
   {
       Scanner kb = new Scanner(System.in);
       
       
       System.out.println("Enter the first item: ");
       String item1 = kb.nextLine();
       System.out.println("Enter the price: ");
       double price1 = kb.nextDouble();
       
       kb.nextLine();
       System.out.println("Enter the second item: ");
       String item2 = kb.nextLine();
       System.out.println("Enter the price: ");
       double price2 = kb.nextDouble();
       
       kb.nextLine();
       System.out.println("Enter the third item: ");
       String item3 = kb.nextLine();
       System.out.println("Enter the price: ");
       double price3 = kb.nextDouble();
       
       kb.nextLine();
       System.out.println("Enter the fourth item: ");
       String item4 = kb.nextLine();
       System.out.println("Enter the price: ");
       double price4 = kb.nextDouble();
       
       System.out.println("");
       System.out.println("<<<<<<<<<<<<<receipt>>>>>>>>>>>>>");
       
       format(item1, price1);
       format(item2, price2);
       format(item3, price3);
       format(item4, price4);
       
       double subtotal = price1 + price2 + price3 + price4;
       double discount = discount(subtotal);
       double tax = .08 * (subtotal - discount);
       double total = subtotal - discount + tax;
       
       format("Subtotal", subtotal);
       format("Discount", discount);
       format("Tax", tax);
       format("Total", total);
       
       System.out.println("\n_________________________________");
       System.out.println("  * Thank you for your support *");
   }
   public static double discount(double subtotal)
   {
       double discount = 0;
       if (subtotal > 2000)
       {
           discount = .15 * subtotal;
       }
       if (subtotal < 2000)
       {
           discount = 0;
       }
       
       return discount;
   }
   public static void format(String item, double price)
   {
       System.out.printf("\n%13s............%7.2f", item, price);
   }
}
