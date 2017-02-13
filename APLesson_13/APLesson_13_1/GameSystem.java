public class GameSystem
{
<<<<<<< HEAD
    private String platform; 
    private int serialNo;
=======
	private String platform;
	private int serialNo;
>>>>>>> origin/master
    
	public GameSystem()
	{
		this.platform = "";
		this.serialNo = 0;
	}
    
	public GameSystem(String p)
	{
        	this.platform = p;
		this.serialNo = (int)(Math.random() * 10000000) + 1;
	}
    
    	public String getPlatform()
    	{
		return platform;
    	}
   	public int getSerialNo()
    	{
		return serialNo;
<<<<<<< HEAD
	}
}
=======
    	}
}
>>>>>>> origin/master
