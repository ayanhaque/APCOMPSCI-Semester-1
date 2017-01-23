import java.util.Scanner;
public class UserRunner
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter your first name: ");
		String firstname = kb.next();
		System.out.println("Enter your last name: ");
		String lastname = kb.next();
		System.out.println("Would you like to use a public avatar? (y for yes, n for no) ");
		String avatar = kb.next();
		if(avatar.equals("n"))
		{
			User pH1 = new User(firstname, lastname);
			System.out.println(pH1);
		}
		if(avatar.equals("y"))
		{
			System.out.println("What avatar would you like? ");
			String avatar1 = kb.next();
			User pH2 = new User(firstname, lastname, avatar1);
			System.out.println(pH2);
		}
	}
}
