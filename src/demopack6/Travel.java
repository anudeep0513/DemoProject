package demopack6;

public class Travel 
{
	public static void main (String[] args)
	{
     Bus b1=new Bus("Orange","hyd","ddk","ap27h3738");
     System.out.println(b1);
     Bus b2=new Bus("Ms","ddk","hyd","ap27g3475");
     System.out.println(b2);
     boolean status=b1.equals(b2);
     System.out.println(status);
	}
}
