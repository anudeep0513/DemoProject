package demopack6;

public class Bus
{
	String reName;
	String dp;
	String bp;
	String agName;
	public Bus(String reName,String dp,String bp,String agName) 
	{
		this.reName=reName;
		this.dp=dp;
		this.bp=bp;
		this.agName=agName;
	}
	@Override
	public String toString()
	{
		return this.reName+" with "+this.agName+" starts from "+this.bp+" stops at "+this.dp;
	}
	@Override 
	public boolean equals(Object o1)
	{
		Bus b2=(Bus) o1;
		return (this.dp==b2.dp);
	}

}
