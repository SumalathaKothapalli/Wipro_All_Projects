package assignment_3;
import java.util.Scanner;

public class Area_of_rectangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter Length:");
        int length = sc.nextInt();
        System.out.println("Enter Width:");
        int width = sc.nextInt();
        int area = length * width;
        System.out.println("Area of Rectangle = " + area);

	}

}
