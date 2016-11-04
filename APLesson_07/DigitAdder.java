import java.util.Scanner;
public class DigitAdder
{
	static int number;
	static int sum;
	static int num = number;
	
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter a number: ");
		number = kb.nextInt();
		sumDigits();
	}
	
	public static void sumDigits()
	{
		while(num > 0)
		{
			sum += num % 10;
			num /= 10;
		}
		System.out.println("The sum of the digits in " + number + " is " + num);
	}
}