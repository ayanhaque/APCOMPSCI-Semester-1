import java.util.Scanner;
public class CarDriver
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Enter the paint color: ");
		String p = kb.nextLine();
		System.out.println("Enter the interior material: ");
		String i = kb.nextLine();
		System.out.println("Enter the engine type: ");
		String e = kb.nextLine();
		System.out.println("Enter the tire type: ");
		String t = kb.nextLine();
		
		Car object = new Car(p, i, e, t);
		System.out.println("Your vehicle is ready......\n Paint:\t" + object.getPaint() + "\n Interior:\t" + object.getInterior() + "\n Engine:\t" + object.getEngine() + "\n Tires:\t" + object.getTires());
	}
}