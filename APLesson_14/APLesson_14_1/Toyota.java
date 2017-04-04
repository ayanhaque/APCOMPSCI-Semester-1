package APLesson_14_1;
import java.util.Arrays;
public class Toyota extends Car
{
	public Toyota()
	{}
	
	public Toyota(String loc)
	{
		String[] lcte = loc.split(", ");
		locate[0] = Double.parseDouble(lcte[0]);
		locate[1] = Double.parseDouble(lcte[1]);
	}
}