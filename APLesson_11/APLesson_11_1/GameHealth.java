import java.util.Scanner;
public class GameHealth
{
    static String[] health;
    static int HEALTHLOAD = 6;
    static int healthCount;
    public static void main(String[]args)
    {
        Scanner kb = new Scanner(System.in);
        String turn = "";
        int damage = 0;
        int amount = 0;
        healthCount = 6;
        health = new String[HEALTHLOAD];
        while(turn != "Q" && healthCount > 0)
        {
            System.out.println("Your turn! Hit Enter when you're ready: ");
            String turn1 = kb.next();
            
            damage = (int)(Math.random() * 2) + 1;
            amount = (int)(Math.random() * 6) + 1;
            
            //print takeDamage()@param damage, amount
            System.out.println(takeDamage(damage, amount));
            printClip();
        }
        System.out.println("You died!!!");
    }
    public static String takeDamage(int dmg, int amt)
    {
        if(dmg == 1)
        {
            amt = healthCount - amt;
            return "Taking [amt] damage!";
        }
        
        else
        {
            if(healthCount + amt < HEALTHLOAD)
                amt = healthCount + amt;
            else
                healthCount = HEALTHLOAD;
            return "Power Up [amt]";
        }
    }
    public static void printClip()
    {
        String output = "Health: " + "\t";
        for(int i = 0; i < HEALTHLOAD; i++)
        {
            if(i < healthCount)
                health[i] = " @ ";
            else
                health[i] = "[]";
            health[i] += output;
        }
        System.out.println(output);
    }
}
