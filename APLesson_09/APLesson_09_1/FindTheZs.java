package APLesson_09_1;
import java.util.Scanner;
public class FindTheZs
{
   static String [] words;
   public static void main(String[]args)
   {
       String [] words = new String[5];
       fillArray(words);
       
       System.out.println("For the following words..."); 
       printArray(words);
       System.out.println("\n Only " + hasZs(words) + " contain(s) the letter z.");
   }
   public static void fillArray(String [] words)
   {
       Scanner kb = new Scanner(System.in);
       System.out.println("Please enter 5 words");
       for(String word : words)
       {
           word = kb.next();
       }
   }
   public static void printArray(String [] words)
   {
       for(String word : words)
           System.out.print(word + " ");
   }
   public static int hasZs(String [] words)
   {
       String Zs = next();
       for(String word : words)
       {
           if(words.indexOf("z") >= 0)
           {
               Zs += word;
           }
       }
       return Zs;
   }
}
