package Multithreading;
//we can create threading using 
//1.by extending thread class
//2.by implementing runnable interface

public class Mythread {
	void alphabet()
	{
		for(char ch='A';ch<='z';ch++)
			{
			System.out.println(ch+"");
			}
	}
	void numbers()
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println(i+"");
		}
		
	}

	public static void main(String[] args) {
		Mythread my=new Mythread();
		my.alphabet();
		System.out.println();
		my.numbers();

	}

}
