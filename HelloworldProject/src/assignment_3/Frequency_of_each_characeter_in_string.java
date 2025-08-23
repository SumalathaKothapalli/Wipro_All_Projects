package assignment_3;
import java.util.Scanner;

public class Frequency_of_each_characeter_in_string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter any string:");
        String str = sc.nextLine();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            boolean alreadyCounted = false;
            for (int j = 0; j < i; j++) {
                if (str.charAt(j) == ch) {
                    alreadyCounted = true;
                    break;
                }
            }
            if (!alreadyCounted) {
                int count = 0;
                for (int k = 0; k < str.length(); k++) {
                    if (str.charAt(k) == ch) {
                        count++;
                    }
                }
                System.out.println(ch + " = " + count);
            }
        }

	}

}
