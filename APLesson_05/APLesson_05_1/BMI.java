package APLesson_05_1;
import java.util.Scanner;
public class BMI
{
   public static void main(String[]args)
   {
       Scanner kb = new Scanner(System.in);
       
       System.out.println("Enter your height in inches: ");
       double height = kb.nextDouble();
       System.out.println("Enter your weight in pounds: ");
       int weight = kb.nextInt();
       
       double BMI = 703 * weight/(height*height);
       
       String condition = calcCondish(BMI);
       
       System.out.printf("Your BMI is %.2f", BMI);
       System.out.printf("\nYou are " + condition);
   }
   public static String calcCondish(double BMI)
   {
       String condition="";
       
       if (BMI > 39.9)
           return "Morbidly Obese";
       else if (BMI > 35)
           return "Very Obese";
       else if (BMI > 29.9)
           return "Obese";
       else if (BMI > 25)
           return "Overweight";
       else if (BMI > 18.5)
           return "Normal";
       else 
            return "Underweight";
   }
}
