package polymorphism;
class animal
{
	void eat()
	{
		System.out.println("Eating");
	}
	void sound()
	{
		System.out.println("Sound");
	}
}
class dog extends animal
{
	void sound()
	{
		System.out.println("Sound=Barking");
	}
}
class tiger extends animal
{
	void eat()
	{
		System.out.println("eats=meat");
	}
	void sound()
	{
		System.out.println("sound=roarr");
	}
}
public class Animal_overriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("****dog*****");
		dog max=new dog();
		max.eat();
		
		
		

	}

}
