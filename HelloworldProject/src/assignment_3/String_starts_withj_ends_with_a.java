package assignment_3;
import java.util.Scanner;

public class String_starts_withj_ends_with_a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter a word:");
        String word = sc.next();
        char first = word.charAt(0);
        char last = word.charAt(word.length() - 1);
        if (first == 'j' && last == 'a') {
            System.out.println("Yes, it starts with 'j' and ends with 'a'");
        } else {
            System.out.println("No, it does not match the condition");
        }

	}

}
