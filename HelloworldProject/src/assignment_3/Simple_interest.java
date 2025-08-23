package assignment_3;
import java.util.Scanner;

public class Simple_interest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter Principal:");
        int p = sc.nextInt();
        System.out.println("Enter Rate of Interest:");
        int r = sc.nextInt();
        System.out.println("Enter Time (in years):");
        int t = sc.nextInt();
        float si = (p * r * t) / 100f;
        
        System.out.println("Simple Interest = " + si);

	}

}
