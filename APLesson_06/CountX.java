import java.util.Scanner;
public class CountX
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter a 1st number");
		int num1 = kb.nextInt();
		System.out.println("Enter a 2nd number");
		int num2 = kb.nextInt();
		for(int i = num1; i <= num2; i+=num1);
		{
			System.out.print(i + " ");
		}
	}
}