package assignment_3;
import java.util.Scanner;

public class Addition_of_two_num {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number:");
        int a = sc.nextInt();
        System.out.println("Enter second number:");
        int b = sc.nextInt();
        int sum = a + b;
        System.out.println("Sum = " + sum);
	}

}
