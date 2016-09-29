import java.util.Scanner;

public class ID_Card
{
    public static void main(String[]args)
    {
        ID_Card form = new ID_Card();
        
        Scanner kb = new Scanner(System.in);
        
        System.out.println("Enter your first name: ");
        String question1 = kb.next();
        System.out.println("Enter your last name: ");
        String answer1 = kb.next();
        
        System.out.println("Enter your title: ");
        String question2 = kb.next();
        
        String keyboard = kb.nextLine();
        System.out.println("Enter the school site: ");
        String answer2 = kb.nextLine();
        
        System.out.println("Enter the school year: ");
        String question3 = kb.next();
        
        String key = kb.nextLine();
        System.out.println("What is your subject? ");
        String answer3 = kb.nextLine();
        
        System.out.println("  ");
        System.out.println("********************************");
        
        form.format(question2, answer2);
        form.format(question1, answer1);
        form.format(question3, answer3);

        
        System.out.println("\n********************************");
    }
     public void format(String question, String answer)
    {
        System.out.printf("\n* %7s  %19s *", question, answer);
    }
}