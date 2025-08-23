package Lambda_functions;
interface Greeting
{
	void sayHello();
}

public class Lambda_Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Greeting greet=()->System.out.println("Hello Students");
		greet.sayHello();

	}

}
