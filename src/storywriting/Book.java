package storywriting;

public class Book 
{  
      String tit;
    String an;
    int page;
   public Book(String tit,String an,int page)
   {
	   this.tit=tit;
	   this.an=an;
	   this.page=page;
   }
   public void openBook()
   {
	   System.out.println("open book");
   }
   public void turnPage()
   {
	   System.out.println("in first page");
   }
   public void closeBook()
   {
	   System.out.println("close book");
   }
}
