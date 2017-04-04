package APLesson_14_1;
public class Car implements Location
{
	public double[] locate;
	public final int ID = (int)(Math.random() * 1000000) +1;
	
	public Car()
	{
		locate = new double[2];
	}
	
	public int getID()
	{
		return ID;
	}
	
	public void move(double one, double two)
	{
		locate[0] += one;
		locate[1] += two;
	}
	
	public double[] getLoc()
	{
		return locate;
	}
}