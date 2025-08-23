package Multithreading;
class Shared{
	int num;
	boolean ready=false;
	synchronized void produce(int n) {
		if(ready) return;
		num=n;
		System.out.println("Produced:"+num);
		ready=true;
		notify();
	}
	synchronized void consume() {
		while (!ready) {
			try {wait();}catch (Exception e) {}
			}
		System.out.println("Consumed:"+num);
		}
	}

public class Wait_demo {

	public static void main(String[] args) {
		Shared s=new Shared();
		
	}

}
