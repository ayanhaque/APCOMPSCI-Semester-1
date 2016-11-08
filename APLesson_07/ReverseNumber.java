import java.util.Scanner;
public class ReverseNumber
{
	static int number;
	static int num;
	static int rev;
	
    public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter a number: ");
		number = kb.nextInt();
		num = number;
		rev = 0;
		System.out.println(number + " reversed is " + getReverse(num, rev));
	}
	
	static int getReverse(int num, int rev)
	{
		while(num > 0)
		{
			rev *= 10;
			rev += num%10;
			num /= 10;
		}
		return rev;
	}
}
