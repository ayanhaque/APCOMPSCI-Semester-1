import java.util.Scanner;
public class Compound_Interest
{
    public static void main(String[]args)
    {
        Scanner kb = new Scanner(System.in);
        
        System.out.println("Enter the interest rate: ");
        double r = kb.nextDouble();
        
        System.out.println("Enter the principal (the original amount you intend to borrow): ");
        double P = kb.nextDouble();
        
        System.out.println("Enter the number of times the loan is compounded per year: ");
        double n = kb.nextDouble();
        
        System.out.println("Enter the life of the loan (in years): ");
        double t = kb.nextDouble();

        
        payment(r, P, n, t);
        
        System.out.printf("Your monthly payment will be $%.2f", payment(r, P, n, t));
    }
    
    public static double payment(double r, double P, double n, double t)
    {
        return (P * (Math.pow(1+(r/n), n*t))/(12*t));
    }
}
