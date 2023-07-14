package demopack5;

public class ClockTour 
{
  String loc;
  Clock c;
	public ClockTour(String loc,Clock c)
	{
		this.loc=loc;
		this.c=c;
	}
	public void showTime()
	{
		c.time();
	}
}
