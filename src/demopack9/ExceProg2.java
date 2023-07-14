package demopack9;

import java.util.Scanner;

public class ExceProg2 {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		try
		{
			division();
		}
		catch(ArithmeticException rv)
		{
			System.out.println("division eith zero is not possible");
			System.out.println("enter correct value");
		}
		
		finally 
		{
			System.out.println("final block");
		}

	}
	public static void division() 
	{
		Scanner d1=new Scanner(System.in);
		int a=d1.nextInt();
		int b=d1.nextInt();
		System.out.println(a/b);
	}

}
