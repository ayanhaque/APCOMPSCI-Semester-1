import java.util.Arrays;
public class GMC extends Car
{
    private double x, y;
    
    public GMC()
    {}
    
    public GMC(double xx, double yy)
    {
        location[0] += xx;
		location[1] += yy;
    }

}
