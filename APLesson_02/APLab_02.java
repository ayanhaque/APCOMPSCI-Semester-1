public class APLab_02
{
	public static void main(String[]args)
	{
		int num1 = 6;
		int num2 = 8;
		int answer = num1*num2;
		
		System.out.println(num1 + " multiplied by " + num2 + " is " + answer);
		System.out.println("    ");
		String name = "Torrey Pines High School\n";
		String address = "3710 Del Mar Heights Rd \n";
		String citystatezip = "San Diego CA 92130";
		System.out.println(name + " " + address + " " + citystatezip);
		System.out.println("   ");
		int l = 5;
		int w = 7;
		int h = 4;
		int SurfaceArea = 2 * l * w + 2 * w * h + 2 * l * h;
		
		System.out.println("The surface area of your rectangle is" + " " + SurfaceArea);
	}
}