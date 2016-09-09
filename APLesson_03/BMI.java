import java.util.Scanner; //import Statement

public class BMI
{
	public static void main(String[]args)
	{
		//instantiate the new scanner object "keyboard"
		Scanner keyboard = new Scanner(System.in);
		
		//prompt for user input
		
		System.out.println("What is your height in inches? ");
		
		//search for the next integer that the user enters
		double num1 = keyboard.nextDouble();
		
		System.out.println("What is your weight in pounds? ");
		
		//search for the next integer that the user enters
		double num2 = keyboard.nextDouble();
		
		double answer = 703 * num2/(num1*num1);
		
		System.out.println("Your BMI is " + answer);
	}
}
