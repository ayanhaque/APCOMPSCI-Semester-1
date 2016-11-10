import java.util.Scanner;
public class GPA
{
    public static void main(String[]args)
    {
        Scanner kb = new Scanner(System.in);
        
        System.out.println("What is your Math grade?");
        String grade1 = kb.next();
        System.out.println("What is your Science grade?");
        String grade2 = kb.next();
        System.out.println("What is your History grade?");
        String grade3 = kb.next();
        System.out.println("What is your French grade?");
        String grade4 = kb.next();
        System.out.println("What is your Psychology grade?");
        String grade5 = kb.next();
        System.out.println("What is your Art grade?");
        String grade6 = kb.next();
        System.out.println("What is your Computer Science grade?");
        String grade7 = kb.next();
        
        double gPoints = calcPoints(grade1) + calcPoints(grade2) + calcPoints(grade3) + calcPoints(grade4) + calcPoints(grade5) + calcPoints(grade6) + calcPoints(grade7);
        double gpa = gPoints/7;
        System.out.printf("Your GPA is %.2f", gpa);
    }
    
    public static double calcPoints(String grade)
    {
       
       if (grade.equals("A"))
            return 4.0;
       if (grade.equals("B"))
            return 3.0;
       if (grade.equals("C"))
            return 2.0;
       if (grade.equals("D"))
            return 1.0;
       else
            return 0.0;
       
    }
}
