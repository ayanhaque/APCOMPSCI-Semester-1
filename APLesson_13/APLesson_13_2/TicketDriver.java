public class TicketDriver
{
	public static void main(String[]args)
	{
		Walkup walkup = new Walkup();
		System.out.println(walkup);
		
		Advance adv = new Advance();
		System.out.println(adv);
		
		StudentAdvance sadv = new StudentAdvance();
		System.out.println(sadv);
	}
}