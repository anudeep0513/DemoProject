package storywriting;

public class Author 
{
	Book b;
	Pen p;
	public Author(Book b,Pen p)
	{
		this.b=b;
		this.p=p;
	}
		public void creStory()
		{
			b.openBook();
			p.write();
			b.turnPage();
			p.write();
			b.closeBook();
		}
}
