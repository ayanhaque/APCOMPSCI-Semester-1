import java.util.Scanner; //import Statement

public class Calculation
{
	public static void main(String[]args)
	{
		//instantiate the new scanner object "keyboard"
		Scanner keyboard = new Scanner(System.in);
		
		//prompt for user input
		
		System.out.println("How fast do you drive to get to school? (in mph) ");
		
		//search for the next integer that the user enters
		double num1 = keyboard.nextDouble();
		
		System.out.println("How far from school do you live? (in miles) ");
		
		//search for the next integer that the user enters
		double num2 = keyboard.nextDouble();
		
		double answer = (1/num1) * num2 * 60;
		
		System.out.println("Your ideal travel time is " + answer + " minutes");
	}
}
