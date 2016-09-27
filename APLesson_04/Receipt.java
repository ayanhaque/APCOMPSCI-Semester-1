import java.util.Scanner;

public class Receipt
{
    public static void main(String[]args)
    {
        Receipt form = new Receipt();
        
        Scanner kb = new Scanner(System.in);
       
        System.out.println("Please enter item1: ");
        String item1 = kb.nextLine();
        System.out.println("Please enter the price: ");
        double price1 = kb.nextDouble();
        
        String keyboard = kb.nextLine();
        System.out.println("Please enter item2: ");
        String item2 = kb.nextLine();
        System.out.println("Please enter the price: ");
        double price2 = kb.nextDouble();
        
        System.out.println("Please enter item3: ");
        String item3 = kb.next();
        System.out.println("Please enter the price: ");
        double price3 = kb.nextDouble();
        
        System.out.println("  ");
        System.out.println("<<<<<<<<<<<<<<<receipt>>>>>>>>>>>>>>>");
        
        form.format(item1, price1);
        form.format(item2, price2);
        form.format(item3, price3);
        
        double subtotal = price1 + price2 + price3;
        form.format("Subtotal: ", subtotal);
        double tax = .08 * subtotal;
        form.format("Tax: ", tax);
        double total = subtotal + tax;
        form.format("Total: ", total);
        
        System.out.println("\n_____________________________________");
        System.out.println("    * Thank you for your support *");
    }
    public void format(String item, double price)
    {
        System.out.printf("\n*%19s..........  %5.2f", item, price);
    }
}
