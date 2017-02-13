public class Advance extends Ticket
{
	private int daysLeft;
	
	public Advance()
	{
		super();
	}
	public Advance(int dl)
	{
		super();
		daysLeft = dl;
	}
	public double getPrice()
	{
		if(daysLeft >= 10)
			return 40.00;
		else
			return 30.00;
	}
}