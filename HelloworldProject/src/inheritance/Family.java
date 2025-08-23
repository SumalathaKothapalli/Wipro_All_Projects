package inheritance;
class mohan
{
	void surname() 
	{
		System.out.println("Sharma");
	}
	void flat() 
	{
		System.out.println("2BHK flat");
	}
	void car() 
	{
		System.out.println("Baleno car");
	}		
}
class soham extends mohan
{
	void bike()
	{
		System.out.println("pulser");
		
	}
	void job()
	{
		System.out.println("tester");
	}
}

public class Family {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		soham son=new soham();
		System.out.println("soham");
		son.surname();
		son.flat();
		son.bike();
		son.job();

	}

}
