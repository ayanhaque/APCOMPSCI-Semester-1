import java.util.Scanner;
public class AverageDigits
{
	static int number;
	static int digits;
	static int average;
	static int num;
	
    public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter a number: ");
		number = kb.nextInt();
		digits = 0;
		average = 0;
		num = number;
		
		System.out.println("The average of the digits in " + number + " is " + avDigits(number, average, digits));
	}
	
	static int avDigits(int number, int average, int digits)
	{
		while(num > 0)
		{
			digits += 1;
			average += digits%10;
			num /= 10;
		}
		return average/digits;
	}
}
