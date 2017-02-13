public class GameRunner
{
    public static void main(String[]args)
    {
        XBox xbox = new XBox("XBox");
        System.out.println(xbox);
        
        PlayStation ps = new PlayStation("PlayStation");
        System.out.println(ps);
        
        PC pc = new PC("PC");
        System.out.println(pc);
    }
}
