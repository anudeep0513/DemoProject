package demopack7;

import java.util.Scanner;

public class ExceProg {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner d1=new Scanner(System.in);
		int a=d1.nextInt();
		int b=d1.nextInt();
		try
		{
			System.out.println(a/b);
		}
		catch(ArithmeticException rv)
		{
		   System.out.println("divison with zero is not possible");
		   System.out.println("reenter the value of b");
		   b=d1.nextInt();
		}

	}

}
