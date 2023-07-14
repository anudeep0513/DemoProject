package demopack12;

public class Watch 
{
	public int hour;
	 public int min;
	 public int sec;
	public Watch(int hour,int min,int sec)
	{
		try
		{
			if ((hour>=0 && hour<=23) &&(min>=0 && min<=59)&&(sec>=0 && sec<=59))
			{
				this.hour=hour;
				this.min=min;
				this.sec=sec;
			}
			else
			{
				throw new InvalidTimeException();
			}
		}
		catch(Exception e)
		{
			System.out.println("enter valid time");
		}
	}
	public String test() 
	{
		return this.hour+" hours  "+this.min+" min  "+this.sec+" seconds";
		
	}
}
