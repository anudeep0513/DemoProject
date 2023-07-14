package demopack11;

import java.util.Scanner;

public class Exceprog3 
{
	static int attempt;
	public static void main(String[] args) 
	{
		int i=4;
		int n=i-attempt;
		// TODO Auto-generated method stub
		Scanner scan= new Scanner(System.in);
		System.out.println("enter the string data");
		String s1=scan.next();
		System.out.println("enter index data");
		int index=scan.nextInt();
		for (attempt=1;attempt<=4;attempt++)
		{
			try
			{
				System.out.println(s1.charAt(index));
				break;
			}
			catch(StringIndexOutOfBoundsException rv)
			{
				System.out.println("invalid index number");
				System.out.println("the range of string is 0 to 3");
				System.out.println("re-enter the index number");
				System.out.println("Remaining attempts are:"+(i-attempt));
				index=scan.nextInt();
			}
		}
		if (i-attempt<=0)
		{
		   System.out.println("the attempts are completed");
		}
	}
}
