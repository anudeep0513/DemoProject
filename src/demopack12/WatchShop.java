package demopack12;

public class WatchShop 
{
	public static void main(String[] args)
	{
		Watch w1=new Watch(15,30,47);
		Watch w2=new Watch(56,78,34);
		InvalidTimeException i1=new InvalidTimeException();
		System.out.println(i1);
		String s2=w1.test();
		String s3=w2.test();
		System.out.println(s2);
		System.out.println(s3);
	}
}
