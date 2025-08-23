package assignment_3;
import java.util.Scanner;

public class Replace_spaces_with_hyphens {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence:");
        String str = sc.nextLine();
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch == ' ') {
                result += '-';
            } else {
                result += ch;
            }
        }

        System.out.println("Modified Sentence: " + result);

	}

}
