public abstract class Car implements Location
{
    private int ID;
    
    public Car()
    {
        ID = (int)(Math.random() * 1000000) + 1;
    }
}
