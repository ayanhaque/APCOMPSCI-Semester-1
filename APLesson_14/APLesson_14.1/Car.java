public class Car implements Location
{
    	public double[] location;
	public final int ID = (int)(Math.random() * 1000000) + 1;
	
	public Car()
	{
		location = new double[2];
	}
	public int getID()
	{
		return ID;
	}
	public void move(double one, double two)
	{
		location[0] += one;
		location[1] += two;
	}
	public double[] getLoc()
	{
		return location;
	}
}
