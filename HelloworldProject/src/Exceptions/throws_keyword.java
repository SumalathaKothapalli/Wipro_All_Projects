package Exceptions;

public class throws_keyword {
	void add(int a,int b)
	{
		int sum=a+b;
		System.out.println("Addiction="+sum);
	}
	void div(int a,int b) throws ArithmeticException
	{
		int div=a/b;
		System.out.println("Addiction="+div);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
