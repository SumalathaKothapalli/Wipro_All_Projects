package inheritance;
class Vehicle
{
	int speed=70;
}
class car extends Vehicle
{
	int speed=100;
	void showspeed()
	{
		System.out.println("Car normal speed="+speed);
		System.out.println("vehicle normal speed="+super.speed);
	}
	}
public class Sub_class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		car c=new car();
		c.showspeed();

	}

}
