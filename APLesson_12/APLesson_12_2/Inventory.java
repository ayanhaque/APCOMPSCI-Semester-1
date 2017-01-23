public class Inventory
{
	private String manufacturer, name, category;
	private int upc, price;
	
	public Inventory(String m, String n)
	{
		manufacturer = m;
		name = n;
		upc = (int)(Math.random() * 1000000000) + 1;
	}
	
	public Inventory(String m, String n, String cat, int p)
	{
		manufacturer = m;
		name = n;
		category = cat;
		price = p;
		upc = (int)(Math.random() * 1000000000) + 1;
	}
	
	public String toString()
	{
		return "Inventory Items...\nItem Manufacturer: " + manufacturer +
                           "\nItem Name: " + name +
                           "\nItem Category: " + category +
                           "\nItem Price: $" + price + "\nUPC: " + upc;
	}
}
