package Exceptions;

public class Multiple_excep {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(1);
		System.out.println(2);
		try 
		{
			int[] a=new int[4];
			System.out.println(a[6]);
			System.out.println(5/0);
		String str="Hello";
		System.out.println(str.charAt(6));
		}
		catch(StringIndexOutOfBoundsException e)
		{
			System.out.println(e);
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e);
		}
		System.out.println(4);
		System.out.println(5);

	}

}
