package te;

public class TextBook {
private int PageNo;
void setPageno(int x)
{
	if (x>0)
	{
		PageNo=x;
		
	}
	else
	{
		System.out.println("invalid page no.");
	}
}
int getPageNo()
{
	return PageNo;
}

}

class Book
{
	public static void main(String [] args)
	{
		TextBook newton=new TextBook();
		
		newton.setPageno(-70);
		System.out.println(newton.getPageNo());
	}
}