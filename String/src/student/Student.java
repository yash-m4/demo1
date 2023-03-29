package student;

public class Student {
int age=19;
}
class UseStudent
{
	int sent()
	{
		Student s=new Student();
		System.out.println(s);
	return 1;
	
	}
}
class StudnetApp
{
	public static void main(String []args)
	{
	UseStudent us=new UseStudent();
	int res=us.sent();
	System.out.println(res);
}
}