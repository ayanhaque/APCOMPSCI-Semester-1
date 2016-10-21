package APLesson_05_2;
import java.util.Scanner;
public class Adventure
{
    public static void main(String[]args)
    {
        Scanner kb = new Scanner(System.in);
        System.out.println("Would you like to..." +
                            "\n 1. Go to London" +
                            "\n 2. Go to Mexico");
        String destination = kb.next();
        if(destination.equals("1"))
        {
            System.out.println("Would you like to travel by..." +
                                "\n 1. Plane" +
                                "\n 2. Ship");
            String londontravel = kb.next();
            if(londontravel.equals("1"))
            {
                System.out.println("Do you prefer..." + 
                                    "\n 1. First Class" +
                                    "\n 2. Economy");
                String plane = kb.next();
                if(plane.equals("1"))
                {
                    System.out.println("Do you prefer..." +
                                        "\n 1. Window Seat" +
                                        "\n 2. Aisle Seat");
                    String seat = kb.next();
                    if(seat.equals("1"))
                        System.out.println("Have a safe journey!");
                    else
                        System.out.println("Enjoy your trip!");
                }
                else
                {
                    System.out.println("Are you fit to be seated in an exit row?" +
                                        "\n 1. Yes" +
                                        "\n 2. No");
                    String exit = kb.next();
                    if(exit.equals("1"))
                        System.out.println("Thank you for your cooperation!");
                    else
                        System.out.println("We wish you a safe journey!");
                }
            }
            else
            {   
                System.out.println("Do you get seasick?" +
                                    "\n 1. Yes" +
                                    "\n 2. No");
                String seasick = kb.next();
                if(seasick.equals("1"))
                {
                    System.out.println("Do you take medicine for it?" +
                                        "\n 1. Yes" +
                                        "\n 2. No");
                    String med = kb.next();
                    if(med.equals("1"))
                    {
                        System.out.println("How often do you take your medicine?" +
                                            "\n 1. Less than twice per day" +
                                            "\n 2. More than twice per day");
                        String rate = kb.next();
                        if(rate.equals("1"))
                            System.out.println("We have recorded your response. Adios!");
                        else
                            System.out.println("We have recorded your response. Thank you!");
                    }
                    else
                    {
                        System.out.println("Do you prefer..." +
                                            "\n 1. Standard Mattress" +
                                            "\n 2. Water Bed");
                        String level = kb.next();
                        if(level.equals("1"))
                            System.out.println("We will have your standard room ready. Thank you!");
                        else
                            System.out.println("We will have your \"aquatic\" room ready. Thank you!");
                    }
                }
                else
                    {
                        System.out.println("Do you prefer..." +
                                            "\n 1. Upper level" +
                                            "\n 2. Base level");
                        String level = kb.next();
                        if(level.equals("1"))
                            System.out.println("We will have your room ready on the top floor. Thank you!");
                        else
                            System.out.println("We will have your room ready on the base level. Thank you!");
                    }
            }    
        }
        else
        {
            System.out.println("Would you like to travel by..." +
                                "\n 1. Car" +
                                "\n 2. Plane");
            String mexicotravel = kb.next();
            if(mexicotravel.equals("1")) 
            {
                System.out.println("Will the driver be..." +
                                    "\n 1. You" +
                                    "\n 2. A friend");
                String driver = kb.next();
                if(driver.equals("1"))
                {
                    System.out.println("How old are you?" +
                                        "\n 1. 16-20" +
                                        "\n 2. 21 and over");
                    String age = kb.next();
                    if(age.equals("1"))
                    {
                        System.out.println("How many years have you carried a drivers license?" +
                                            "\n 1. Less than 1 year" +
                                            "\n 2. More than 1 year");
                        String you = kb.next();
                        if(you.equals("1"))
                            System.out.println("You may not be qualified.");
                        else
                            System.out.println("You are likely qualified.");
                    }
                    else
                    {
                        System.out.println("Do you usually drive long distances?" +
                                            "\n 1. Yes" +
                                            "\n 2. No");
                        String distance = kb.next();
                        if(distance.equals("1"))
                            System.out.println("You are qualified");
                        else
                            System.out.println("You are possibly qualified");
                    }
                }
                else
                {
                   System.out.println("How old is your friend?" +
                                            "\n 1. 16-20" +
                                            "\n 2. 21 and over");
                   String friend = kb.next();
                   if(friend.equals("1"))
                   {
                       System.out.println("How many years has your friend carried a drivers license?" +
                                            "\n 1. Less than 1 year" +
                                            "\n 2. More than 1 year");
                       String friendcarry = kb.next();
                       if(friendcarry.equals("1"))
                           System.out.println("Your friend is not qualified");
                       else
                           System.out.println("Your friend is likely qualified");
                   }
                   else
                   {
                       System.out.println("Does your friend usually drive long distances?" +
                                            "\n 1. Yes" +
                                            "\n 2. No");
                       String frienddistance = kb.next();
                       if(frienddistance.equals("1"))
                           System.out.println("Your friend is qualified");
                       else
                           System.out.println("Your friend is possibly qualified");
                   }
                }
            }
            else
            {
               System.out.println("Do you prefer..." +
                                   "\n 1. First Class" +
                                   "\n 2. Economy");
               String seatmexico = kb.next();
               if(seatmexico.equals("1"))
               {
                   System.out.println("Your seat includes a complimentary meal. Do you prefer..." +
                                       "\n 1. Chicken" +
                                       "\n 2. Vegetarian");
                   String mealmexico = kb.next();
                   if(mealmexico.equals("1"))
                       System.out.println("Thank you. Your response has been recorded.");
                   else
                       System.out.println("Thank you. We have taken note of your response.");
               }
               else
               {
                   System.out.println("Your seat does not include a meal. Would you like to order in-flight?" +
                                        "\n 1. Yes" +
                                        "\n 2. No");
                   String economymeal = kb.next();
                   if(economymeal.equals("1"))
                       System.out.println("Thank you for your business! Your response has been recorded.");
                   else
                       System.out.println("Thank you for your business! Your response has been recorded.");
               }
            }
        }
    }
}
