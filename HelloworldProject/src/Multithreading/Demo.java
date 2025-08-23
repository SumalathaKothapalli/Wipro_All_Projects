package Multithreading;
class Demo1 extends Thread
{
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
		System.out.println("Hello");
		}
		System.out.println(Thread.currentThread().getName());
		
	}
}

public class Demo extends Thread{
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
		System.out.println("Welcome");
		}
		System.out.println(Thread.currentThread().getName());
		Thread.yeild();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo t1=new Demo();
		
		

	}

}
