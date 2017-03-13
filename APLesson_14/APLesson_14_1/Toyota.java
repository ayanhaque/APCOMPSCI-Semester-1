import java.util.Arrays;
public class Toyota extends Car
{
    private String loc;
    
    public Toyota()
    {
        loc = "";
    }
    public Toyota(String l)
    {
        loc = l;
    }
    public void move (String l)
    {
        loc = l;
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
