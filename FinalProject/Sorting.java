public class Sorting
{
	private String major;
	private String category;
	
	public Sorting()
	{
		major= "";
		category = "";
	}
	
	public Sorting(String m)
	{
		major= m;
		category = category(major);
	}
	
	public String getMajor()
	{
		return major;
	}
	
	public String getCategory()
	{
		return category;
	}
	
	public String category(String major)
	{
		if(major.equals("Business Administration") || 
		   major.equals("Accounting") ||
		   major.equals("Economics") ||
		   major.equals("Advertising and Marketing"))
		   {
			   return "Business";
		   }
		else if(major.equals("Biology") || 
		   major.equals("Chemistry") ||
		   major.equals("Physics") ||
		   major.equals("Environmental Science") ||
		   major.equals("Psychology"))
		   {
			   return "Science";
		   }
		else if(major.equals("Electrical Engineering") || 
		   major.equals("Mechanical Engineering") ||
		   major.equals("Biomedical Engineering"))
		   {
			   return "Engineering";
		   }
		else if(major.equals("Computer Science") ||
				major.equals("Game Design") ||
				major.equals("Computer Programming"))
		   {
			   return "Technology";
		   }
		else if(major.equals("Applied Mathematics") || 
		   major.equals("Statistics") ||
		   major.equals("Biomathematics"))
		   {
			   return "Mathematics";
		   }
		else if(major.equals("Animation") || 
		   major.equals("Photography") ||
		   major.equals("Theatre"))
		   {
			   return "Arts";
		   }
		else if(major.equals("Journalism") || 
		   major.equals("Criminal Justice") ||
		   major.equals("English") ||
		   major.equals("History") ||
		   major.equals("Political Science"))
		   {
			   return "Humanities";
		   }   
		return "";
	}
	public String toString()
	{
		return "Major: " + getMajor() + "\nCategory: " + getCategory();
	}
}