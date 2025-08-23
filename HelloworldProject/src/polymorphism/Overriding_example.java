package polymorphism;
class Animal
{
	void makeSound()
	{
		System.out.println("animal makes sound");
	}
}
class Dog extends Animal
{
	void makeSound()
	{
		System.out.println("dog barks");
	}
	
}

public class Overriding_example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal myAnimal=new Animal();
		Animal myDog=new Dog();
		myAnimal.makeSound();
		myDog.makeSound();

	}

}
