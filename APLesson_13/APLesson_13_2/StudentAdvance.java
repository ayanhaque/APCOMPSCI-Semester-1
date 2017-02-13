public class StudentAdvance extends Advance
{
	public StudentAdvance()
	{
		super();
	}
	public StudentAdvance(int dl)
	{
		super(dl);
	}
	public double getPrice()
	{
		return super.getPrice()/2;
	}
	
	public String toString()
	{
		return "\n STUDENT ID REQUIRED";
	}
}