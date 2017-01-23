import java.util.Scanner;
public class InventoryRunner
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter the manufacturer of the itme:");
		String manufacturer = kb.next();
		System.out.println("Enter the name of the item:");
		String name = kb.next();
		
		System.out.println("Will you be entering category and price information?");
		String info = kb.next();
		if(info.equals("n"))
		{
			Inventory object = new Inventory(manufacturer, name);
			System.out.println(object);
		}
		if(info.equals("y"))
		{
			System.out.println("Enter the category:");
			String category = kb.next();
			System.out.println("Enter the price:");
			in price = kb.nextInt();
			Inventory object1 = new Inventory(manufacturer, name, category, price);
			System.out.println(object1);
		}
	}
}
