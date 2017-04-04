import java.util.Arrays;
public class Toyota extends Car
{
    public Toyota()
    {}
    public Toyota(String lcte)
    {
        location = new double[2];
		String [] loc = lcte.split(", ");
		location[0] = Double.parseDouble(loc[0]);
		location[1] = Double.parseDouble(loc[1]);
    }
}
