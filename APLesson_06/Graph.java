import java.util.Scanner;
public class Graph
{
   public static void main(String[]args)
    {
        Scanner kb = new Scanner(System.in);
        System.out.print("Please enter a number:  ");
        int num = kb.nextInt();
        int product;
        System.out.println("Iterator||  Output");
        System.out.println("==================");
        for(int i = 1; i <= num; i++)
        {
            product = i*num;
            System.out.println("    "+i+"   ||  "+product+"");
        }
        
    }
}
