package demopack8;

public class ExcepProg {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		try
		{
			dispaly();
			
		}
		catch(InterruptedException rv)
		{
			System.out.println("re enter");
		}

	}
	public static void display() throws InterruptedException
	{
		Thread.sleep(3000);
		System.out.println("hii");
	}
}
