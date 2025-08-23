package assignment;
import java.util.Scanner;

public class Countoftotaldigits_innumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = sc.nextInt();
        int count = 0;
        while (num != 0) {
            int digit = num % 10;
            num /= 10;
            if (digit == 0) {
                continue; 
            }
            count++;
        }
        System.out.println("Total digits  = " + count);
        
	}

}
