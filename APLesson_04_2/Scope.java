public class Scope //scope of a variable is where you can use it
{
    public static void main(String[]args)
    {
        int var2 = 47; //var2 can only be used in the main method, because that's where it is declared (inside the curly brakets)
        //System.out.println(var2);
        method1();
    }
    
    public static void method1 ()
    {
        double var3 = 89.1;
        System.out.println(var3);
        // System.out.println(var2); would get an error saying var2 not found, because it is not declared
    }
}
