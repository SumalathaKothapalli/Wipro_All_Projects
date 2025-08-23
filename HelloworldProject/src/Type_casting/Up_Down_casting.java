package Type_casting;
class Test
{
	void show()
	{
		System.out.println("Hello");
	}
}
class Test1 extends Test
{
	void display()
	{
		System.out.println("test1");	
	}
	void show()
	{
		System.out.println("How are you");
	}
}
class Test2 extends Test1
{
	void display()
	{
		System.out.println("Test2");	
	}
}
public class Up_Down_casting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test t1=new Test();
		t1.show();
		Test t=new Test1();//upcasting
		t.show();
		Test1 tt=(Test1)t;//downcasting
		tt.display();
		tt.show();
	}
}



