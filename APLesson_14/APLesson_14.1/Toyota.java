import java.util.Arrays;
public class Toyota extends Car
{
    private String loc;
    
    public Toyota()
    {
        loc = "";
    }
    public Toyota(String lcte)
    {
        loc = lcte;
    }
    public void move (double x, double y)
    {
        String [] locate = loc.split(", ");
		double [] lcte = new double[2];
		lcte[0] = Double.parseDouble(locate[0]) + x;
		lcte[1] = Double.parseDouble(locate[1]) + y;
		loc = "" + lcte[0] + ", " + lcte[1];
    }
    public int getID()
    {
        return (int)(Math.random() * 1000000) + 1;
    }
    public double [] getLoc()
    {
        double [] location = new double[2];
        String [] locate = loc.split(", ");
        location [0] = Double.parseDouble(locate[0]);
        location [1] = Double.parseDouble(locate[1]);
        return location;
    }
}
