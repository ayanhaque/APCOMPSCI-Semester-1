import java.util.Scanner;
<<<<<<< HEAD
public class Box
{
   public static void main(String[]args)
    {
        Scanner kb = new Scanner(System.in);
        System.out.print("Please enter a word:  ");
        String word = kb.next();
        for(int i = 0; i < word.length(); i++)
        {
            System.out.println(word);
        }     
    }
}
  
=======
public class Reverse
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter a word: ");
		String word = kb.next();
		
		for(int i = 7; i >= word.length(); i--)
		{
			System.out.println(word.substring(i,0));
		}
	}
}
>>>>>>> origin/master
