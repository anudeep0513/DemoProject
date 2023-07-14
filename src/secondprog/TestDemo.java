package secondprog;

public class TestDemo 
{
	    int i=0;
	     
	    public static void main(String args[])
	    { 
	        int square = new TestDemo().square(2);
	        System.out.println(square);
	    } 
	     
	    public int square(int value)
	    {
	        return i++*i++;
	    }
}
