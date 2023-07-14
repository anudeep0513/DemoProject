package demopack10;

public class Watches 
{
	private int hr;
	int min;
	int sec;
	public Watches(int hr,int min,int sec)
	{
		super();
		if ((hr>=0 && hr<=12) && (min>=0 && min<=59) && (sec>=0 && sec<=59))
		{
		this.hr=hr;
		this.min=min;
		this.sec=sec;
		}
		else
		{
			System.out.println("invalid data");
		}
	}
    @Override
    public String toString()
    {
	    return this.hr+"hours "+this.min+"min "+this.sec+"seconds";
    }
    @Override
    public boolean equals(Object o1)
    {
    	Watches w2=(Watches) o1;
    	return (this.hr==w2.hr && this.min==w2.min && this.sec==w2.sec);
    }
    
}

