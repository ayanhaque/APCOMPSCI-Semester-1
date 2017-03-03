import java.util.Arrays;
public class Honda implements Location
{
	private double [] locate;
	
	public Honda()
	{
		locate = new double[2];
	}
	
	public Honda(double [] l)
	{
		locate = new double[2];
		locate = l;
	}
	
	public int getID()
	{
		return (int)(10000000 * Math.random()+1);
	}
	
	public void move(double xx, double yy)
	{
		locate[0] = xx;
		locate[1] = yy;
	}
	
	public double[] getLoc()
	{
		return locate;
	}
}