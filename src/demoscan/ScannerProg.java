package demoscan;
import java.util.Scanner;
public class ScannerProg 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		System.out.println("enter the number....");
		Scanner n1= new Scanner(System.in);
		int i1=n1.nextInt();
		System.out.println(i1);
		System.out.println("enter the fractional value");
		double b1=n1.nextDouble();
		System.out.println(b1);
		System.out.println("enter the singal character");
		char c1=n1.next().charAt(0);
		System.out.println(c1);
		System.out.println("enter the string data");
		String s1=n1.nextLine();
		System.out.println(s1);
		System.out.println("enter the long value");
		long l1=n1.nextLong();
		System.out.println(l1);
   }
}