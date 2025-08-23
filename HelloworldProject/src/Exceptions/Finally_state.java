package Exceptions;

public class Finally_state {
public static void main(String[] args) {
	try {
		int[] a=new int[4];
		System.out.println(a[6]);//ArrayIndexOutOfBoundsException 
		}
	catch(ArrayIndexOutOfBoundsException e)
	{
		System.out.println(e);
	}
	finally
	{
		System.out.println("Important code");
	}
	System.out.println("End");
	}

}
