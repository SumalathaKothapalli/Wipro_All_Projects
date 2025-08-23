package Multithreading;
class myrun1 implements Runnable
{
	@Override
	public void run() {
		for (int i=1;i<=5;i++)
		{
			System.out.println("Hello");	
		}
		System.out.println("");
	}
	
}

public class Myrun {

	public static void main(String[] args) {
		myrun1 t=new myrun1();
		Thread t1=new Thread(t);
		Thread t2=new Thread(t);
		t1.start();
		t2.start();

	}

}
