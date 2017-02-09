import java.util.ArrayList;
public class ToyStore
{
    private ArrayList<Toy> toyList;
    
    public ToyStore()
    {
        toyList = new ArrayList<>();
    }
    
    public ToyStore(String tl)
    {
        loadToys(tl);
    }
    
    public static void loadToys(String ts)
    {
        toys = ArrayList<String>(ts.split(", "));
        
        for (int i = 0; i <= toys.size(); i++)
        {
            String name = toys.get(i);
            String type = toys.get(i+1);
            Toy = new ArrayList<String>(getThatToy(name));
            if (Toy.equals("null"))
            {
                if(type.equals("Car"))
                {
                    return Car;
                }
                if(type.equals("AF"))
                {
                    return AFigure;
                }
            }
            else
                count += 1;
        }
    }
    public static String getThatToy(String nm)
    {
        for(String tl: toyList)
        {
            if(toy==nm)
            {
                return Toy;
            }
            else
                return null;
        }
    }
    public static String getMostFrequentToy()
    {
        String name = "";
        int max = Integer.MIN_VALUE;
        for(String tl: toyList)
        {
            if(max < count)
            {
                max = count;
                name = Toy.get();
            }
        }
        return name;
    }
    public static int getMostFrequentType()
    {
        int cars = 0;
        int figures = 0;
        for(String tl: toyList)
        {
            if(type.equals("Car"))
            {
                cars +=1;
            }
            if(type.equals("AF"))
            {
                figures += 1;
            }
        }
        if(cars > figures)
        {
            return "Cars";
        }
        if(figures > cars)
        {
            return "Action Figures";
        }
        else
            return "Equal amounts of action figures and cars!";
    }
    public ArrayList toString()
    {
        return toyList;
    }
}