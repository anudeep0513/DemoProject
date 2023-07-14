package demo;

public class Emp 
{
   int id;
   String n;
   double sal;
   public Emp(int id,String n,double sal)
   {
	   if (id>=100 && id<=999)
	   {
		   this.sal=sal;
		   this.id=id;
		   this.n=n;
       }
	   else
	   {
		   System.out.println("no sufficient data");
	   }
   }
   public void display()
   {
	   System.out.println(this.id);
	   System.out.println(this.n);
	   System.out.println(this.sal);
   }
   
}
