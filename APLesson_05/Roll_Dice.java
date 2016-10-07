import java.util.Random;
public class Roll_Dice
{
   public static void main(String[]args)
   {
     Random rand = new Random();
     int player = rand.nextInt(6) + 1; 
     int computer = rand.nextInt(6) + 1;
     
     String winner = rollDice(player, computer);
     
     System.out.println("You rolled a " + player);
     System.out.println("Computer rolled a " + computer);
     System.out.println("The winner is the " + winner + "!");
   }
   
   public static String rollDice(int player, int computer)
   {
       String winner="";
       
       if (player<computer)
       {
           winner = "computer";
       }
       
       if (player > computer)
       {
           winner = "player";
       }
   
       return winner;
   }
}