package inheritance;
class vehicle
{
	void type()
	{
		System.out.println("vehicle");
	}
	
}
class four_wheeler extends vehicle
{
	void wheels()
	{
		System.out.println("4 wheelers");
		
	}
	void job()
	{
		System.out.println("tester");
	}
}

public class Multilevel_example {

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