package Exceptions;

public class MultipleCatch_example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try 
		{
			String name=null;
			System.out.println(name.length());
			int a=10/0;
		}
		catch (NullPointerException e)
		{
			System.out.println("Caught NullPointerException:"+e.getMessage());
		}
		catch (ArithmeticException e)
		{
			System.out.println("CaughtArithmeticException :+cannot divide by zero!");
		}
		catch (Exception e)
		{
			System.out.println("Caught some other exception"+e);
			
		}
		System.out.println("program still runs after exceptions");

	}

}
