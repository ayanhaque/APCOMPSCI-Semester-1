import java.util.Scanner;
public UserRunner
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter the first name: ");
		String firstname = kb.next();
		System.out.println("Enter the last name: ");
		String lastname = kb.next();
		System.out.println("Would you like to use a public avatar? (y for yes, n for no) ");
		String avatar = kb.next();
		if(avatar.equals("y"))
		{
			UserRunner ph = new User(first, last);
		}
		if(avatar.equals("n"))
		{
			System.out.println("What avatar would you like? ");
			String avatar1 = kb.next();
			UserRunner ph = new User(first, last, avatar);
		}
	}
}