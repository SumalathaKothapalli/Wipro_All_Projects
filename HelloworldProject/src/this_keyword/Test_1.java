package this_keyword;

public class Test_1 {
	Test_1(String name)
	{
		System.out.println(name);
	}
	Test_1()
	{
		this("im from Test_1 Parameterized constructor");
		System.out.println("Welcome to my space");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test_1 t=new Test_1();

	}

}
