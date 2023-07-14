package secondprog;

import java.util.Scanner;

public class SecondProg 
{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s2="";
		 int count=1;
		System.out.println("enter string");
		Scanner scan=new Scanner(System.in);
		String s1=scan.next();
		System.out.println(s1);
		for (int i=0; i<=s1.length()-1; i++)
		{
			for(int j=1; j<=s1.length()-1; j++)
			{
				if(s1.charAt(i)==s1.charAt(j))
				{
					count++;
				}
				else
				{
					char ch=s1.charAt(i);
					s2=s2+count+ch;
					i=j;
					count=1;
				}
			}
			
		}
		System.out.println(s2);
	}

}
