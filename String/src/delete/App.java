package delete;

class Teacher
{
	public void teach()
	{
		System.out.println(" teaching");
	}
}

class physicsTeacher extends Teacher
{
	public void teach()
	{
		System.out.println("physics");
	}
}




public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Teacher ref;
physicsTeacher pt=new physicsTeacher();
ref=pt;
System.out.println(ref);



	}

}
