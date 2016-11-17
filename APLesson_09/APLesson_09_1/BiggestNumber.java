public class BiggestNumber
{
   static int [] numbers;
   public static void main(String[]args)
   {
       int [] numbers = new int[10];
       fillArray(numbers);
       
       System.out.println("For the following numbers..."); 
       printArray(numbers);
       System.out.println("\n The biggest number is " + getBiggest(numbers));
   }
   public static void fillArray(int [] numbers)
   {
       for(int i = 0; i < numbers.length; i++)
       {
           numbers[i] = (int)(Math.random() * 100) + 1;
       }
   }
   public static void printArray(int [] numbers)
   {
       for(int num : numbers)
           System.out.print(num + " ");
   }
   public static int getBiggest(int [] numbers)
   {
       int max = 0;
       for(int num : numbers)
       {
           if(num > max)
           {
               max = num;
           }
       }
       return max;
   }
}
