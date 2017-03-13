import java.util.Arrays;
public class GMC extends Car
{
    private double x, y;
    
    public GMC()
    {
        x = 0;
        y = 0;
    }
    
    public GMC(double xx, double yy)
    {
        x = xx;
        y = yy;
    }
    
    public void move(double xx, double yy)
    {
        x = xx;
        y = yy;
    }
    
    public int getID()
    {
        return (int)(Math.random() * 1000000) + 1;
    }
    public double [] getLoc()
    {
        double [] loc = new double[2];
        loc[0] = x;
        loc[1] = y;
        return loc;
    }
}
