package demopack10;

public class ShowRoom 
{
	public static void main (String[] args)
	{
		Watches w1=new Watches(3,54,46);
		System.out.println(w1);
		Watches w2=new Watches(3,54,46);
		System.out.println(w2);
		boolean b1=w1.equals(w2);
		System.out.println(b1);
	}

}
