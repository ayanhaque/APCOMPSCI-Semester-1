import java.util.Scanner;
public class XCount
{
   public static void main(String[]args)
    {
        Scanner kb = new Scanner(System.in);
        System.out.print("Please enter a number to count up to:  ");
        int top = kb.nextInt();
        System.out.print("Please enter a number to count up by:  ");
        int counter = kb.nextInt();
        
        for( int i = counter; i <= top; i+= counter)
        {
            System.out.print(""+i+" ");
        }
        System.out.println();
        
    }
}
