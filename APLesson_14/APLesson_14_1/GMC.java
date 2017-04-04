package APLesson_14_1;
import java.util.Arrays;
public class GMC extends Car
{	
	public GMC()
	{}
	
	public GMC(double xx, double yy)
	{
		locate[0] += xx;
		locate[1] += yy;
	}
}