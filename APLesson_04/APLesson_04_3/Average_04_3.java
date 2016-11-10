import java.util.Scanner;
public class Average_04_3
{
    public static void main(String[]args)
    {
        Scanner kb = new Scanner(System.in);
        
        System.out.println("Enter the first number");
        double num1 = kb.nextDouble();
        System.out.println("Enter the second number");
        double num2 = kb.nextDouble();
        System.out.println("Enter the third number");
        double num3 = kb.nextDouble();
        
        print(num1, num2, num3, average(num1, num2, num3));
    }
    
    public static double average(double num1, double num2, double num3)
    {
        return (num1 + num2 + num3)/3;
    }
    
    public static void print(double num1, double num2, double num3, double average)
    {
        System.out.printf("The average of " + num1 + ", " + num2 + ", and " + num3 + " is %.5f", average);
        //System.out.printf("The average is %.5f", average);
    }
}
