package APLesson_14_1;
import java.util.ArrayList;
public class Driver
{
   public static void main(String[]args)
   {
		double one = (int)(Math.random() * 100) + 1;
		double two = (int)(Math.random() * 100) + 1;
		
		ArrayList<Location> lcte = new ArrayList<>();
		double [] honLoc = {5, 6};
		lcte.add(new Honda(honLoc));
		lcte.add(new Toyota("8, 9"));
		lcte.add(new GMC(3, 8));

		double[] home = {0, 0};

        String printout = "\n\n" +
				"==========================" + "\nStarting locations...";

        for (Location l : lcte)
		{
			printout += "\nLocation for " + l.getID() + ": (" + getLocation(l.getLoc()) + ")";
		}

        printout += "\n\n" + "==========================" +
						"\nDistance from home...";
						
		System.out.println(printout);

        for (Location l : lcte)
		{
			System.out.printf("\nDistance for %d : (%.2f)", l.getID(), getDistance(l.getLoc(), home));
		}

        
		
		String printout1 = "\n\n" +
				"==========================";
				
		System.out.println(printout1);
				
		for(Location l : lcte)
		{
			((Car)l).move(one, two);
			System.out.printf("\nAfter %d Moved (%.2f, %.2f)\nNew Location: (%s)", l.getID(), one, two, getLocation(l.getLoc()));
		}
		
		System.out.println();
		
		for (Location l : lcte)
		{
			System.out.printf("\nDistance for %d: (%.2f)", l.getID(), getDistance(l.getLoc(), home));
		}		
		
   }

    public static double getDistance(double[] car, double[] home)
   {
       return Math.sqrt((Math.pow(car[0] - home[0], 2)+ Math.pow(car[1] - home[1], 2)));
   }

    public static String getLocation(double[] loc)
   {
       return String.format("%.2f, %.2f", loc[0], loc[1]);
   }
}