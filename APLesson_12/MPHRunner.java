import java.util.Scanner;
public class MPHRunner
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Please enter the distance: ");
		int distance = kb.nextInt();
		System.out.println("Please enter the time (in hours): ");
		int hours = kb.nextInt();
		System.out.println("Please enter the additional time (in minutes): ");
		int minutes = kb.nextInt();

		MilesPerHour object = new MilesPerHour(distance, hours, minutes); 
		System.out.println(object.getDist() + " miles in " + object.getHrs() + " hours = " + object.getMilesPerHour() + " mph.");
		object.setMilesPerHour(50, 2, 30);
		System.out.println(object.getDist() + " miles in " + object.getHrs() + " hours = " + object.getMilesPerHour() + " mph.");
	}
}