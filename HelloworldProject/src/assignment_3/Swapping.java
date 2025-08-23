package assignment_3;
import java.util.Scanner;

public class Swapping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of x:");
        int x = sc.nextInt();
        System.out.println("Enter value of y:");
        int y = sc.nextInt();
        int temp = x;
        x = y;
        y = temp;
        System.out.println("After Swapping:");
        System.out.println("x = " + x);
        System.out.println("y = " + y);
	}

}
