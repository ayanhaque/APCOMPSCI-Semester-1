public abstract class Car implements Location
{
    private final int ID = (int)(Math.random() * 1000000) + 1;
    public double [] location;
    
	public Car()
    {
		location = new double [2];
	}
	public void move(double one, double two)
	{
		location[0] += one;
		location[1] += two;
	}
	public int getID()
	{
		return ID;
	}
	public double [] getLoc()
	{
		return location;
	}
}
