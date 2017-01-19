import java.util.Scanner;
public class HumanDriver
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter the hair color:");
		String hair = kb.nextLine();
		System.out.println("Please enter the eye color:");
		String eyes = kb.nextLine();
		System.out.println("Please enter the skin color:");
		String skin = kb.nextLine();
		
		Human object = new Human(hair, eyes, skin);
		System.out.println("My info...\nHair:\t" + object.getHair() + "\nEyes:\t" + object.getEyes() + "\nSkin:\t" + object.getSkin());
		
		object.setHES("red", "green", "blue");
		System.out.println("Friend's info...\nHair:\t" + object.getHair() + "\nEyes:\t" + object.getEyes() + "\nSkin:\t" + object.getSkin());

	}
}
