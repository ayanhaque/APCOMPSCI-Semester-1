import static java.lang.Math.*;
public class MilesPerHour
{
	private int distance, hours, minutes;
	private double mph;
	
	public MilesPerHour()
	{
		//default values for instance vars
		distance = 0;
		hours = 0;
		minutes = 0;
		mph = 0;
	}
	
	public MilesPerHour(int dist, int hrs, int mins)
	{
		distance = dist;
		hours = hrs;
		minutes = mins;
		mph = 0;
	}
	
	public void setMilesPerHour(int dist, int hrs, int mins)
	{
		distance = dist;
		hours = hrs;
		minutes = mins;
	}
	
	public getDist();
	{
		return distance;
	}
	public getHrs()
	{
		return hours;
	}
	public getMins()
	{
		return minutes;
	}
	
	public double getMilesPerHour()
	{
		mph = Math.round(distance / (hours + minutes / 60.0));
		return mph;
	}
}