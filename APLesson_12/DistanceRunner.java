import java.util.Scanner;
public class DistanceRunner
{
   public static void main(String[]args)
   {
       Scanner kb = new Scanner(System.in);
       
       System.out.println("Please enter the x1 coordinate: ");
       int x1 = kb.nextInt();
       System.out.println("Please enter the y1 coordinate: ");
       int y1 = kb.nextInt();
       System.out.println("Please enter the x2 coordinate: ");
       int x2 = kb.nextInt();
       System.out.println("Please enter the y2 coordinate: ");
       int y2 = kb.nextInt();
       
       
       Distance object = new Distance(x1, y1, x2, y2);
       System.out.println("The distance between points (" + object.getXOne() + ", " + object.getYOne() + ") and (" + object.getXTwo() + ", " + object.getYTwo() + ") is " + object.getDist());
	   object.setValues(1, 2, 3, 4);
	   System.out.println("The distance between points (" + object.getXOne() + ", " + object.getYOne() + ") and (" + object.getXTwo() + ", " + object.getYTwo() + ") is " + object.getDist());
   }
}
