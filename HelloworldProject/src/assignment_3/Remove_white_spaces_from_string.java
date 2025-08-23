package assignment_3;
import java.util.Scanner;

public class Remove_white_spaces_from_string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String str = sc.nextLine();
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ' ') {
                result = result + str.charAt(i);
            }
        }

        System.out.println("String without spaces: " + result);

	}

}
