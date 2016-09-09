import java.util.Scanner; //import Statement

public class RudeAI
{
	public static void main(String[]args)
	{
		//instantiate the new Scanner object "keyboard"
		Scanner keyboard = new Scanner(System.in);
		
		//prompt for user input
		
		System.out.println("Hi, my name is RudeAI. I'd like to ask you a few questions. What is your name? ");
		
		String name = keyboard.next();
		
		System.out.println(name + "?" + " How do you even say that? What kind of four letter name is such a hassle to say?");
		
		System.out.println("How old are you? ");
		
		//search for the next integer that the user enters
		int num = keyboard.nextInt();
		
		//print the results...
		System.out.println("Wow! " + num + " is kind of old for a coding rookie don't you think? You do you I guess.");
		
		keyboard.nextLine();
		
		System.out.println("What do you do for fun " + name + "?");
		
		String fun = keyboard.nextLine();
		
		System.out.println("Only nerds like to " + fun + " Don't you have any interesting hobbies?");
		
		keyboard.nextLine();
		
		System.out.println("What kind of music do you like? ");
		
		String music = keyboard.nextLine();
		
		System.out.println("That's not even an answer! You can't just like " + music + "! You have to choose. You're not good at following directions, are you?");
		
		System.out.println("How many siblings do you have? ");
		
		String siblings = keyboard.next ();
		
		System.out.println(siblings + " is a good amount. Hopefully they're smarter than you.");
		
		keyboard.nextLine();
		
		System.out.println("What do you want to be when you grow up?");
		
		String be = keyboard.nextLine();
		
		System.out.println("You want to be " + be + "? What are you doing in AP Computer Science? Get out!");
	}
}